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
        String T = st.nextToken();
        char cT[] = T.toCharArray();

        String str1[] = new String[N];
        for(int i = 0; i < N; i++){
            str1[i] = br.readLine();
        }
        
        ArrayList<String> equalStr = new ArrayList<>();
        int count = 0;
        int index = 0;

        for(int i = 0; i < N; i++){
            char c[] = str1[i].toCharArray();
            for(int j = 0; j < T.length(); j++){
                if(c[j] != cT[j]){
                    count++;
                    break;
                }
            }
            if(count == 0){
                equalStr.add(new String(c));
            }
            count = 0;
        }

        String result[] = equalStr.toArray(new String[0]);
        Arrays.sort(result);
        bw.write(result[K-1] + "\n");
        
        bw.flush();
        bw.close();
    }
}