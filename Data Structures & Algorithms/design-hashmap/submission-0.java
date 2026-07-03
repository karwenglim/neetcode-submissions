class MyHashMap {
    ArrayList <ArrayList<Integer>> hm;
    public MyHashMap() {
        hm = new ArrayList<>();
    }
    
    public void put(int key, int value) {
        // Check if key is present in [ [1,1], [2,1] ]
        // For loop to run through the elements in outer arraylist, which will yield inner array list
        // Check first element, if it is the same as key, then change second element to value

        for(int i = 0 ; i < hm.size() ; i ++){
            ArrayList <Integer> innerArr = hm.get(i);
            if(innerArr.get(0) == key) {
                innerArr.remove(1);
                innerArr.add(value);
                return;
            }
        }
        ArrayList <Integer> newEntry = new ArrayList<>();
        newEntry.add(key);
        newEntry.add(value);

        hm.add(newEntry);
    }
    
    public int get(int key) {
        for(int i = 0 ; i < hm.size(); i ++){
            ArrayList <Integer> innerArr = hm.get(i);
            if (innerArr.get(0) == key){
                return innerArr.get(1);
            }
        }
        return -1;
    }
    
    public void remove(int key) {
        for(int i = 0 ; i < hm.size() ; i++ ){
            ArrayList <Integer> innerArr = hm.get(i);
            if(innerArr.get(0) == key){
                hm.remove(innerArr);
            }
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */