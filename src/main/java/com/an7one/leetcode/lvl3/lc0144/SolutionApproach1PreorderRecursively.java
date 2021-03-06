/**
 * https://leetcode.com/problems/binary-tree-preorder-traversal/
 */
package com.an7one.leetcode.lvl3.lc0144;

import java.util.ArrayList;
import java.util.List;

import com.an7one.util.data_structure.tree.TreeNode;

public class SolutionApproach1PreorderRecursively {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        // sanity check
        if (root == null)
            return ans;

        preorder(root, ans);

        return ans;
    }

    private void preorder(TreeNode root, List<Integer> res) {
        if (root == null)
            return;

        res.add(root.val);
        preorder(root.left, res);
        preorder(root.right, res);
    }
}