package easy;

public class AppendAndDelete {
    static String appendAndDelete(String s, String t, int k) {
        if (k >= s.length() + t.length()) {
            return "Yes";
        }

        int smallerSize = Math.min(s.length(), t.length());
        int sizeOfMatchingSubstring = 0;
        for (int i = 0; i < smallerSize; i++) {
            if (s.charAt(i) != t.charAt(i)) {
                break;
            }

            sizeOfMatchingSubstring++;
        }

        int charsToDelete = Math.max(s.length() - sizeOfMatchingSubstring, 0);
        int charsToAppend = Math.max(t.length() - sizeOfMatchingSubstring, 0);

        k -= charsToDelete + charsToAppend;
        return (k >= 0 && k % 2 == 0) ? "Yes" : "No";
    }

}
