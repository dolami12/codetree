import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int arr[] = new int[2*N];

        int i = 0;
        while(st.hasMoreTokens()){
            arr[i++] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int res[] = new int[N];
        for(i = 0; i < N; i++){
            res[i] = arr[i] + arr[2*N-i-1];
        }
        Arrays.sort(res);

        bw.write(res[N-1] + "\n");
        bw.flush();
        bw.close();
    }
}