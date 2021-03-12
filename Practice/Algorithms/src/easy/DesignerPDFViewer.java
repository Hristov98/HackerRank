package easy;

public class DesignerPDFViewer {
    static int designerPdfViewer(int[] h, String word) {
        int maxHeightInWord = -1;

        for (char letter : word.toCharArray()) {
            if (h[letter - 'a'] > maxHeightInWord) {
                maxHeightInWord = h[letter - 'a'];
            }
        }

        return maxHeightInWord * word.length();
    }
}
