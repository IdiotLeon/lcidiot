/**
 * https://leetcode.com/problems/linked-list-cycle-ii/
 */
package com.null7ptr.lc.lvl4.lc0142;

import java.util.HashSet;
import java.util.Set;

import com.null7ptr.data_structure.linkedlist.ListNode;

public class SolutionApproachHashMap {
    public ListNode detectCycle(ListNode head) {
        Set<ListNode> visited = new HashSet<ListNode>();
        
        ListNode node = head;
        while(node != null){
            if(visited.contains(node))
                return node;
            visited.add(node);
            node = node.next;
        }
        
        return null;
    }
}