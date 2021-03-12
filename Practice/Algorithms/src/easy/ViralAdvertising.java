package easy;

public class ViralAdvertising {
    static int viralAdvertising(int n) {
        int shares = 5;
        int likes = (int) Math.floor(shares / 2.0);
        int cumulative = likes;

        for (int i = 1; i < n; i++) {
            shares = likes * 3;
            likes = (int) Math.floor(shares / 2.0);
            cumulative += likes;
        }

        return cumulative;
    }

}
