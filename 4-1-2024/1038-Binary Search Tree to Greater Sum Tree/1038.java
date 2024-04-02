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
    int sum = 0;
    public TreeNode bstToGst(TreeNode root) {
        if (root == null) {return null;}
        TreeNode temp = bstToGst(root.right);


        sum+=root.val;
        root.val = sum;

        bstToGst(root.left);
        //TreeNode temp2 = bstToGst(root.left);
        // if(temp2 != null){
        // temp2.val = temp2.val + root.val;
        // }

        return root;

    }
}