class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer>countMap=new HashMap<>();
        for(char c:s.toCharArray()){
            if(countMap.containsKey(c)){
                countMap.put(c,countMap.get(c)+1);
            }else{
            countMap.put(c,1);
            }
        }

        for(char c:t.toCharArray()){
            if(!countMap.containsKey(c)){
                return false;
            }

            else{
                countMap.put(c,countMap.get(c)-1);
            
            }
         if( countMap.get(c)==0){
                countMap.remove(c);
         }
            
        }
        if(countMap.isEmpty()){
            return true;
        }
        return false;

    }
}
