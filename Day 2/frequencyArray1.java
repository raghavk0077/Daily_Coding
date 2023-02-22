import java.util.*;
public class frequencyArray1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int freq[] = new int[10];

        int temp = n, mod = 0;
        while (temp > 0){
            mod = temp % 10;
            freq[mod]++;
            temp = temp /10;
        }
        System.out.println("number" +" "+ "frequency");
        for(int i = 0; i < 10; i ++){
            if(freq[i] > 0){
                System.out.println(i + "           " + freq[i]);
            }
        }
        sc.close();

    }
}