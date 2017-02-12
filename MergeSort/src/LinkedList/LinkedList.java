package LinkedList;

public class LinkedList {
	private Node head;
	private Node last;
	private int size;
	
	public LinkedList(){
		head = last = new Node(null);
		size = 0;
	}

	public void add(String data){
		last.setNext(new Node(data));
		last = last.getNext();
		size++;
	}

	public Boolean delete(String data){
		Node prevNode = findPrevNode(data);
		if (prevNode != null){
			Node deleteNode = prevNode.getNext();
			prevNode.setNext(deleteNode.getNext());
			deleteNode.setNext(null);
			size--;
			return true;
		}
		return false;
	}
	
	public int fineNodeIndex (String data){
		Node find = head;
		int index = 0;
		while (find.getNext() != null && find.getData() != data){
			find = find.getNext();
			index++;
		}
		if (find.getData() == data){
			return index;
		}
		return -1;
	}
	
	public Node findPrevNode (String data){
		Node find = head;
		while (find.getNext() != null && find.getNext().getData() != data){
			find = find.getNext();
		}
		if (find.getNext().getData() == data)
			return find;
		else 
			return null;
	}
	
	public int getSize(){
		return size;
	}
	
	public Node getLastNode(){
		return last;
	}
	
	
}

