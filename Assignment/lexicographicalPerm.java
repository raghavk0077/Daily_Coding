import java.util.ArrayList;
import java.util.Scanner;

public class lexicographicalPerm {

    static void findPermutation(String str, int size, int index, ArrayList<String> result, String temp){
        if(temp.length() == size){
            result.add(temp);
            return;
        }

        


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int index = 0;
        String temp = "";
        ArrayList<String> result = new ArrayList<>();
        int size = str.length();
        findPermutation(str, size, index, result, temp);
    }
}
