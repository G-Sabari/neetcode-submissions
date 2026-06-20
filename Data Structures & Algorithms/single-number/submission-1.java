class Solution {
    public int singleNumber(int[] nums) {
        
        HashSet<Integer> set = new HashSet<>();

        for(int num : nums){
            if(set.contains(num)){
                set.remove(num);
            } else{
                set.add(num);
            }
        }

        for(int n : set){
            return n;
        }

        return -1;
    }
}
