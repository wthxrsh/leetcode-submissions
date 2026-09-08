class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> mp = new HashMap<>();
        int cnt = 0;
        mp.put(0,1);
        int prefixSum = 0;
        for(int num: nums){
            prefixSum += num;
            if(mp.containsKey(prefixSum - k)) cnt+=mp.get(prefixSum - k);
            mp.put(prefixSum, mp.getOrDefault(prefixSum, 0)+1);
        }
        return cnt;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna