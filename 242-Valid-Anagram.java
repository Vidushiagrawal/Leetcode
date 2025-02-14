class Solution {
    // public String removeChar(String str, int index) {
    //     return str.substring(0, index) + str.substring(index + 1);
    // }

     public boolean isAnagram(String s, String t) {
    //     if (s.isEmpty() && t.isEmpty()) return true;
    //     if (s.length() != t.length()) return false;
    //     char firstChar = s.charAt(0);
    //     int found = t.indexOf(firstChar);
    //     if (found == -1) return false;

    //     return isAnagram(s.substring(1), removeChar(t, found));
    if (s.length() != t.length()) {
            return false;
        }
        
        int[] count = new int[256]; 
        
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i)]++;
            count[t.charAt(i)]--;
        }
        
        for (int i : count) {
            if (i != 0) 
                return false; }
        return true;
    }


    
}