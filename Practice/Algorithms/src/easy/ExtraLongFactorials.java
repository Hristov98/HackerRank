package easy;

import java.math.BigInteger;

public class ExtraLongFactorials {
    static void extraLongFactorials(int n) {
        BigInteger[] factorials = new BigInteger[n];

        factorials[0] = BigInteger.ONE;
        for (int i = 1; i < n; i++) {
            factorials[i] = factorials[i-1].multiply(BigInteger.valueOf(i+1));
        }

        System.out.println(factorials[n-1]);
    }
}
