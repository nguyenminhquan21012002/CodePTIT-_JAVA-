
import java.util.Scanner;

public class J03021_DienThoaiCucGach {

    public static boolean doiXung(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static String xuLyString(String s) {
        String res = "";
        String tmp = "";
        for (int i = 0; i < s.length(); i++) {
            tmp += Character.toLowerCase(s.charAt(i));
        }
        for (int i = 0; i < tmp.length(); i++) {
            if (tmp.charAt(i) == 'a') {
                res += '2';
            }
            if (tmp.charAt(i) == 'b') {
                res += '2';
            }
            if (tmp.charAt(i) == 'c') {
                res += '2';
            }
            if (tmp.charAt(i) == 'd') {
                res += '3';
            }
            if (tmp.charAt(i) == 'e') {
                res += '3';
            }
            if (tmp.charAt(i) == 'f') {
                res += '3';
            }
            if (tmp.charAt(i) == 'g') {
                res += '4';
            }
            if (tmp.charAt(i) == 'h') {
                res += '4';
            }
            if (tmp.charAt(i) == 'i') {
                res += '4';
            }
            if (tmp.charAt(i) == 'j') {
                res += '5';
            }
            if (tmp.charAt(i) == 'k') {
                res += '5';
            }
            if (tmp.charAt(i) == 'l') {
                res += '5';
            }
            if (tmp.charAt(i) == 'm') {
                res += '6';
            }
            if (tmp.charAt(i) == 'n') {
                res += '6';
            }
            if (tmp.charAt(i) == 'o') {
                res += '6';
            }
            if (tmp.charAt(i) == 'p') {
                res += '7';
            }
            if (tmp.charAt(i) == 'q') {
                res += '7';
            }
            if (tmp.charAt(i) == 'r') {
                res += '7';
            }
            if (tmp.charAt(i) == 's') {
                res += '7';
            }
            if (tmp.charAt(i) == 't') {
                res += '8';
            }
            if (tmp.charAt(i) == 'u') {
                res += '8';
            }
            if (tmp.charAt(i) == 'v') {
                res += '8';
            }
            if (tmp.charAt(i) == 'w') {
                res += '9';
            }
            if (tmp.charAt(i) == 'x') {
                res += '9';
            }
            if (tmp.charAt(i) == 'y') {
                res += '9';
            }
            if (tmp.charAt(i) == 'z') {
                res += '9';
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String s = sc.nextLine();

            String res = xuLyString(s);
            if (doiXung(res)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

    }
}
