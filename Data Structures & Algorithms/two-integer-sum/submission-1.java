class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer>indices=new HashMap<>();
        for(int i=0;i<nums.length;i++){
           
            int remaining=target-nums[i];
            if(indices.containsKey(remaining)){
                return new int[]{indices.get(remaining),i};
            }else{
                indices.put(nums[i],i);
            }
        }
        return new int[]{};
        
    }
}
