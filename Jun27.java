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
        if (str.length() == 0) return 0;
        
       StringBuilder sb = new StringBuilder("");
       boolean neg = false;
       int count = 0;
       
       char c = str.charAt(0);
        
       if(c == '-' || c == '+'){
         count++;  
       } 
       
        
       for (int i = count; i<str.length(); i++){
           if (str.charAt(i) >= '0' && str.charAt(i) <='9') sb.append(str.charAt(i));
           else break;
        
        
       }
        
       if (sb.length() == 0) return 0;
        
       Double val = Double.parseDouble(sb.toString());
        
       if (c == '-'){
          val= val * -1; 
       }
        
       if(val > Integer.MAX_VALUE) return Integer.MAX_VALUE;    
       else if (val < Integer.MIN_VALUE) return Integer.MIN_VALUE*-1;
        
       return (int) Math.round(val);
   }
    





}