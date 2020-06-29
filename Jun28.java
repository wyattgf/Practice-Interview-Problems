import java.util.*;


class Solution {

    public boolean isPalindrome(int x) {
        String og = String.valueOf(x);
        StringBuilder str = new StringBuilder(og);
        String rev = str.reverse().toString();
        
        if (rev.equals(og)){
            return true;
        }
        return false;
    }

    public boolean NoStringisPalindrome(int x) {
        if (x<0) return false;
        int counter = 0;
       ArrayList<Integer> arr = new ArrayList<>();
              
       while (x > 0){
           arr.add(counter, x%10);
           x /= 10;
       }
       for (int i = 0; i < arr.size()/2; i++){
           if (arr.get(i) != arr.get(arr.size()-i-1)) return false;
       }
       return true;
        
    }



}