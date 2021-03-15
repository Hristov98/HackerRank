package easy;

public class JumpingOnCloudsRevisited {
    static int jumpingOnClouds(int[] c, int k) {
        int e = 100;
        int currentIndex = 0;
        do {
            currentIndex = (currentIndex + k) % c.length;
            e--;

            if (c[currentIndex] == 1) {
                e -= 2;
            }
        } while (currentIndex != 0);

        return e;
    }
}
