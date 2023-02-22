import java.util.*;
public class maxElementInWindow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        int max = 0;
        for(int i = 0; i < k; i++){
            if(max < arr[i])
                max = arr[i];
        }

        for(int i = k; i < n; i++){
            System.out.print(max + " ");
            if(max < arr[i])
                max = arr[i];
        }
        System.out.print(max);
    }
}
