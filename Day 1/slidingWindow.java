public class slidingWindow{
    public static void main(String[] args) {
        int arr[] = {100,200,300,400};
        int size = arr.length;
        int k = 2;

        int sum = 0, maxSum = 0;
        // for(int i = 0; i < size - k + 1; i++){
        //     sum = 0;
        //     for(int j = 0; j < k; j++){
        //         sum += arr[i+j];
        //     }
        //     maxSum = Math.max(sum, maxSum);
        // }
        // System.out.println(maxSum);

        for(int i = 0; i < k; i++){
            sum += arr[i];
        }
        maxSum = sum;

        for(int i = 0; i < size - k; i++){
            sum = sum - arr[i] + arr[k + i];
            maxSum = Math.max(maxSum, sum);
        }

        System.out.println(maxSum);
    }
}