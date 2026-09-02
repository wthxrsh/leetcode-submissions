class Solution {
    public int singleNumber(int[] nums) {
        int xor = 0;
        for(int num: nums){
            xor ^= num;
        }
        return xor;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna