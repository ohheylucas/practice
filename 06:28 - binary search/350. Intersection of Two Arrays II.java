class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        
        ArrayList<Integer> myList = new ArrayList<>();
        Map<Integer, Integer> myMap = new HashMap<>();
        for(int i=0; i<nums1.length; i++){
            if(!myMap.containsKey(nums1[i]) ){
                myMap.put(nums1[i], 1);
            }else{
                int count = myMap.get(nums1[i]);
                myMap.replace(nums1[i], count+1);
            }
        }
        for(int i=0; i<nums2.length; i++){
            if(myMap.containsKey(nums2[i])){
                int count = myMap.get(nums2[i]);
                myList.add(nums2[i]);
                if(count-1 <= 0){
                    myMap.remove(nums2[i]);
                }else{
                    myMap.replace(nums2[i], count - 1);
                }
            }
        }
        
        int[] arr = new int[myList.size()];

        for(int i = 0; i < myList.size(); i++) {
            if (myList.get(i) != null) {
                arr[i] = myList.get(i);
            }
        }
        return arr;
    }
}