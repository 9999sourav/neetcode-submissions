class Solution {
    public int[] twoSum(int[] nums, int target) {
        int point1=0;
        int point2=nums.length-1;
        Map<Integer,Integer> sortedMap = new HashMap<Integer, Integer>();
        for(int i=0;i<nums.length; i++){
            sortedMap.put(nums[i], i);
        }
        for(int i=0;i<nums.length;i++){
            int diff = target-nums[i];
            if(sortedMap.containsKey(diff) && sortedMap.get(diff) !=i){
                return new int[] {i,sortedMap.get(diff)};
            }
        }
    return new int[0];
 }
}
