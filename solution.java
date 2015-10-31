public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map <Integer,Integer> map = new HashMap<Integer, Integer>();
		int[] res = new int[2];
		
		//put all the element into map as key 
    	for (int i = 0; i < numbers.length; i++)
    	    map.put(numbers[i],i);
    	for (int i = 0; i < numbers.length; i++){
    	    //if (target - numbers[i]) is stored in the map,get the index
            if (map.containsKey(target - numbers[i]) && i < map.get(target - numbers[i])){
                res[0] = i + 1;
                res[1] = map.get(target - numbers[i]) + 1;
                return res;
            }
    	}
		return res;
    }
}
