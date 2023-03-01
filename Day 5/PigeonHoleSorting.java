import java.util.Scanner;

public class PigeonHoleSorting{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        sc.close();

        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            if(arr[i] > max)
                max = arr[i];
            if(arr[i] < min)
                min = arr[i];
        }

        
        int res = max - min + 1;
        int result[] = new int[res];

        // result[0] = min;
        // result[res - 1] = max;
        for(int i = 0; i < n ; i++){
            int pos = arr[i] - min;
            result[pos] = arr[i];
        }

        for(int i = 0; i < res; i++){
            if(result[i] == 0)
                continue;
            else
            System.out.print(result[i] + " ");
        }
    }
}