class Solution {
    public List<Integer> findDuplicates(int[] nums) {
       HashMap<Integer,Integer> h=new HashMap<>();
       int x;
       for(int i:nums){
            x=h.getOrDefault(i,0);
            h.put(i,x+1);
       }

       ArrayList<Integer> ans=new ArrayList<>();
       for(Integer i:h.keySet()){
        if(h.get(i)==2){
            ans.add(i);
        }
       }
   
       return ans;
    }
}