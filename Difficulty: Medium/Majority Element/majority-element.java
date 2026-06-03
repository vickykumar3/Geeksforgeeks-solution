class Solution {
    int majorityElement(int arr[]) {
        // code here
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i<arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
         
        for(Integer key : map.keySet()) {
            if(map.get(key) > arr.length / 2) {
                return key;
            }
        }
         return -1;
    }
}