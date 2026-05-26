import java.util.*;
import java.io.*;

class Alphabet{
    String code, color;
    int second;

    public Alphabet(String cd, String co, int second){
        this.code = cd;
        this.color = co;
        this.second = second;
    }
}
public class Main {
    public static void main(String[] args) throws IOException{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());

        Alphabet boom = new Alphabet(st.nextToken(), st.nextToken(), Integer.parseInt(st.nextToken()));

        System.out.println("code : " + boom.code + "\ncolor : " + boom.color + "\nsecond : " + boom.second);
        
    }
}