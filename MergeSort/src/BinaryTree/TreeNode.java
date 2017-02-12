package BinaryTree;

public class TreeNode {
	private TreeNode parent;
	private TreeNode leftChild;
	private TreeNode rightChild;
	private int data;
	
	public TreeNode (int data){
		this.parent = null;
		this.leftChild = null;
		this.rightChild = null;
		this.data = data;
	}

	public TreeNode getParent() {
		return parent;
	}

	public void setParent(TreeNode parent) {
		this.parent = parent;
	}

	public TreeNode getLeftChild() {
		return leftChild;
	}

	public void setLeftChild(TreeNode leftChild) {
		this.leftChild = leftChild;
	}

	public TreeNode getRightChild() {
		return rightChild;
	}

	public void setRightChild(TreeNode rightChild) {
		this.rightChild = rightChild;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		TreeNode compare = (TreeNode)obj;
		if (this.data == compare.getData()){
			return true;
		}
		return false;
	}
}
