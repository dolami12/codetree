import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String s = br.readLine();

        char [] c = s.toCharArray();
        Arrays.sort(c);
        s = new String(c);
        bw.write(s + '\n');
        bw.flush();
    }
}