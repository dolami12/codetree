import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int arr[] = new int[N];
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st1.nextToken());
        }
        Arrays.sort(arr);
        bw.write(arr[K-1] + "\n");
        bw.flush();
        bw.close();
    }
}