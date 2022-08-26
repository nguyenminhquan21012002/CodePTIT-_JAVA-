
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
public class J01025_HinhVuong {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();
        int x4 = sc.nextInt();
        int y4 = sc.nextInt();

        int max1 = Math.max(x1, Math.max(x2, Math.max(x3, x4)));
        int min1 = Math.min(x1, Math.min(x2, Math.min(x3, x4)));
        int max2 = Math.max(y1, Math.max(y2, Math.max(y3, y4)));
        int min2 = Math.min(y1, Math.min(y2, Math.min(y3, y4)));

        int res = Math.max(max1 - min1, max2 - min2) * Math.max(max1 - min1, max2 - min2);
        ;
        System.out.println(res);
    }

}
