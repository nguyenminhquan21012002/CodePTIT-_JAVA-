
import java.util.Scanner;


public class J03010_DiaChiEmail {

    public static String chuanHoa(String s) {
        String[] a = s.split("\\s+");
        String tmp = "";
        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals("")) {
                tmp += a[i].toLowerCase();
                tmp += " ";
            }
        }
        String[]b = tmp.split("\\s+");
        String res ="";
        res += b[b.length - 1];
        for (int i = 0; i < b.length - 1; i++) {
            res += b[i].charAt(0);
        }
        res += "@ptit.edu.vn";
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t  = Integer.parseInt(sc.nextLine());
        while(t-->0)
        {
            String s = sc.nextLine();
            System.out.println(chuanHoa(s));
            
        }
    }

}
