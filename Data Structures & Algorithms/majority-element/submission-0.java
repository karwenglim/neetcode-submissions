class Solution {
    public int majorityElement(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        Map <Integer,Integer> hMap = new HashMap <>();

        for(int i = 0 ; i < nums.length ; i ++){
            int currentNumber = nums[i];
            if (hMap.containsKey(currentNumber)){
                hMap.put(currentNumber, hMap.get(currentNumber) + 1);
            } else {
                hMap.put(currentNumber, 1);
            }
        }

        int majorityElement = nums[0];
        for(Map.Entry<Integer,Integer> entrySet : hMap.entrySet()){
            int number = entrySet.getKey();
            int occurence = entrySet.getValue();

            int currentOcc = hMap.get(majorityElement);

            if (occurence > currentOcc) {
                majorityElement = number;
            }
        }
        return majorityElement;
    }
}