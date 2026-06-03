class Solution {
    public boolean isAnagram(String s, String t) {
        //edge cases
        if(s.length()!=t.length()){
            return false;
        }

        //ASCII values
        int[] count = new int[26];

        for(int i=0;i<s.length();i++){
            count[s.charAt(i)-'a']++;
            count[t.charAt(i)-'a']--;
        }

        //check 0's
        for( int val : count){
            if(val!=0){
                return false;
            }
        }

        return true;
    }
}
