class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length <= 1 ){
            return strs[0];
        }

        StringBuilder res = new StringBuilder();
        String chosenWord = strs[0];
        for(String str : strs) {
            if (str.length() <= chosenWord.length()) {
                chosenWord = str;
            }
        }
        boolean mismatch = false;
        for(int i = 0 ; i < chosenWord.length() ; i ++){
            char currentChar = chosenWord.charAt(i);

            for(String currentString : strs) {
                if(currentString.length() == 0){
                    return "";
                }
                if(currentString.charAt(i) == currentChar){
                    continue;
                } else {
                    mismatch = true;
                    break;
                }
            }
            if (mismatch) {
                break;
            } else {
                res.append(currentChar);
            }
        }
        return res.toString();
    }
}