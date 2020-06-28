import java.util.*;


class Solution {
    public int reverse(int x) {
        
        int mult = x<0 ? -1 : 1;
        char[] arr = String.valueOf(Math.abs(x)).toCharArray();
        StringBuilder sb = new StringBuilder("");
        for (int i = arr.length-1; i >=0; i--){
            sb.append(arr[i]);
        }
        try{
            int res = Integer.valueOf(sb.toString()) * mult;
            return res;
        }
        catch(Exception e){
            return 0;
        }
        
    }


    
    public int myAtoi(String str) {
        str = str.trim();
        boolean neg = false;
        StringBuilder st = new StringBuilder("");
        for (char c: str.toCharArray()){
            int as = (int) c;
            if (as == 45 || as >=48 || as<=57) st.append(c);
            if (as == 45) neg = true;
        }
        try{
            return Integer.valueOf(st.toString());
        }
        catch(Exception e){
            int res = neg ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            return res;
        }
    }
    





}