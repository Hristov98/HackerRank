package easy;

public class FindDigits {
    static int findDigits(int n) {
        int copy = n;
        int divisors = 0;
        while (copy != 0) {
            int digit = copy % 10;
            if (digit != 0 && n % digit == 0) {
                divisors++;
            }

            copy /= 10;
        }

        return divisors;
    }
}
