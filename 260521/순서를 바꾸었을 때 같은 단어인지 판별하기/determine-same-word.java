import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str1 = br.readLine();
        String str2 = br.readLine();

        char c1[] = str1.toCharArray();
        char c2[] = str2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        String res1 = new String(c1);
        String res2 = new String(c2);

        if(res1.equals(res2)){
            bw.write("Yes\n");
        }
        else{
            bw.write("No\n");
        }
        bw.flush();
        bw.close();
    }
}