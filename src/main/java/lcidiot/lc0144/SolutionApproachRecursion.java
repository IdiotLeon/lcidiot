/**
 * https://leetcode.com/problems/binary-tree-preorder-traversal/
 */
package main.java.lcidiot.lc0144;

import java.util.ArrayList;
import java.util.List;

import main.java.lcidiot.utils.TreeNode;

class SolutionApproachRecursion {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<Integer>();
        if(root == null) return ans;
        
        preorder(root, ans);
        
        return ans;
    }
    
    private void preorder(TreeNode root, List<Integer> ans){
        if(root == null) return;
        
        ans.add(root.val);
        preorder(root.left, ans);
        preorder(root.right, ans);
    }
}