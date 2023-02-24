import java.util.*;
public class countString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        // System.out.println(str.charAt(0) - '0');

        int freq[] = new   int[1000];
        for(int i = 0; i < str.length(); i++){
            freq[str.charAt(i) - 'a']++;
        }


        for(int i = 0; i < str.length(); i++){
            if(freq[str.charAt(i) - 'a'] != 0){
            System.out.println(str.charAt(i) + " " + (freq[str.charAt(i) -  'a']));
            freq[str.charAt(i) - 'a'] = 0;
            }
        }
    }
}
