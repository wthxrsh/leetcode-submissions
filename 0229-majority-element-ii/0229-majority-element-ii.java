class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int cnt1 = 0, cnt2 = 0, el1 = Integer.MIN_VALUE, el2 = Integer.MIN_VALUE;
        for(int num: nums){
            if(cnt1 == 0 && el2 != num){

            
            el1 = num;
            cnt1 = 1;
            }
            else if(cnt2 == 0 && el1 != num) {
                el2 = num;
                cnt2 = 1;
            }
            else if(num == el1) cnt1++;
            else if(num == el2) cnt2++;
            else{
                cnt1--;
                cnt2--;
            }
        }
        cnt1 = 0; cnt2 = 0;
            for(int num: nums){
                if(el1 == num) cnt1++;
                else if(el2 == num) cnt2++;
            }
            List<Integer> res = new ArrayList<>();
            if(cnt1 > (nums.length / 3)) res.add(el1);
            if(cnt2 > (nums.length / 3)) res.add(el2);
            return res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna