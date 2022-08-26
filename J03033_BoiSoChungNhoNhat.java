
import java.math.BigInteger;
import java.util.Scanner;

public class J03033_BoiSoChungNhoNhat {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {

            BigInteger a = sc.nextBigInteger(), b = sc.nextBigInteger();
            BigInteger mul = a.multiply(b);
            BigInteger gcd = a.gcd(b);
            BigInteger lcm = mul.divide(gcd);
        }

    }
}
