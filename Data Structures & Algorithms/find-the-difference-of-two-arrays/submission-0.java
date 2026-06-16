class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        HashSet<Integer> set1 = new HashSet<>();//Unique value stores
        HashSet<Integer> set2 = new HashSet<>();//fast lookup

        for(int num : nums1){
            set1.add(num);//{1,2,3}
        }

        for(int num : nums2){
            set2.add(num);//{2,4,6}
        }

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        for(int num : set1){
            if(!set2.contains(num)){
                list1.add(num);
            }
        }

        for(int num : set2){
            if(!set1.contains(num)){
                list2.add(num);
            }
        }

        List<List<Integer>> ans = new ArrayList<>();

        ans.add(list1);
        ans.add(list2);

        return ans;


    }
}