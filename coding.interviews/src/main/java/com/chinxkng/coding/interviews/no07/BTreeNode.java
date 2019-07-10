package com.chinxkng.coding.interviews.no07;

public class BTreeNode {
	String value;
	BTreeNode leftNode;
	BTreeNode rightNode;
	
	public String getPostOrder() {
		String s= "";
		if(null!=this.leftNode) {
			s+=this.leftNode.getPostOrder();
			s+=",";
		}
		if(null!=this.rightNode) {
			s+=this.rightNode.getPostOrder();
			s+=",";
		}
		s+=this.value;
		s+=",";
		return s;
	}
}
