import java.util.*;
import java.io.*;

class agent{
    String codename;
    int score;
    public agent(String c, int s){
        this.codename = c;
        this.score = s;
    }
}

public class Main {
    public static void main(String[] args) throws IOException{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        agent agent5[] = new agent[5];
        for(int i = 0; i < 5; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            agent5[i] = new agent(st.nextToken(), Integer.parseInt(st.nextToken()));
        }
        int min = agent5[0].score;
        String mincodename = agent5[0].codename;
        for(int i = 1; i < 5; i++){
            if(min > agent5[i].score){
                min = agent5[i].score;
                mincodename = agent5[i].codename;
            }
        }
        System.out.println(mincodename + " " + min);
    }
}