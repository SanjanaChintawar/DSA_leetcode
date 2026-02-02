class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int lowprice = prices[0];
        int buy = 0;
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < lowprice){
                lowprice = prices[i];
                buy = i;
            }
            if((prices[i] - lowprice) > profit && i > buy){
                profit = prices[i] - lowprice;
            }
        }
        return profit;
    }

}