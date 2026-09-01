class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxOnes = 0;
        int cnt = 0;
        for(int num: nums){
            if(num == 1) cnt++;
            else{
                maxOnes = Math.max(maxOnes, cnt);
                cnt = 0;
            }
        }
        return Math.max(maxOnes, cnt);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna