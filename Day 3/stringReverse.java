import java.util.*;

public class stringReverse {

    static void swap(char l, char r) {
        char temp = l;
        l = r;
        r = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        sc.close();
        char ch[] = str.toCharArray();
        int l = 0, r = str.length() - 1;
        while (l < r) {
            // // swap(str.charAt(l), str.charAt(r));
            // swap(ch[l], ch[r]);
            char temp = ch[l];
            ch[l] = ch[r];
            ch[r] = temp;
            l++;
            r--;
        }

        System.out.println(ch);
    }
}
