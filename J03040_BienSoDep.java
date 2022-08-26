
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author QuanNM
 */
public class J03040_BienSoDep {

    public static boolean tangChat(String s) {
        if ((int) s.charAt(5) < (int) s.charAt(6) && (int) s.charAt(6) < (int) s.charAt(7) && (int) s.charAt(7) < (int) s.charAt(9) && (int) s.charAt(9) < (int) s.charAt(10)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean bangNhau(String s) {
        if ((int) s.charAt(5) == (int) s.charAt(6) && (int) s.charAt(6) == (int) s.charAt(7) && (int) s.charAt(9) == (int) s.charAt(10)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean locPhat(String s) {
        for (int i = 5; i < 11; i++) {
            if (i == 8) {
                i += 1;
                continue;
            }
            if (s.charAt(i) != '6' && s.charAt(i) != '8') {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String s = sc.next();
            if (tangChat(s) || bangNhau(s) || locPhat(s)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

}
