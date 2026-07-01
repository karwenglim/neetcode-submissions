class Solution {
    public int[] getConcatenation(int[] nums) {
        int [] res = new int [nums.length * 2];
        int n = nums.length;
        for(int i = 0 ; i < n; i ++){
            res[i] = nums[i];
            res[i+nums.length] = nums[i];
        }
        return res;
    }
}