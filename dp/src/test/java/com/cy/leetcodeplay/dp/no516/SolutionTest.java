package com.cy.leetcodeplay.dp.no516;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		String s = "bbbab";
		int res1 = solution.longestPalindromeSubseq(s);
		Assertions.assertEquals(4, res1);
	}

	@Test
	public void test2() {
		String s = "bbbab";
		int res1 = solution.longestPalindromeSubseq2(s);
		Assertions.assertEquals(4, res1);
	}

	@Test
	public void test3() {
		String s = "bbbab";
		int res1 = solution.longestPalindromeSubseq3(s);
		Assertions.assertEquals(4, res1);
	}
}