class Solution {
    public ArrayList<Integer> maxOfSubarrays(int[] arr, int k) {
        // code here
        Deque<Integer> dq = new ArrayDeque<>();
        int n = arr.length;
        
        ArrayList<Integer> result = new ArrayList<>();
        
        for (int i=0; i<n; i++) {
            
            while(!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.pollFirst();
            }
            
            while (!dq.isEmpty() && arr[dq.peekLast()] <= arr[i]) {
                dq.pollLast();
            }
             dq.offerLast(i);
             
             if (i >= k - 1) {
                 result.add(arr[dq.peekFirst()]);
             }
        }
           return result;
    }
}