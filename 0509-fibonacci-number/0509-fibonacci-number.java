class Solution {
    public int fib(int n) {
        if(n<=1) return n;
        int l = fib(n-1);
        int sl = fib(n-2);
        return l+sl;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna