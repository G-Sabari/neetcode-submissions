class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs==null || strs.length==0){
            return new ArrayList<>();
        }
        HashMap<String,List<String>> map = new HashMap<>();
        for(String s : strs){//"act"
            char[] chars = s.toCharArray();//['a','c','t'];
            Arrays.sort(chars);//['a','c','t'];
            String key = new String(chars);//'act'

            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
