/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author QuanNM
 */
public class J03004_ChuanHoaXauHoTen1 {

    public static String chuanHoa(String s) {
        String[] a = s.split("\\s+");
        String tmp = "";
        for (int i = 0; i < a.length; i++) {

            if (!a[i].equals("")) {
                tmp += Character.toUpperCase(a[i].charAt(0));
                for (int j = 1; j < a[i].length(); j++) {
                    tmp += Character.toLowerCase(a[i].charAt(j));
                }
                tmp += " ";
            }
        }
        return tmp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {

            String s = sc.nextLine();
            System.out.println(chuanHoa(s));
        }

    }

}
