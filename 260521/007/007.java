import java.util.*;
import java.io.*;

class c{
        String seccode, place;
        int time;

        public c(String s, String p, int t){
            this.seccode = s;
            this.place = p;
            this.time = t;
        }
    }
public class Main {
    
    public static void main(String[] args) throws IOException{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        c c1 = new c(st.nextToken(), st.nextToken(), Integer.parseInt(st.nextToken()));

        bw.write("secret code : " + c1.seccode + "\n");
        bw.write("meeting point : " + c1.place + "\n");
        bw.write("time : " + c1.time + "\n");
        bw.flush();
        bw.close();
    }
}