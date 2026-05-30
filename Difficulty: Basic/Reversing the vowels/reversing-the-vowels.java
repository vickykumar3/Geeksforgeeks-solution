// User function Template for Java

class Solution {
    String modify(String s) {
        // your code here
        char[] arr = s.toCharArray();
        
        int li = 0;
        int ri = arr.length - 1;
        while(li < ri) {
            if(isVowel(arr[li]) && isVowel(arr[ri])) {
                char temp = arr[li];
                arr[li] = arr[ri];
                arr[ri] = temp;
                li++;
                ri--;
            } else if(isVowel(arr[li])) {
                ri--;
            } else if(isVowel(arr[ri])) {
                li++;
            } else {
                li++;
                ri--;
            }
        }
         return new String(arr);
    }
    
      boolean isVowel(char ch) {
          if(ch == 'a' || ch == 'a') {
              return true;
          } else if(ch == 'e' || ch == 'e') {
              return true;
          } else if(ch == 'i' || ch == 'i') {
              return true;
          } else if(ch == 'o' || ch == 'o') {
              return true;
          } else if(ch == 'u' || ch == 'u') {
              return true;
          } else {
             return false;
          }
      }
}