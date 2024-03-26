/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private boolean sameTree = true;
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if ((p == null) && (q != null)){
            sameTree = false;
            return false;
        }
        if( p == null){
            return true;
        }
        if (q == null){
            sameTree = false;
            return false;
        }
        if( p.val != q.val){
            sameTree = false;
        }

        isSameTree(p.left,q.left);
        isSameTree(p.right,q.right);

        return sameTree;
    }
}