package Main;
import BinaryTree.BinaryTree;
import BinaryTree.TreeNode;
import FixedPoint.FixedPoint;
import LinkedList.LinkedList;
import MaxMin.MaxMin;
import MegeSort.MergeSort;
import Queue.Queue;
import QuickSort.QuickSort;
import Select.Select;
import Stack.Stack;


public class Main {

	public static void main(String[] args) {

		int[] arr = {4,15,10,4,14,12,2,17,70,85,39,63,41,36,66,4};
		int[] arr2 = {2,4,10,14,14,12,4,17,70,85,39,63,41,36,66,4};
		int[] arr3 = {4,15,10,2,17};
		
		System.out.println("{4,15,10,4,14,12,2,17,70,85,39,63,41,36,66}");

		//Merge Sort - Algorithm

		MergeSort mergeSort = new MergeSort();	
		mergeSort.runMergeSort(arr2, 0, arr.length - 1);

		System.out.println("The sorted array by Merge Sort is : ");

		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] +", ");
		}


		//Fixed Point - Algorithm 

		FixedPoint fixedPoint = new FixedPoint();

		int result = fixedPoint.findFixedPoint(arr, 0, arr.length -1);

		System.out.println("There is Fixed Point in index : "+result);

		//MaxMin - algorithm

		MaxMin maxMin = new MaxMin().findMaxMin(arr2, 0, arr2.length -1);

		System.out.println("Max is : "+ maxMin.getMax()+" Min is : " + maxMin.getMin());

		//Quick sort - Algorithm

		QuickSort quickSort = new QuickSort();
		quickSort.runQuickSort(arr, 0, arr.length -1);

		System.out.println("The sorted array by quick sort is : ");
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] +", ");
		}
		System.out.println();
		
		//Select - Algorithm
		
		Select select = new Select();
		int index = 3;
		int num = select.runSelect(arr3, 0, arr3.length -1 , index);
		
		System.out.println("The select number in the "+index+" is : "+num);
		
		// Stack - Algorithm
		
		Stack stack = new Stack(5);
		System.out.println("stack is empty : "+ stack.isEmpty());
		stack.push(1);
		stack.push(4);
		System.out.println("stack is full : "+ stack.isFull());
		System.out.println("picking to stack : "+stack.pick());
		stack.push(12);
		stack.push(555);
		System.out.println("poping from the stack : "+ stack.pop());
		System.out.println("picking to stack : "+stack.pick());
		stack.push(13);
		stack.push(512);
		System.out.println("stack is full : "+ stack.isFull());
		stack.push(1);
		System.err.println();
		
		//Queue - Algorithm
		
		Queue queue = new Queue(5);
		System.out.println("Queue is empty : "+queue.isEmpty());
		queue.enQueue(1);
		System.out.println("Queue is empty : "+queue.isEmpty());
		queue.enQueue(2);
		queue.enQueue(3);
		System.out.println("Dequeuing from queue : "+ queue.deQueue());
		System.out.println("Dequeuing from queue : "+ queue.deQueue());
		System.out.println("Dequeuing from queue : "+ queue.deQueue());
		queue.deQueue();
		queue.enQueue(4);
		queue.enQueue(5);
		queue.enQueue(6);
		queue.enQueue(7);
		queue.enQueue(8);
		queue.enQueue(9); //OverFlow
		System.out.println("Dequeuing from queue : "+ queue.deQueue());
		
		
		//LinkedList - Algorithm
		
		LinkedList linkedList = new LinkedList();
		linkedList.add("1");
		linkedList.add("2");
		System.out.println("The length od the list is : "+linkedList.getSize());
		linkedList.add("omry");
		System.out.println("omry is in the "+linkedList.fineNodeIndex("omry")+" node");
		linkedList.delete("2");
		System.out.println("The length od the list is : "+linkedList.getSize());
		System.out.println("omry is in the "+linkedList.fineNodeIndex("omry")+" node");
		
		
		//Binary tree - Algorithm
		
		BinaryTree binaryTree = new BinaryTree();
		binaryTree.add(20);
		System.out.println("the root is : "+ binaryTree.getRoot().getData());
		binaryTree.add(10);
		System.out.println("the root left child is : "+ binaryTree.getRoot().getLeftChild().getData());
//		System.out.println("the root right child is : "+ binaryTree.getRoot().getRightChild().getData());
		binaryTree.add(40);
		System.out.println("the root right child is : "+ binaryTree.getRoot().getRightChild().getData());
		binaryTree.add(30);
		TreeNode find = binaryTree.find(40);
		System.out.println("the left child of 40 is : "+ find.getLeftChild().getData());
		TreeNode successor = binaryTree.successor(find);
		System.out.println("the successor of the node 40 is : "+successor.getData());
		
		
		
	}

}
