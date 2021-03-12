package easy;

public class CircularArrayRotation {
    static int[] circularArrayRotation(int[] a, int k, int[] queries) {
        int[] results = new int[queries.length];
        int fixedK = k % a.length;

        for (int i = 0; i < queries.length; i++) {
            int newIndex = queries[i] - fixedK >= 0 ? queries[i] - fixedK : a.length + queries[i] - k;

            results[i] = a[newIndex];
        }

        return results;
    }
}
