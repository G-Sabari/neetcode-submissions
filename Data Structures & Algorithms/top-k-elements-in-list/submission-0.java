class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);//{1=1,2=2,3=3}
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->map.get(a)-map.get(b));//smallest first

        for(int num : map.keySet()){
            pq.offer(num);//[1]->[1,2]->[1,2,3];

            if(pq.size()>k){
                pq.poll();//removes smallest - 1
            }
        }

        int[] result = new int[k];
        for(int i=k-1;i>=0;i--){
            result[i] = pq.poll();
        }

        return result;
    }
}
