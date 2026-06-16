class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for(int num : nums1){
            set1.add(num);//{1,2}
        }   

        for(int num : nums2){
            set2.add(num);//{2}
        }

        List<Integer> list = new ArrayList<>();
        for(int num : set1){
            if(set2.contains(num)){
                list.add(num);
            }
        }

        int[] ans = new int[list.size()];

        for(int i=0;i<list.size();i++){
            ans[i] = list.get(i);
        }

        return ans;

        
    }
}