class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> res = new ArrayList<>();
        int l = nums.length / 3;
        Map<Integer, Integer> mp = new HashMap<>();
        for(int num: nums){
            mp.put(num, mp.getOrDefault(num, 0) + 1);
            if(mp.get(num) > l){
                if(res.contains(num)) continue;
                res.add(num);
            }
        }
        return res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna