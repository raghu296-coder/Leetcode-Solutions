class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        Double minavg =100.0;
        int left= 0;
        int right = nums.length -1;
         while ( left < right){
            double avg = (nums[left] + nums[right]) / 2.0;
            minavg= Math.min(minavg , avg);
            left++;
            right--;
         }return minavg;
    }
}