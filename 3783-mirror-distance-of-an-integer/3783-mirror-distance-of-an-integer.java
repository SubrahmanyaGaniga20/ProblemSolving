class Solution {
    public int mirrorDistance(int n) {
        int rem=0;
        int rev=0;
        int n1=n;

        while(n1>0){
             rem=n1%10;
             n1=n1/10;
             rev=rev*10+rem;
        }  
     return Math.abs(n-rev);
       
    }
}