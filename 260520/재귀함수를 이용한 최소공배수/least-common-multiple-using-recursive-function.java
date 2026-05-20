import java.util.*;
import java.io.*;

public class Main {
    public static int minmultiple(int num[], int p, int n){
        // 최대공약수 로직을 재귀로 짜고 마지막에 최소공배수 구하기
        // 최소공배수 로직 : 두 수의 곱 / 최대공약수
        // 최대공약수 로직 : 큰수에서 작은수 나눠서 나머지 0될때까지 반복
        if(n == 0){
            return p;
        }
        p = p * num[n-1] / gcd(p, num[n-1]);
        
        return minmultiple(num, p, n-1);  
    }
    public static int gcd(int a, int b){
        while(true){
            int r = a % b;
            if(r == 0)
                break;
            a = b;
            b = r;
            
        }
        return b;
    }
    public static void main(String[] args) throws Exception{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num[] = new int[n];
        int i = 0;

        while(st.hasMoreTokens()){
            num[i++] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(num);
        
        System.out.println(minmultiple(num, num[n-1], n-1));
    }
}