class Solution {
    public static boolean isPalindrome(String s1) {
    if (s1 == null || s1.isEmpty()) return true;

    int p1 = 0;
    int p2 = s1.length() - 1;

    while (p1 < p2) {
        while (p1 < p2 && !Character.isLetterOrDigit(s1.charAt(p1))) {
            p1++;
        }
        while (p1 < p2 && !Character.isLetterOrDigit(s1.charAt(p2))) {
            p2--;
        }
        if (Character.toLowerCase(s1.charAt(p1)) != Character.toLowerCase(s1.charAt(p2))) {
            return false;
        }

        p1++;
        p2--;
    }
    return true;
}
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna