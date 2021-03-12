package easy;

public class SaveThePrisoner {
    static int saveThePrisoner(int n, int m, int s) {
        return ((m - 1) + (s - 1)) % n + 1;
    }
}
