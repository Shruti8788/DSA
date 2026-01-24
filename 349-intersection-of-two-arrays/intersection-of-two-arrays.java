import java.util.*;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        HashSet<Integer> set = new HashSet<>();
        for (int n2 : nums2) {
            set.add(n2);
        }

        HashSet<Integer> resultSet = new HashSet<>();
        for (int n1 : nums1) {
            if (set.contains(n1)) {
                resultSet.add(n1);
            }
        }

        int[] res = new int[resultSet.size()];
        int i = 0;
        for (int num : resultSet) {
            res[i++] = num;
        }

        return res;
    }
}
