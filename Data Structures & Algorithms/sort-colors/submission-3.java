class Solution {
    public void sortColors(int[] nums) {
        if(nums.length <= 1){
            return;
        }
        Map <Integer, Integer> numMap = new HashMap <>();

        for(int num : nums ){
            if(numMap.containsKey(num)){
                numMap.put(num, numMap.get(num) + 1);
            } else {
                numMap.put(num, 1);
            }
        }
        int numsPtr = 0;
        int length = nums.length;
        int currentNum = 0;

        for(; currentNum < 3 ; currentNum ++){
            if(numMap.containsKey(currentNum)){
                int occ = numMap.get(currentNum);
                for(int i = 0 ; i < occ ; i ++){
                    nums[numsPtr] = currentNum;
                    numsPtr ++;
                }
            }
        }
    }
}
