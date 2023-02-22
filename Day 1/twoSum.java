import java.util.Arrays;

public class twoSum {
    public static void main(String[] args) {
        int arr[] = {0, -1, 2, -3, 1};
        int x = -2;
        // boolean flag = false;
        int n = arr.length;

        // int sum  = 0;
        // for(int i = 0; i < n; i++){
        //     sum = 0;
        //     for(int j = i+1; j < n; j++){
        //         sum = arr[i] + arr[j];
        //         if(sum == x){
        //             flag = true;
        //             System.out.print(i + " " + j);
        //             System.out.println();
        //             break;
        //         }
        //     }
        // }

        // if(flag == true){
        //     System.out.println("YES");
        // }
        // else{
        //     System.out.println("NO");
        // }

        //Two pointer approach
        int sum = 0;
        Arrays.sort(arr);
        int l = 0, r = n - 1;
        while(l < r){
            sum = arr[l] + arr[r];
            if(sum == x){
                // flag = true;
                System.out.println(l + " " + r);
                break;
            }
            else if(sum < x){
                l++;
            }
            else{
                r--;
            }
        }

    }
}
