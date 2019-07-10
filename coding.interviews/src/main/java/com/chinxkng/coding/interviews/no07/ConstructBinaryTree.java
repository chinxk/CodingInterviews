package com.chinxkng.coding.interviews.no07;

/**
 * 输入二叉树的前序和中序结果，重建该树。输入不含重复数字。
 */
public class ConstructBinaryTree {

	public static void main(String[] args) {
		String preString = "1,2,4,7,3,5,6,8";
		String midString = "4,7,2,1,5,3,8,6";

		BTreeNode root = reconstruct(preString, midString);
		System.out.println(root.getPostOrder());
	}

	private static BTreeNode reconstruct(String preString, String midString) {

		BTreeNode node = null;
		preString = prepareStr(preString);
		midString = prepareStr(midString);
		if (preString.length() >= 1) {
			String s = preString.substring(0, 1);
			node = new BTreeNode();
			node.value = s;
			if (preString.length() > 2) {
				// process mid, divide into left and right
				String midLeft = midString.substring(0, midString.indexOf(s));
				String midRight = midString.substring(midString.indexOf(s) + 1);
				String preLeft = preString.substring(1, midLeft.length() + 1);
				String preRight = preString.substring(midLeft.length() + 1);
				node.leftNode = reconstruct(preLeft, midLeft);
				node.rightNode = reconstruct(preRight, midRight);
			}
		}

		return node;
	}

	private static String prepareStr(String str) {
		if (str.endsWith(",")) {
			str = str.substring(0, str.lastIndexOf(","));
		}
		if (str.startsWith(",")) {
			str = str.substring(1);
		}
		return str;
	}

}
