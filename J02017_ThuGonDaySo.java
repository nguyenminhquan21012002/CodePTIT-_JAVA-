import java.util.Scanner;
public class J02017_ThuGonDaySo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int res = n;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            if ((a[i] + a[i + 1]) % 2 == 0) {
                i += 2;
                res -= 2;
            }
        }
        System.out.println(res);
    }

}
