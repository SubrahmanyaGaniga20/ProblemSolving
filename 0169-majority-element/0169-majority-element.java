class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> h=new HashMap<>();
        int n= nums.length;
        int x1=n/2;
        int x;
        ArrayList<Integer> a=new ArrayList<>();
        for(int i:nums){
            x=h.getOrDefault(i,0);
            h.put(i,x+1);
            if(x+1>x1){
                return i;
           
            }
        }
       

      return 1;  

    }
}