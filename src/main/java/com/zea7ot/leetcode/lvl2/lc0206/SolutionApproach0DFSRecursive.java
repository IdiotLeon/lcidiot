/**
 * https://leetcode.com/problems/reverse-linked-list/
 * 
 * Time Complexity:     O(L)
 * Space Complexity:    O(L)
 * 
 * References:
 *  https://leetcode.com/problems/reverse-nodes-in-k-group/discuss/183356/Java-O(n)-solution-with-super-detailed-explanation-and-illustration
 *  https://leetcode.com/problems/binary-tree-upside-down/discuss/49406/Java-recursive-(O(logn)-space)-and-iterative-solutions-(O(1)-space)-with-explanation-and-figure/156816
 */
package com.zea7ot.leetcode.lvl2.lc0206;

import com.zea7ot.utils.data_structure.linkedlist.ListNode;

public class SolutionApproach0DFSRecursive {
    public ListNode reverseList(ListNode head) {
        return dfs(head, null);
    }

    private ListNode dfs(ListNode head, ListNode prev) {
        if (head == null)
            return prev;

        ListNode next = head.next;
        head.next = prev;
        return dfs(next, head);
    }
}