class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        
        int windowSum = 0;
        
        //first window
        for(int i=0; i<k; i++) {
            windowSum += arr[i];
        }
        
        int maxSum = windowSum;
        
        //slide the window
        for(int j=k; j<arr.length; j++){
            
            windowSum += arr[j];
            windowSum -= arr[j-k];
            
            maxSum = Math.max(maxSum, windowSum);
        }
         return maxSum;
    }
}