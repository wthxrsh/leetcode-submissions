class Solution {
    public int reverse(int n) {
        int x = n;
        n = Math.abs(n);
        int res = 0;
        int count = (int) (Math.log10(n)+1);
        while(n != 0){
            res += Math.pow(10, count-1)*(n%10);
            n /= 10;
            count--;
        }
        if(res >Integer.MAX_VALUE - 1) return 0;
        if(x<0) res *= (-1);
        return res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna