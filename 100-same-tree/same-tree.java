class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        
        // If both are null
        if (p == null && q == null) {
            return true;
        }
        
        // If one is null or values are different
        if (p == null || q == null || p.val != q.val) {
            return false;
        }
        
        // Check left and right subtree
        return isSameTree(p.left, q.left) && 
               isSameTree(p.right, q.right);
    }
}
