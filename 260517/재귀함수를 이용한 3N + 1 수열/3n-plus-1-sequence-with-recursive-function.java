import java.util.Scanner;
public class Main {
    static int num = 0;
    public static void holjjac(int n){
        if(n == 1){
            return;
        }
        else if(n % 2 == 0){
            num += 1;
            holjjac(n/2);
        }
        else{
            num += 1;
            holjjac(n*3 + 1);
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        holjjac(n);
        System.out.println(num);
    }
}