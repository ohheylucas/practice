public class Solution {
    public String reverseWords(String s) {
        String[] parts = s.trim().split("\\s+");
        String res = "";
        for(int i=parts.length-1; i>0; i--){
            res = res + parts[i] + " ";
        }
    //be careful about last elemenet
    //if you have extra space at the end, you should modify 
    //the for loop so it wont get to the last element, 
    //and then return the result + last element
    return res+parts[0];
    }
}