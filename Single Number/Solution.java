class Solution {
    public int singleNumber(int[] nums) {
        int len = nums.length;
        Map<Integer, Integer> hash = new HashMap<Integer, Integer>(); 
        //int[] hash = new int[9999999];
        for (int i = 0; i < len; i++) {
            if(!hash.containsKey(nums[i]))
                hash.put(nums[i], 0);
        }
        for (int i = 0; i < len; i++) {
            hash.put(nums[i], hash.get(nums[i])+1);
        }
        for (int i = 0; i < len; i++) {
            if (hash.get(nums[i]) == 1) 
                return nums[i];
        }
        return 0;
    }
}
