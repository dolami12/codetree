import java.util.*;
import java.io.*;

public class Main {
    
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        Integer arr[] = new Integer [n];

        int i = 0;
        while(st.hasMoreTokens()){
            arr[i++] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        for(int p : arr){
            bw.write(p + " ");
        }
        bw.write('\n');
        Arrays.sort(arr, (s1, s2) -> Integer.compare(s2, s1));
        for(int p : arr){
            bw.write(p + " ");
        }
        bw.write("\n");
        bw.flush();

    }
}