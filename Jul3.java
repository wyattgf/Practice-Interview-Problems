import java.util.*;

class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> ret = new ArrayList<>();
        backtrack(ret, "", 0, 0,n);
        return ret;
    }
    
    public void backtrack(ArrayList<String> ret, String cur, int open, int close, int max){
        if (cur.length() == max*2){
            ret.add(cur);
            return;
        }
        if (open < max) backtrack(ret, cur+"(", open+1, close, max);
        if (close < open) backtrack(ret, cur+")", open, close+1, max);
        
        
    }
    
}


