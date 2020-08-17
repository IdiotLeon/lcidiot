/**
 * https://leetcode.com/problems/copy-list-with-random-pointer/
 * 
 * Time Complexity:     O(L)
 * Space Complexity:    O(L)
 */
package com.zea7ot.lc.lvl4.lc0138;

import java.util.HashMap;

public class SolutionApproach1DFSRecursive1 {
    private HashMap<ListNode, ListNode> visited = new HashMap<ListNode, ListNode>();

    public ListNode copyRandomList(ListNode head) {
        if (head == null)
            return null;

        if (visited.containsKey(head))
            return this.visited.get(head);

        ListNode node = new ListNode(head.val);
        visited.put(head, node);

        node.next = copyRandomList(head.next);
        node.random = copyRandomList(head.random);

        return node;
    }
}