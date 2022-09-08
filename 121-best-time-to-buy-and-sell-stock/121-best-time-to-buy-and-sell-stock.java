class Solution {
    public int maxProfit(int[] prices) {
     /* int n=prices.length;
       int []left=new int[n];
       int []right=new int[n];
       left[0]=prices[0];
        right[prices.length-1]=prices[n-1];
        for(int i=1;i<n;i++){
           left[i]=Math.min(left[i-1],prices[i]);
        }
        for(int i=n-2;i>=0;i--){
            right[i]=Math.max(right[i+1],prices[i]);
        }
        int max=0;
        for(int i=0;i<n;i++){
            max=Math.max(max,right[i]-left[i]);
        }
        return max;*/
        int minPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<minPrice)
                minPrice=prices[i];
            maxProfit=Math.max(prices[i]-minPrice,maxProfit);
        }
      return maxProfit;
        
    }
}