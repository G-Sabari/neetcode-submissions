class Solution {
    public int findDuplicate(int[] nums) {
        
        HashSet<Integer> set = new HashSet<>();

        for(int num : nums){
            if(set.contains(num)){
               return num; 
            }
            set.add(num);//{1,2,3}
        }

        return -1;
    }
}
