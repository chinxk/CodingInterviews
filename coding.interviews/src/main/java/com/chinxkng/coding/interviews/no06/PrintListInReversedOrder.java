package com.chinxkng.coding.interviews.no06;

/**
 * 题目：从尾到头打印链表
 */
public class PrintListInReversedOrder {

	public static void main(String[] args) {

		Node d = new Node('d', null);
		Node c = new Node('c', d);
		Node b = new Node('b', c);
		Node a = new Node('a', b);

		display(a);
	}

	private static void display(Node a) {

		if (null == a) {
			return;
		}

		if (null != a.next) {
			display(a.next);
		}
		System.out.println(a.data);
	}

}
