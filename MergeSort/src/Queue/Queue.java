package Queue;

public class Queue {
	private int maxSize;
	private int head;
	private int tail;
	private int[] queueArr;
	
	public Queue (int size){
		maxSize = size;
		queueArr = new int[size];
		head = - 1;
		tail = - 1;
	}
	
	public Boolean isEmpty(){
		if (head == -1 && tail == -1){
			return true;
		}
		return false;
	}
	
	public void enQueue(int num){
		if (isEmpty()){
			tail++;
			head++;
			queueArr[tail] = num;
		}else{
			queueArr[++tail] = num;
			if (tail == maxSize - 1 && head >= 0){
				tail = -1 ;
			}
		}
	}
	
	public int deQueue(){
		if (isEmpty()){
			System.out.println("Queue is empty!");
			return -1;
		}
		if (head == tail){
			int num = queueArr[head];
			head = -1;
			tail = -1;
			return num;
		}else {
			int num = queueArr[head++];
			if (head == maxSize -1 && tail >= 0){
				head = -1;
			}
			return num;
		}
	}
	
}
