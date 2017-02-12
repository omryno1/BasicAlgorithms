package BinaryTree;

public class BinaryTree {
	TreeNode root;
	
	public BinaryTree (){
		this.root = null;
	}
	
	public void add(int num){
		TreeNode current = root;
		TreeNode parent = null;
		
		TreeNode toAdd = new TreeNode(num);
		
		if (current == null)
			root = toAdd;
		else {
			while (current != null){
				parent = current;
				if (num >= current.getData())
					current = current.getRightChild();
				else 
					current = current.getLeftChild();
			}
			if (num > parent.getData()){
				parent.setRightChild(toAdd);
				toAdd.setParent(parent);
			}
			else{
				parent.setLeftChild(new TreeNode(num));
				toAdd.setParent(parent);
			}
		}
	}
	
	public TreeNode successor(TreeNode node){
		
		if (node.getRightChild() != null){
			return treeMinimum(node.getRightChild());
		}
		
		TreeNode parent = node.getParent();
		while (parent != null && parent.getRightChild().equals(node)){
			node = node.getParent();
			parent = node.getParent();
		}
		return parent;
		
		
	}
	
	public TreeNode treeMinimum (TreeNode node){
		while (node.getLeftChild() !=null){
			node = node.getLeftChild();
		}
		return node;
	}
	
	
	public TreeNode find(int num){
		TreeNode nodeTofind = root;
		while (nodeTofind != null && nodeTofind.getData() != num){
			if (num > nodeTofind.getData())
				nodeTofind = nodeTofind.getRightChild();
			else
				nodeTofind = nodeTofind.getLeftChild();
		}
		return nodeTofind;
	}

	public TreeNode getRoot() {
		return root;
	}
	
}
