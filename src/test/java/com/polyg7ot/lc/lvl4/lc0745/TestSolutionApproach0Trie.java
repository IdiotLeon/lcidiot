/**
 * https://leetcode.com/problems/prefix-and-suffix-search/
 */
package com.polyg7ot.lc.lvl4.lc0745;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestSolutionApproach0Trie {
    private SolutionApproach0Trie solution;
    
    @Test
    public void test(){
        String[] input = new String[]{"apple"};
        solution = new SolutionApproach0Trie(input);

        assertEquals(0, solution.f("a", "e"));
        assertEquals(-1, solution.f("b", ""));
    }
}