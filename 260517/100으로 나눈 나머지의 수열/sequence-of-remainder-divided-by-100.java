import java.util.*;
import java.io.*;

public class Main {
    public static int suyeol(int n){
        if(n == 1){
            return 2;
        }
        else if(n == 2){
            return 4;
        }
        return suyeol(n-1) * suyeol(n-2) % 100;
    }
    public static void main(String[] args) throws Exception{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        bw.write(suyeol(n) + "\n");
        bw.flush();
    }
}