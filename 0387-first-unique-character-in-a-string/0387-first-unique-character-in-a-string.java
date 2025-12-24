class Solution {
    public int firstUniqChar(String s) {
            HashMap<Character, Integer> h=new HashMap<>();
            int x;
            char []s1=s.toCharArray();
            for(char i:s1){
                x=h.getOrDefault(i,0);
                h.put(i,x+1);  
                
            }
            for(int i=0;i<s.length();i++){
                char c=s.charAt(i);
                int f=h.get(c);
                if(f==1){
                    return i;
                }

            }
          
return -1;
    }
}