package easy;

public class TheHurdleRace {
    static int hurdleRace(int k, int[] height) {
        int maxHeight = height[0];
        for (int j : height) {
            if (maxHeight < j) {
                maxHeight = j;
            }
        }

        return (maxHeight > k) ? maxHeight - k : 0;
    }
}
