
import java.util.Scanner;

public class J03007_SoDep2 {

    public static boolean doiXung(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static boolean check8(String s) {
        if (s.charAt(0) == '8' && s.charAt(s.length() - 1) == '8') {
            return true;
        } else {
            return false;
        }
    }

    public static boolean check10(String s) {

        long sum = 0;
        for (int i = 0; i < s.length(); i++) {
            long tmp = Character.getNumericValue(s.charAt(i));
            sum += tmp;
        }
        if (sum % 10 == 0) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {

            String s = sc.next();
            if (doiXung(s) && check10(s) && check8(s)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
