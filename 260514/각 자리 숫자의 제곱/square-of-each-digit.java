import java.util.*;
import java.io.*;

public class Main {
    static double sum = 0;
    public static double square(int n){
        if(n > 0){
            sum = sum + Math.pow(n%10,2);
            square(n / 10);
        }
        return sum; 

    }
    public static void main(String[] args) throws Exception{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        Double result = square(N);
        System.out.println(result.intValue());
    }
}