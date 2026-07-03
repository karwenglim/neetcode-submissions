class Solution {
    public int removeElement(int[] nums, int val) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            if (nums[0] == val) {
                return 0;
            } else {
                return 1;
            }
        }
        int leftIdx = 0;
        int rightIdx = nums.length - 1;

        while(leftIdx < rightIdx) {
            if (nums[rightIdx] == val) {
                rightIdx --;
                continue;
            }

            if (nums[leftIdx] == val) {
                int temp = nums[leftIdx];
                nums[leftIdx] = nums[rightIdx];
                nums[rightIdx] = temp;
                leftIdx ++;
                rightIdx --;
            } else {
                leftIdx ++;
            }
        }
    if(rightIdx == 0) {
        return 0;
    }
    return rightIdx + 1;   
    }
}