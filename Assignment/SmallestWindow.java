import java.util.Scanner;

public class SmallestWindow{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            if(max < arr[i])
                max = arr[i];
            if(min > arr[i])
                min = arr[i];
        }

        sc.close();

        int startIndex = 0;
        for(int i = 0; i < n - 1; i++){
            if(arr[i+1] > arr[i])
                continue;
            else
                startIndex = i;
                break;

        }

        int endIndex = 0;
        for(int i = n - 1; i >= 1; i--){
            if(arr[i-1] < arr[i])
                continue;
            else
                endIndex = i;
                break;
        }

        

        if(arr[n - 1] < max)
            endIndex = n - 1;
        if(arr[0] > min)
            startIndex = 0;
        System.out.println("Sort the array from index " + startIndex + " to " + endIndex);
    }
}