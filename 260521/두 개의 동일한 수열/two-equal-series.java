import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
            // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());

        int arr1[] = new int[n];
        int arr2[] = new int[n];
        int i = 0;
        while(st2.hasMoreTokens()){
            arr1[i] = Integer.parseInt(st1.nextToken());
            arr2[i++] = Integer.parseInt(st2.nextToken());
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int count = 0;
        for(i = 0; i < n; i++){
            if(arr1[i] != arr2[i]){
                count++;
                bw.write("No\n");
                break;
            }
        }
        if(count == 0){
            bw.write("Yes\n");
        }
        bw.flush();
        bw.close();
    }
}