import java.util.*;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] arr = s.toCharArray();
        int index = 0;
        int max = 0;
        Set<Character> set = new HashSet<>();
        
        for (int i = 0; i < arr.length; i++){
            Character str = arr[i];
            int size = set.size();
            set.add(str);
            if (size != set.size()){
                max = Math.max(max, set.size());
            }
            else {
                max = Math.max(max, set.size());
                index++;
                i = index-1;
                set.clear();
            }
        }
        return max;



}


public int BetterlengthOfLongestSubstring(String s) {
    int res = 0, left = 0, right = 0 ;
    Set<Character> set = new HashSet<>();
    while (left < s.length() && right < s.length()){
        Character c = s.charAt(right);
        
        if (!set.contains(c)){
            set.add(c);
            res = Math.max(res, set.size());
            right++;
        }
        else{
            set.remove(s.charAt(left));
             left++;
        }
        
        
    }
    return res;
}


public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    //merge arrays
    List<Integer> list = new ArrayList<>(nums1.length + nums2.length);
    for (int i = 0; i < nums1.length; i++){
        list.add(i, nums1[i]);
    }
    for (int i = 0; i < nums2.length; i++){
        list.add(i+nums1.length, nums2[i]);
    }
    

    Collections.sort(list);
    //calc index of median
    int index = list.size() / 2;
    //even, length/2 & length/2 - 1
    if (list.size() % 2 == 0){
        
        double ans = (list.get(index) + list.get(index-1) )/2.0;
        return ans;
    }
    //odd,  int(length/2)
    else{
        return list.get(index);
    }
}



int size = s.length();
int left = 0, right = size, max = -1;
String pal = "";

while (left < size && right >= 0 ){
    String run = s.substring(left,right);
    if (run.length() < max){
        right = size;
        left++;
    }
    else if(isTextPalindrome(run)){
            pal = run;
            max = pal.length();
            right = size;
            left++;
    }
    else{
        right--;
    }
    
}
return pal;
}







public static boolean isTextPalindrome(String text) {
if (text == null) {
return false;
}
int left = 0;
int right = text.length() - 1;
while (left < right) {
if (text.charAt(left++) != text.charAt(right--)) {
    return false;
}
}
return true;
}








}