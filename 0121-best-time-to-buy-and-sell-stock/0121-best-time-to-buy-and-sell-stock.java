class Solution {
    public int maxProfit(int[] prices) {
        int mini = prices[0];
        int profit = 0;
        for(int i = 0;i<prices.length;i++){
            if(mini > prices[i]) mini = prices[i];
            profit = Math.max(prices[i] - mini, profit);
        }
        return profit;
        }    
    }

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna