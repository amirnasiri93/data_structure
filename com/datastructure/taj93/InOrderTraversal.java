package com.datastructure.taj93;

import java.util.ArrayList;

public class InOrderTraversal<T> {
	private TreeNode<T> root;

	public InOrderTraversal(TreeNode<T> root) {
		this.root = root;
	}

	public void traversal() {
		ArrayList<TreeNode<T>> visited = new ArrayList<>();
		StackCDT<TreeNode<T>> stack = new StackCDT<TreeNode<T>>();
		TreeNode<T> current = root;

	}

	public TreeNode<T> getRoot() {
		return root;
	}

	public void setRoot(TreeNode<T> root) {
		this.root = root;
	}

}
