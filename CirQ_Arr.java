

//Circular Queue Implementation using Array
public class CirQ_Arr {
    static class C_Queue{
    	static int c_queue[];
    	static int size;
    	static int rear=-1;
    	static int front=-1;
    	C_Queue(int n){
    		c_queue=new int[n];
    		this.size=n;
    	}
    	public static boolean isFull() {
    		return (rear+1)%size==front;
    	}
    	public static boolean isEmpty() {
    		return rear==-1;
    	}
    	public static void Enqueue(int data) {
    		if(isFull()) {
    			System.out.println("Queue is full");
    		    return;
    		}
    		//1st element
    		if(front==-1) {
    			front=0;//increment the front also
    		}
    		rear=(rear+1)%size;
    		c_queue[rear]=data;
    	}
    	public static int Dequeue() {
    		if(isEmpty()) {
    			System.out.println("Queue is empty.");
    		    return -1;
    		}
    		int del=c_queue[front];
    		if(front==rear) {
    			front=rear=-1;
    		}
    		else{//it is most useful when front is at the last and 
    			//want to remove the last element 
    			front=(front+1)%size;
    		}
    		return del;
    	}
    	public static int Front() {
    		if(isEmpty()) {
    			System.out.println("Queue is empty.");
    		    return -1;
    		}
    		//to return the front element as it is a peek
    		return c_queue[front];
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C_Queue q=new C_Queue(5);
		q.Enqueue(10);
		q.Enqueue(20);
		q.Enqueue(30);
		q.Enqueue(40);
		q.Enqueue(50);
		System.out.println("remove: "+q.Dequeue());
		q.Enqueue(60);
		System.out.println("remove: "+q.Dequeue());
		q.Enqueue(70);
        System.out.println("Elements in the queue are: ");
		while(!q.isEmpty()) {
			System.out.println(q.Front());
			q.Dequeue();
		}
	}

}
