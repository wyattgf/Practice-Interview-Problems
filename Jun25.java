class Solution {
    public int[] twoSum(int[] nums, int target) {
        int fIndex;
        int sIndex;
        int[] res = new int[2];
        
        for (int i = 0; i < nums.length; i++){
            fIndex = i;
            for (int j = 0; j < nums.length; j++){
                if (i == j) continue;
            
                if (target - nums[i] - nums[j] == 0) {
                    res[0] = i; res[1] = j;
                    return res;
                }
                
            }
            
        }
        
        return res;
    }


    public int[] BettertwoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            int complement = target - nums[i];
            if (map.containsKey(complement)){
                return new int[] {map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No solution!");
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode dummyhead = head;
        int carry = 0;
        while (l1 != null || l2 != null){
            int a = (l1 == null) ? 0 : l1.val;
            int b = (l2 == null) ? 0 : l2.val;
            int sum = a + b + carry;
            head.next = new ListNode(sum % 10);
            carry = sum / 10;
            head = head.next;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        if (carry > 0){
            head.next = new ListNode(carry);
        }

        return (dummyhead.next);


    }

































}