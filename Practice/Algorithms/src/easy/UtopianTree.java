package easy;

public class UtopianTree {
    static int utopianTree(int n) {
        int height = 1;
        boolean isSpring = true;

        for (int i = 0; i < n; i++) {
            if (isSpring) {
                height *= 2;
                isSpring = false;
            } else {
                height += 1;
                isSpring = true;
            }
        }

        return height;
    }
}
