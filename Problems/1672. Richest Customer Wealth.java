9.====================1672. Richest Customer Wealth==================================
class Solution {
    public int maximumWealth(int[][] accounts) {
        int max_wealth = 0;
        for (int i = 0; i < accounts.length; i++) {
            int wealth_sum = 0;
            for (int j = 0; j < accounts[i].length; j++)
                wealth_sum += accounts[i][j];
            if (wealth_sum > max_wealth) max_wealth = wealth_sum; //INSTEAD OF THIS WE CAN USE ALSO { Math.max(number1,number2); }
        }
        return max_wealth;
    }
}
