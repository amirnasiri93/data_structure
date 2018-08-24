package com.datastructure.taj93;

import java.util.ArrayList;
import java.util.Iterator;

public class TreeNode<T> implements Iterable<T> {
	// the data in the node
	private T data;
	// the parent of the node.
	private TreeNode<T> parent;
	// true if this is true and false otherwise.
	private boolean isRoot;
	// the children's of this current node.
	private ArrayList<TreeNode<T>> children;

	public TreeNode() {
		data = null;
		parent = null;
		isRoot = false;
		children = new ArrayList<>();
	}

	public TreeNode(T data) {
		this.data = data;
		parent = null;
		isRoot = false;
		children = new ArrayList<>();
	}

	public TreeNode(T data, boolean isRoot) {
		this.data = data;
		parent = null;
		this.isRoot = isRoot;
		children = new ArrayList<>();
	}

	@Override
	public Iterator<T> iterator() {
		return null;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public TreeNode<T> getParent() {
		return parent;
	}

	public void setParent(TreeNode<T> parent) {
		this.parent = parent;
	}

	public boolean isRoot() {
		return isRoot;
	}

	public void setRoot(boolean isRoot) {
		this.isRoot = isRoot;
	}

	public ArrayList<TreeNode<T>> getChildren() {
		return children;
	}

	// public void setChildren(ArrayList<TreeNode<T>> children) {
	// this.children = children;
	// }
	public ArrayList<TreeNode<T>> addChild(TreeNode<T> child) {
		if (!child.isRoot()) {
			children.add(child);
			child.setParent(this);
		}
		return children;
	}

	public ArrayList<TreeNode<T>> removeChild(TreeNode<T> child) {
		children.remove(child);
		child.setParent(null);
		return children;
	}

	public boolean hasChildren() {
		if (children.size() == 0)
			return false;
		else
			return true;
	}

}
