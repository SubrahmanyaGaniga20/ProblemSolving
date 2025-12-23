class Solution {
    public List<Integer> findDuplicates(int[] nums) {
       HashMap<Integer,Integer> h=new HashMap<>();
       ArrayList<Integer> ans=new ArrayList<>();
       int x;
       for(int i:nums){
            x=h.getOrDefault(i,0);
            h.put(i,x+1);
            if(x+1==2){
                ans.add(i);
            }
       }

       
     
   
       return ans;
    }
}