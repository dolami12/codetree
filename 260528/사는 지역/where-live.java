import java.util.*;
import java.io.*;

class person{
    String name;
    String address;
    String region;

    public person(String n, String a, String r){
        this.name = n;
        this.address = a;
        this.region = r;
    }
}
public class Main {
    public static void main(String[] args) throws IOException{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        person[] pr = new person[n];
        for(int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            pr[i] = new person(st.nextToken(), st.nextToken(), st.nextToken());
        }
        Arrays.sort(pr, (a, b) -> a.name.compareToIgnoreCase(b.name));
        
        System.out.println("name " + pr[n-1].name + "\naddr " + pr[n-1].address + "\ncity " + pr[n-1].region);
    }
}