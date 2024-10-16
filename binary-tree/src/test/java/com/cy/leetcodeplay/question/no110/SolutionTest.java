package com.cy.leetcodeplay.question.no110;

import com.cy.common.interfases.impl.BST;
import com.cy.common.util.printtree.PrintTree;
import com.cy.leetcodeplay.question.bt.no110.Solution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		Integer[] nums = {2, 1, 3};
		BST bst1 = new BST(nums);
		PrintTree.printTree2(bst1.getRoot());

		boolean res1 = solution.isBalanced(bst1.getRoot());
		Assertions.assertEquals(true, res1);
	}

	@Test
	public void test2() {
		Integer[] nums = {1, 2, 3};
		BST bst1 = new BST(nums);
		PrintTree.printTree2(bst1.getRoot());

		boolean res1 = solution.isBalanced(bst1.getRoot());
		Assertions.assertEquals(false, res1);
	}
}