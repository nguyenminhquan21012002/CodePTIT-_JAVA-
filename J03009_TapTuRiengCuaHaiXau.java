
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class J03009_TapTuRiengCuaHaiXau {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            TreeSet<String> res1 = new TreeSet<>();
            TreeSet<String> res2 = new TreeSet<>();
            String[] a = sc.nextLine().split("\\s+");
            String[] b = sc.nextLine().split("\\s+");

            for (int i = 0; i < a.length; i++) {
                res1.add(a[i]);
            }

            for (int i = 0; i < b.length; i++) {

                res2.add(b[i]);
            }
            for (String x : res1) {
                if (!res2.contains(x)) {
                    System.out.print(x + " ");
                }

            }
            System.out.println("");
        }

    }
}
