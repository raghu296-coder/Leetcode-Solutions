class Solution {
    public int subtractProductAndSum(int n) {
        int product = 1;
        int sum=0;
        int r=0;
        while (n > 0){

        
              r=n%10;
            product*=r;
sum=sum+r;
            n=n/10;



        }
         int result = product - sum;
            
        return result;
    }
}