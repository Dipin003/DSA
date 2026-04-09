class Solution {
    public int minDepth(TreeNode root) {
        
       if(root == null) return 0;

        int lh = minDepth(root.left);
        int rh = minDepth(root.right);

      
        if(root.left == null) return rh + 1;
        if(root.right == null) return lh + 1;

        return Math.min(lh, rh) + 1;

    }
}
