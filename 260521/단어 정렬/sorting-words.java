import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        String str[] = new String[n];
        for(int i = 0; i < n; i++){
            str[i] = br.readLine();
        }
        Arrays.sort(str);

        for(String s : str){
            bw.write(s + '\n');
        }
        bw.flush();
        bw.close();
    }
}