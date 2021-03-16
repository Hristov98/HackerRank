package easy;

public class TaumAndBday {
    public static long taumBday(int b, int w, int bc, int wc, int z) {
        long optimalBlackGiftCost = Math.min(bc, wc + z);
        long optimalWhiteGiftCost = Math.min(wc, bc + z);

        return b * optimalBlackGiftCost + w * optimalWhiteGiftCost;
    }
}
