class Solution {
    public int[] sortArray(int[] nums) {
        nums = mergeSort(nums);
        return nums;
    }

    public int[] mergeSort(int[] nums) {
        if(nums.length <= 1) {
            return nums;
        }

        int length = nums.length;
        int middle = length / 2;

        int leftPtr = 0, rightPtr = 0;

        int[] leftArr = new int [middle];
        int[] rightArr = new int [length - middle];

        for(int i = 0 ; i < nums.length ; i ++){
            if(i < middle){
                leftArr[leftPtr] = nums[i];
                leftPtr ++;
            } else {
                rightArr[rightPtr] = nums[i];
                rightPtr ++;
            }
        }

        leftArr = mergeSort(leftArr);
        rightArr = mergeSort(rightArr);
        merge(leftArr, rightArr, nums);
        return nums;
    }

    public void merge(int[] leftArr, int[] rightArr, int[] oriArr) {
        int leftPtr = 0, rightPtr = 0, oriPtr = 0;
        int leftLength = leftArr.length, rightLength = rightArr.length;

        while(leftPtr < leftLength && rightPtr < rightLength) {
            int leftNum = leftArr[leftPtr];
            int rightNum = rightArr[rightPtr];

            if(leftNum < rightNum) {
                oriArr[oriPtr] = leftNum;
                oriPtr ++;
                leftPtr ++;
            } else {
                oriArr[oriPtr] = rightNum;
                oriPtr ++;
                rightPtr ++;
            }
        }

        while(leftPtr < leftLength) {
            oriArr[oriPtr] = leftArr[leftPtr];
            oriPtr ++;
            leftPtr ++;
        }

        while(rightPtr < rightLength) {
            oriArr[oriPtr] = rightArr[rightPtr];
            oriPtr++;
            rightPtr ++;
        }
    }
}