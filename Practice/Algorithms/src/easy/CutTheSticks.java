package easy;

import java.util.ArrayList;
import java.util.List;

public class CutTheSticks {
    static int[] cutTheSticks(int[] arr) {
        List<Integer> sticksPerIteration = new ArrayList<>();
        sticksPerIteration.add(arr.length);

        int sticksLeft = arr.length;
        while (sticksLeft > 0) {
            int shortest = 1001;
            int currentSticks = 0;
            for (int stick : arr) {
                if (stick > 0 && stick < shortest) {
                    shortest = stick;
                }
            }

            for (int i = 0; i < arr.length; i++) {
                arr[i] -= shortest;
                if (arr[i] > 0) {
                    currentSticks++;
                }
            }

            if (currentSticks > 0) {
                sticksPerIteration.add(currentSticks);
            }
            sticksLeft = currentSticks;
        }

        return sticksPerIteration.stream().mapToInt(x -> x).toArray();
    }
}
