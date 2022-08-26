
import java.util.Scanner;

public class J03024_SoUuThe {

    public static void soUuThe(String s) {
        int chan = 0, le = 0;
        if (s.charAt(0) == '0') {
            System.out.println("INVALID");
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                if ((int) (s.charAt(i)) % 2 == 0) {
                    chan++;
                } else {
                    le++;
                }
            } else {
                System.out.println("INVALID");
                return;
            }
        }
        if (chan != le) {
            if (chan > le && s.length() % 2 == 0) {
                System.out.println("YES");
            } else if (chan > le && s.length() % 2 != 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } else {
            System.out.println("NO");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String s = sc.next();
            soUuThe(s);
        }
    }

}
