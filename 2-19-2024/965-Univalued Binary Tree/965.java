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
    private int rootVal = 0;
    private boolean isUniValue = true;

    public boolean isUnivalTree(TreeNode root) {
        if( root == null){
            return true;
        }
        if(rootVal == 0){
            rootVal = root.val;
        }
        if(rootVal != root.val){
            isUniValue = false;
        }


        isUnivalTree(root.left);
        isUnivalTree(root.right);

        return isUniValue;

    }
}