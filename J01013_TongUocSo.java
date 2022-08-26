
import java.util.Scanner;

public class J01013_TongUocSo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        boolean prime[] = new boolean[2000002];
        for (int i = 1; i <= 2000001; i++) {
            prime[i] = true;
        }
        prime[1] = false;
        for (int i = 2; i < Math.sqrt(2000001); i++) {
            if (prime[i] == true) {
                for (int j = i * i; j <= 2000001; j += i) {
                    prime[j] = false;
                }
            }
        }
        long sum = 0;
        while (t-- > 0) {
            int n = sc.nextInt();
            if (prime[n] == true) {
                sum += n;
            } else {
                while (n % 2 == 0) {
                    n /= 2;
                    sum += 2;
                }
                for (int i = 3; i <= n; i += 2) {
                    if (prime[i] == true) {
                        while (n % i == 0) {
                            n /= i;
                            sum += i;

                        }
                        if (prime[n] == true) {
                            sum += n;
                            break;
                        }
                    }
                }
            }
        }
        System.out.println(sum);
    }
}

