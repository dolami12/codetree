import java.util.*;
import java.io.*;

public class Main {
    static int sum = 0;
    public static int fibo(int n){
        if(n >= 1){
            sum = sum + n;
            fibo(n-1);
        }
        return sum;
    }
    public static void main(String[] args) throws Exception{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        System.out.println(fibo(N));
    }
}