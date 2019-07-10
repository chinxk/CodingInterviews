package com.chinxkng.coding.interviews.no04;

/**
 * 在一个二维数组中，第一行得了按照从左到右递增的顺序排序。每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 *
 */
public class FindInPartiallySortedMatrix {
	public static void main(String[] args) {

		int[][] arr = { { 1, 2, 8, 9 }, { 2, 4, 9, 12 }, { 4, 7, 10, 13 }, { 6, 8, 11, 15 } };
		int target = 5;
		if (!checkInput(arr, target)) {
			System.out.println("Input Error!");
			return;
		}

		int[] r = search(arr, target);
		if (r != null) {
			System.out.println("Found " + target + "at [" + r[0] + "][" + r[1] + "]");
		} else {
			System.out.println("target not found.");
		}

	}

	public static boolean checkInput(int[][] arr, int target) {

		if (null == arr || 0 == arr.length) {
			return false;
		}
		// check row
		for (int h = 0; h < arr.length - 1; h++) {
			for (int w = 0; w < arr[0].length - 1; w++) {
				if (arr[h][w] > arr[h][w + 1]) {
					return false;
				}
			}
		}
		// check column
		for (int w = 0; w < arr[0].length - 1; w++) {
			for (int h = 0; h < arr.length - 1; h++) {
				if (arr[h][w] > arr[h + 1][w]) {
					return false;
				}
			}
		}
		return true;
	}

	public static int[] search(int[][] arr, int target) {
		int w = arr[0].length;
		int h = arr.length;

		int i = 0, j = 0;
		while (0 <= i && i < w && 0 <= j && j < h) {

			while (i < w && arr[j][i] <= target) {
				i++;
			}
			i--;
			if (i < 0) {
				return null;
			}
			while (j < h && arr[j][i] < target) {
				j++;
			}
			if (j >= h) {
				return null;
			}

			if (arr[j][i] == target) {
				int[] a = { j, i };
				return a;
			}
		}
		return null;
	}
}
