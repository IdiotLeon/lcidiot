/**
 * https://leetcode.com/problems/find-largest-value-in-each-tree-row/
 */
package com.an7one.leetcode.lvl3.lc0515;

import java.util.ArrayList;
import java.util.List;

import com.an7one.util.data_structure.tree.TreeNode;

public class SolutionApproachDFSTopDown{
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> ans = new ArrayList<Integer>();
        if(root == null) return ans;
        
        dfs(root, ans, 0);
        return ans;
    }
    
    private void dfs(TreeNode node, List<Integer> ans, int depth){
        if(node == null) return;
        
        if(ans.size() == depth){
            ans.add(node.val);
        }else{
            if(node.val > ans.get(depth)){
                ans.set(depth, node.val);
            }
        }
        
        dfs(node.left, ans, depth + 1);
        dfs(node.right, ans, depth + 1);
    }
}