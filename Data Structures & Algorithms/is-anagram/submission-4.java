class Solution {
    public boolean isAnagram(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
    Map<Character, Integer> sMap = new HashMap <>();
	Map<Character, Integer> tMap = new HashMap <>();

	for(int i = 0 ; i < s.length() ; i ++) {
		char currentSChar = s.charAt(i);
		char currentTChar = t.charAt(i);

		if (sMap.containsKey(currentSChar)) {
			sMap.put(currentSChar, sMap.get(currentSChar) + 1);
		} else {
			sMap.put(currentSChar, 1);
		}

		if (tMap.containsKey(currentTChar)) {
			tMap.put(currentTChar, tMap.get(currentTChar) + 1);
		} else {
			tMap.put(currentTChar,1);
		}
	}

	for(Map.Entry<Character,Integer> entry : sMap.entrySet()) {
		char sChar = entry.getKey();
		int sCount = entry.getValue();
		if (!tMap.containsKey(sChar)) {
			return false;
		}
		int tCount = tMap.get(sChar);
		if (tCount != sCount) {
			return false;
		}
	}
	return true;
}

    
}
