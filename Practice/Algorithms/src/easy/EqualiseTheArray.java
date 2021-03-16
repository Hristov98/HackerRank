package easy;

public class EqualiseTheArray {
    static int equalizeArray(int[] arr) {
        int max = -1;
        for (int number : arr) {
            if (max < number) {
                max = number;
            }
        }

        int[] counters = new int[max + 1];
        for (int number : arr) {
            counters[number]++;
        }

        int maxNumber = 0;
        int maxIndex = 0;
        for (int i = 0; i < counters.length; i++) {
            if (maxNumber < counters[i]) {
                maxNumber = counters[i];
                maxIndex = i;
            }
        }

        int changes = 0;
        for (int number : arr) {
            if (number != maxIndex) {
                changes++;
            }
        }

        return changes;
    }
}
