
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class J03038_DanhDauChuCai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Character> set = new HashSet<>();
        String s = sc.next();
        for (int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
        }
        System.out.println(set.size());
    }

}
