import java.util.*;
import java.io.*;

public class Main {
    public static void star(int n){
        if(n == 0){
            return;
        }
        else{
            star(n-1);
            for(int i = 0; i < n; i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) throws Exception{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        star(N);
    }
}