class Solution {
    public int countDigits(int num) {
        int count=0;
        int original =num;
        while(num>0){
            int current = num%10;
            if(current!=0 && original % current ==0){
                count++;
                
            }
            num=num/10;
        }
        return count;
    }
}