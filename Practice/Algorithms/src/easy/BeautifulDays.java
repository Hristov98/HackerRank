package easy;

public class BeautifulDays {
    static int beautifulDays(int i, int j, int k) {
        int valid = 0;
        for (int day = i; day <= j; day++) {
            int dayCopy = day;
            int reversedNumber = 0;

            while(dayCopy != 0) {
                int digit = dayCopy % 10;
                reversedNumber = reversedNumber * 10 + digit;
                dayCopy /= 10;
            }

            if (Math.abs(day - reversedNumber) % k == 0) {
                valid++;
            }
        }

        return valid;
    }
}
