import java.util.*;


class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        String len = "";
        int length = Integer.MAX_VALUE;
        for (int i = 0; i <strs.length; i++){
            if (strs[i].length() < length){
               len = strs[i];
                length = len.length();
            } 
        }
        
        for (int j = 0; j < len.length(); j++){
            
        for (int i = 0; i < strs.length; i++){
            if (len.charAt(j) != strs[i].charAt(j) && j==0 ) return "";
            if (len.charAt(j) != strs[i].charAt(j)) return len.substring(0, j);
            
        }
            
        }
        return len;
    }

    public int threeSumClosest(int[] nums, int target) {
        int diff = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++){
            int low = i+1;
            int high = nums.length-1;
            if (diff ==0) break;
            while(low<high){
                int sum = nums[i] + nums[low] + nums[high];
                if (Math.abs(sum-target) < Math.abs(diff)) diff = target-sum;
                if (sum < target) low++;
                else high--;
                
            }
        }
      return target-diff;  
    }
}