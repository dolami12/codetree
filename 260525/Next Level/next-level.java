import java.util.*;
import java.io.*;

class user{
    String id;
    int level;

    public user(){
        this.id = "codetree";
        this.level = 10;
    }
    public user(String id, int level){
        this.id = id;
        this.level = level;
    } 
}
public class Main {
    public static void main(String[] args) throws IOException{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        user user1 = new user();
        user user2 = new user(st.nextToken(), Integer.parseInt(st.nextToken()));

        System.out.println("user " + user1.id + " lv "  + user1.level);
        System.out.println("user " + user2.id + " lv "  + user2.level);
    }
}