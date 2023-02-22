import java.util.*;
public class prefixArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int prefixArray[] = new int[n];
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += arr[i];
            prefixArray[i] = sum;
        }

        for(int i = 0; i < n; i++){
            System.out.print(prefixArray[i] + " ");
        }
        sc.close();
    }
}
