import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int arr[] = new int [N];
        int i = 0;

        while(st.hasMoreTokens()){
            arr[i++] = Integer.parseInt(st.nextToken());
        }
        ArrayList<Integer> midarr = new ArrayList<Integer>();

        for(i = 0; i < N; i++){
            midarr.add(arr[i]);
            if((i+1) % 2 != 0){
                Integer midstr[] = midarr.toArray(new Integer[0]);
                Arrays.sort(midstr);
                bw.write(midstr[i/2] +" ");
            }
        }
        bw.flush();
        bw.close();
    }
}