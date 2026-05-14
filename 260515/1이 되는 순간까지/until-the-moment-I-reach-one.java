import java.util.*;
import java.io.*;

public class Main {
    static int num = 0;
    public static int holjjac(int n){
        if(n > 1){
            if(n % 2 == 0){
                holjjac(n / 2);
                num += 1;
            }
            else{
                holjjac(n / 3);
                num += 1;
            }
        }
        return num;
    }
    public static void main(String[] args) throws Exception{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        System.out.println(holjjac(N));
    }
}