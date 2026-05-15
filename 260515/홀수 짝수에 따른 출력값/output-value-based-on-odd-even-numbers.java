import java.util.*;
import java.io.*;

public class Main {
    public static int holjjac(int n){
        if(n <= 0){
            return 0;
        }
        return n + holjjac(n - 2);

    }
    public static void main(String[] args) throws Exception{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        System.out.println(holjjac(n));
    }
}