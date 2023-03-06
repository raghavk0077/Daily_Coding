import java.util.Scanner;

public class findPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = i+1;
        }
        int prime = 2;
        for(int i = prime; i <= Math.sqrt(n); i++){
            for(int j = 0; j < n; j++){
                if(arr[j] % i == 0 && arr[j] != i)
                    arr[j] = 0;
            }
            // System.out.println(i);
        }

        for(int i = 0; i < n; i++){
            if(arr[i] != 0 && arr[i] != 1)
                System.out.print(arr[i] + " ");
        }
    }
}
