class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder clean =new StringBuilder();
        for(char c: s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                clean.append(Character.toLowerCase(c));
            }
        }
        String word=clean.toString();
        int left=0;
        int right=word.length()-1;
        while(left<right){
            if(word.charAt(left)!=word.charAt(right)){
                return false;
            }left++;
            right--;
        }

        return true;
        
    }
}
