public class CircleArrayQueue {
	public static void main(String[] args) {
		
	}
}

class CircleArray{
	private int maxSize;
	
	private int front;  //指向队列的第一个元素
	private int rear;//指向队列最后一个元素的后一个位置
	private int[] arr;
	
	public CircleArray(int arrMaxSize) {
		maxSize = arrMaxSize;
		arr = new int[maxSize];
	}
	
	public boolean isFull() {
		return (rear+1)%maxSize == front;
	}
	
	public boolean isEmpty() {
		return rear == front;
	}
	
	public void addQue(int n) {
		if(isFull()) {
			System.out.println("队列满，不能添加数据！");
			return;
		}
		arr[rear]=n;
		rear = (rear+1)%maxSize;
	}
	public int getQue() {
		if (isEmpty()) {
			throw new RuntimeException("队列是空的");
		}
		int value = arr[front];
		front = (front+1)%maxSize;
		return value;
		
	}
//	public void showQue
	
}
