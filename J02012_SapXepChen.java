
import java.util.Scanner;

public class J02012_SapXepChen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int key, i, j;
        int cnt = 0;
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (i = 0; i < n; ++i) {

            j = i;
            while (j > 0 && a[j] < a[j - 1]) {
                int tmp = a[j];
                a[j] = a[j - 1];
                a[j - 1] = tmp;
                j--;
            }
            System.out.print("Buoc " + cnt++ + ": ");
            for (int k = 0; k <= i; k++) {
                System.out.print(a[k] + " ");
            }
            System.out.println("");
        }

    }

}
