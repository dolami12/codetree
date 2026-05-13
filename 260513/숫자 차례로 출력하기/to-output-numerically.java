import java.util.*;
import java.io.*;

public class Main {
    public static void asc(int N){
        for(int i = 1; i <= N; i++){
            System.out.print(i + " ");
        }
    }
    public static void desc(int N){
        for(int i = N; i >= 1; i--){
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) throws Exception{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        asc(N);
        System.out.println();
        desc(N);
    }
}