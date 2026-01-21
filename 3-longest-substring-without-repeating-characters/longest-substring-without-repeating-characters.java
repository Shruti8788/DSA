import java.util.HashMap;

class Solution {
    public int lengthOfLongestSubstring(String s) 
    { 
        HashSet<Character> set = new HashSet<>();
        int l= 0;
        int mL = 0;

        for (int r = 0; r < s.length(); r++) 
        {

            while (set.contains(s.charAt(r))) 
            {
                set.remove(s.charAt(l));
                l++;
            }

            set.add(s.charAt(r));
            mL = Math.max(mL, r-l+1);
        }

        return mL;
    }
}