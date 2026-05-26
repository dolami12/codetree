import java.util.*;
import java.io.*;

class product{
    String pname;
    int pcode;
    public product(){
        this.pname = "codetree";
        this.pcode = 50;
    }
    public product(String pname, int pcode){
        this.pname = pname;
        this.pcode = pcode;
    }
}
public class Main {
    public static void main(String[] args) throws IOException{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        product p1 = new product();
        product p2 = new product(st.nextToken(), Integer.parseInt(st.nextToken()));

        System.out.println("product " + p1.pcode + " is " + p1.pname);
        System.out.println("product " + p2.pcode + " is " + p2.pname);
    }
}