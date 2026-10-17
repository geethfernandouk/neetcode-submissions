class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer,Integer>count=new HashMap<>();
        for(int num:nums){
            count.put(num,count.getOrDefault(num,0)+1);
        }

        List<Integer>keys=new ArrayList<>(count.keySet());
        keys.sort((a,b)->count.get(b)-count.get(a));

        int []results= new int[k];
        for(int i=0;i<k;i++){
            results[i]=keys.get(i);
        }
        return results;
        
    }
}
