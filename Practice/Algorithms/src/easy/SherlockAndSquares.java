package easy;

public class SherlockAndSquares {
    static int squares(int a, int b) {
        int count = 0;

        int number = (int) Math.sqrt(a);
        int square = number * number;
        while (square <= b) {
            if (square >= a) {
                count++;
            }

            number++;
            square = number * number;
        }

        return count;
    }
}
