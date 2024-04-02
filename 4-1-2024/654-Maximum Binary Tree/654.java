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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if(nums == null) return null;
        return maxA(nums, 0, nums.length - 1);
    }
    private TreeNode maxA(int[] nums, int start, int end){
        if(start > end) return null;

        int maxInt = start;
        for(int i = start + 1; i <= end;i++){
            if(nums[i] > nums[maxInt]){
                maxInt = i;
            }
        }
        TreeNode root = new TreeNode(nums[maxInt]);
        root.left = maxA(nums, start, maxInt - 1);
        root.right = maxA(nums, maxInt + 1, end);
        return root;
    }
}