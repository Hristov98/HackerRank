package easy;

public class PermutationEquation {
    static int[] permutationEquation(int[] p) {
        int[] sequence = new int[p.length];

        for (int i = 0; i < p.length; i++) {
            int x = i + 1;

            for (int j = 0; j < p.length; j++) {
                if (x == p[j]) {
                    for (int k = 0; k < p.length; k++) {
                        if (j + 1 == p[k]) {
                            sequence[i] = k + 1;
                        }
                    }
                }
            }
        }

        return sequence;
    }
}
