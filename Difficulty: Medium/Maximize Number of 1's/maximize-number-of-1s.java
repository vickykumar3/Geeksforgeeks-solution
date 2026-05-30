class Solution {
    public int maxOnes(int arr[], int k) {
        // code here
        int ans = 0;
        
        int i = 0;
        int j = -1; // j+1 to i-1 => i-j-1
        int coziw = 0;
        while(i < arr.length) {
            //acquire
            if(arr[i] == 0) {
                coziw++;
                i++;
            } else {
                i++;
            }
            
            // if invalid realse until you are  valid again
            while(coziw > k) {
                j++;
                if(arr[j] == 0) {
                    coziw--;
                } else {
                    //nothing to do
                }
                
            }
            
            // consider
            int sow = i - j - 1;
            ans = Math.max(ans, sow);
        }
        return ans;
    }
}