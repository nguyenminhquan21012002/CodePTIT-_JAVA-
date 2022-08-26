
import java.util.Scanner;

public class J03006_SoDep1 {

    public static boolean doiXung(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkSoSan(String s) {
      
        long sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum += (int) s.charAt(i);
        }
        if (sum % 10 != 0) {
            return false;
        }
        else
            return true;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {

            String s = sc.next();
            if (doiXung(s) && checkSoSan(s)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
