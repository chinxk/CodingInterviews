package com.chinxkng.coding.interviews.no04;

import org.junit.Test;

import junit.framework.Assert;

public class FindInPartiallySortedMatrixTest {

	@Test
	public void checkInputNull() {
		int[][] arr = null;
		int target = 5;

		Assert.assertEquals(false, FindInPartiallySortedMatrix.checkInput(arr, target));
	}

	@Test
	public void checkInputRowFailed() {
		int[][] arr = { { 1, 2, 8, 9 }, { 4, 2, 9, 12 }, { 4, 7, 10, 13 }, { 6, 8, 11, 15 } };
		int target = 5;

		Assert.assertEquals(false, FindInPartiallySortedMatrix.checkInput(arr, target));
	}

	@Test
	public void checkInputColumnFailed() {
		int[][] arr = { { 1, 2, 8, 9 }, { 0, 2, 9, 12 }, { 4, 7, 10, 13 }, { 6, 8, 11, 15 } };
		int target = 5;

		Assert.assertEquals(false, FindInPartiallySortedMatrix.checkInput(arr, target));
	}

	@Test
	public void searchFailed1() {
		int[][] arr = { { 1, 2, 8, 9 }, { 2, 4, 9, 12 }, { 4, 7, 10, 13 }, { 6, 8, 11, 15 } };
		int target = 5;

		Assert.assertEquals(null, FindInPartiallySortedMatrix.search(arr, target));
	}

	@Test
	public void searchFailed2() {
		int[][] arr = { { 1, 2, 8, 9 } };
		int target = 10;

		Assert.assertEquals(null, FindInPartiallySortedMatrix.search(arr, target));
	}

	@Test
	public void searchFailed3() {
		int[][] arr = { { 1, 2, 8, 9 } };
		int target = 0;

		Assert.assertEquals(null, FindInPartiallySortedMatrix.search(arr, target));
	}

	@Test
	public void searchFailed4() {
		int[][] arr = { { 1, 2, 8, 9 } };
		int target = 3;

		Assert.assertEquals(null, FindInPartiallySortedMatrix.search(arr, target));
	}

	@Test
	public void searchFailed5() {
		int[][] arr = { { 1 }, { 2 }, { 4 }, { 5 } };
		int target = 0;

		Assert.assertEquals(null, FindInPartiallySortedMatrix.search(arr, target));
	}

	@Test
	public void searchFailed6() {
		int[][] arr = { { 1 }, { 2 }, { 4 }, { 5 } };
		int target = 6;

		Assert.assertEquals(null, FindInPartiallySortedMatrix.search(arr, target));
	}

	@Test
	public void searchFailed7() {
		int[][] arr = { { 1 }, { 2 }, { 4 }, { 5 } };
		int target = 3;

		Assert.assertEquals(null, FindInPartiallySortedMatrix.search(arr, target));
	}

	@Test
	public void searchSuccess1() {
		int[][] arr = { { 1, 2, 8, 9 }, { 2, 4, 9, 12 }, { 4, 7, 10, 13 }, { 5, 8, 11, 15 } };
		int target = 5;
		int[] result = FindInPartiallySortedMatrix.search(arr, target);
		Assert.assertEquals(result[0], 3);
		Assert.assertEquals(result[1], 0);
	}

	@Test
	public void searchSuccess2() {
		int[][] arr = { { 1, 2, 8, 9 }, { 2, 4, 9, 12 }, { 4, 7, 10, 13 }, { 5, 8, 11, 15 } };
		int target = 15;
		int[] result = FindInPartiallySortedMatrix.search(arr, target);
		Assert.assertEquals(result[0], 3);
		Assert.assertEquals(result[1], 3);
	}

	@Test
	public void searchSuccess3() {
		int[][] arr = { { 1, 2, 8, 9 }, { 2, 4, 9, 12 }, { 4, 7, 10, 13 }, { 5, 8, 11, 15 } };
		int target = 1;
		int[] result = FindInPartiallySortedMatrix.search(arr, target);
		Assert.assertEquals(result[0], 0);
		Assert.assertEquals(result[1], 0);
	}

	@Test
	public void searchSuccess4() {
		int[][] arr = { { 1, 2, 8, 9 } };
		int target = 1;
		int[] result = FindInPartiallySortedMatrix.search(arr, target);
		Assert.assertEquals(result[0], 0);
		Assert.assertEquals(result[1], 0);
	}

	@Test
	public void searchSuccess5() {
		int[][] arr = { { 1, 2, 8, 9 } };
		int target = 9;
		int[] result = FindInPartiallySortedMatrix.search(arr, target);
		Assert.assertEquals(result[0], 0);
		Assert.assertEquals(result[1], 3);
	}

	@Test
	public void searchSuccess6() {
		int[][] arr = { { 1, 2, 8, 9 } };
		int target = 2;
		int[] result = FindInPartiallySortedMatrix.search(arr, target);
		Assert.assertEquals(result[0], 0);
		Assert.assertEquals(result[1], 1);
	}

	@Test
	public void searchSuccess7() {
		int[][] arr = { { 1 }, { 2 }, { 4 }, { 5 } };
		int target = 1;
		int[] result = FindInPartiallySortedMatrix.search(arr, target);
		Assert.assertEquals(result[0], 0);
		Assert.assertEquals(result[1], 0);
	}

	@Test
	public void searchSuccess8() {
		int[][] arr = { { 1 }, { 2 }, { 4 }, { 5 } };
		int target = 5;
		int[] result = FindInPartiallySortedMatrix.search(arr, target);
		Assert.assertEquals(result[0], 3);
		Assert.assertEquals(result[1], 0);
	}

	@Test
	public void searchSuccess9() {
		int[][] arr = { { 1 }, { 2 }, { 4 }, { 5 } };
		int target = 4;
		int[] result = FindInPartiallySortedMatrix.search(arr, target);
		Assert.assertEquals(result[0], 2);
		Assert.assertEquals(result[1], 0);
	}

}
