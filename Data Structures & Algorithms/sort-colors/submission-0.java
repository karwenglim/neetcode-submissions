class Solution {
    public void sortColors(int[] nums) {
        mergeSort(nums);
    }

    public void mergeSort(int[] nums) {
        if(nums.length <= 1){
            return;
        }

        int leftP = 0, rightP = 0;
        int length = nums.length;
        int middle = length / 2;

        int [] leftArr = new int [middle];
        int [] rightArr = new int [length-middle];

        for(int i = 0 ; i < length ; i ++){
            if (i < middle) {
                leftArr[leftP] = nums[i];
                leftP ++;
            } else {
                rightArr[rightP] = nums[i];
                rightP ++;
            }
        }

        mergeSort(leftArr);
        mergeSort(rightArr);
        merge(leftArr, rightArr, nums);
    }

    public void merge(int[] leftArr, int[] rightArr, int[] oriArr) {
        int oriP = 0, leftP = 0, rightP = 0;
        int length = oriArr.length;
        int leftLength = leftArr.length;
        int rightLength = rightArr.length;
        while(leftP < leftLength && rightP < rightLength) {
            int currentLeft = leftArr[leftP];
            int currentRight = rightArr[rightP];

            if (currentLeft < currentRight) {
                oriArr[oriP] = currentLeft;
                oriP ++;
                leftP ++;
            } else {
                oriArr[oriP] = currentRight;
                oriP ++;
                rightP ++;
            }
        }

        while(leftP < leftLength) {
            oriArr[oriP] = leftArr[leftP];
            oriP ++;
            leftP ++;
        }

        while(rightP < rightLength) {
            oriArr[oriP] = rightArr[rightP];
            oriP ++;
            rightP ++;
        }
    }
}