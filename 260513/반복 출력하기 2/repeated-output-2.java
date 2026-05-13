import java.util.*;
import java.io.*;

public class Main {
    public static void star(int n){
        if(n == 0){
            return;
        }
        else{
            System.out.println("HelloWorld");
            star(n-1);
        }
    }
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        star(N);
    }
}