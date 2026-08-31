class Solution {
    public void moveZeroes(int[] nums) {
        int zero = 0;
        while(zero<nums.length){
            if(nums[zero]!= 0){
                zero++;
                continue;
            }
            int number = zero+1;
            while(number<nums.length){
                if(nums[number]!=0){
                    int temp = nums[zero];
                    nums[zero] = nums[number];
                    nums[number] = temp;
                    break;
                }else{
                    number++;
                }
            }
            zero++;

        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna