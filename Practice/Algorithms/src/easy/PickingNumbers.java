package easy;

import java.util.Collections;
import java.util.List;

public class PickingNumbers {
    public static int pickingNumbers(List<Integer> a) {
        Collections.sort(a);

        int longestSubArraySize = 0;
        for (int i = 0; i < a.size() - 1; i++) {
            int currentLongestSize = 0;
            for (int j = i; j < a.size(); j++) {
                if (a.get(j) - a.get(i) <= 1) {
                    currentLongestSize++;
                }
            }

            if (currentLongestSize > longestSubArraySize) {
                longestSubArraySize = currentLongestSize;
            }
        }

        return longestSubArraySize;
    }
}
