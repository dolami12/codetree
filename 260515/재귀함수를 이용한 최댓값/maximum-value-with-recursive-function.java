import java.util.Scanner;
public class Main {
    static int maxres = 0;
    public static int max(int arr[], int n){
        n = n-1;
        if(n < 0){
            return maxres;
        }
        else if(maxres < arr[n]){
            maxres = arr[n];
        }
        return max(arr, n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(max(arr, n));
        // Please write your code here.
    }
}