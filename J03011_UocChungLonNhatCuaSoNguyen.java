
import java.math.BigInteger;
import java.util.Scanner;

public class J03011_UocChungLonNhatCuaSoNguyen {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            BigInteger a = sc.nextBigInteger(), b = sc.nextBigInteger();
            System.out.println(a.gcd(b));
        }
    }
}
