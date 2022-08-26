
import java.math.BigInteger;
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
public class J03015_HieuSoNguyenLon2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            BigInteger a = sc.nextBigInteger(), b = sc.nextBigInteger();
            if (a.compareTo(b) == -1) {
                for (int i = 0; i < b.toString().length() - (b.subtract(a)).toString().length(); i++) {
                    System.out.print("0");
                }
                System.out.print(b.subtract(a));
            } else {
                for (int i = 0; i < a.toString().length() - (a.subtract(b)).toString().length(); i++) {
                    System.out.print("0");
                }
                System.out.print(a.subtract(b));
            }
            System.out.println("");
        }
    }
}
