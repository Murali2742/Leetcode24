package day4;

class Solution {
    public int maxProfit(int[] prices) {

        int min =prices[0];
        int profit=0;
        int cost=0;
        int max =Integer.MIN_VALUE;
        int mins=Integer.MIN_VALUE;

        for(int i=0;i<prices.length;i++)
        {

            cost = prices[i]-min;
            if(cost>profit)
            {
                profit=cost;
            }
            if(prices[i]<min)
            {
                min=prices[i];
            }

           
        }
        return profit;
    }
}