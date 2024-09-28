//Queue Implementation using Array
public class Q_Arr {
    static class QueueA{
    	//making the variable static in order to access them in the method
    	static int queueArr[];
    	static int size;
    	static int rear=-1;
    	static int front=-1;
    	QueueA(int n){
    		queueArr=new int[n];
    		this.size=n;
    	}
    	public static boolean isFull() {
    		return (rear+1)%size==front;
    	}
    	public static boolean isEmpty() {
    		return rear==-1&&front==-1;
    	}
    	
    	public static void Enqueue(int data) {
    		if(isFull()) {
    			System.out.println("Queue is full");
    		    return;
    		}
    		rear++;
    		queueArr[rear]=data;
    	}
    	
    	public static int Dequeue() {
    		if(isEmpty()) {
    			System.out.println("Queue is empty.");
    		    return -1;
    		}
    		int front=queueArr[0];
    		//shifting the elements to the left as front is deleted
    		for(int i=0;i<rear;i++) {
    			queueArr[i]=queueArr[i+1];
    		}
    		//rear is also gets shifted by one place
    		rear--;
    		return front;
    	}
    	public static int Front() {
    		if(isEmpty()) {
    			System.out.println("Queue is empty.");
    		    return -1;
    		}
    		return queueArr[0];
    	}
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueA q=new QueueA(5);
		q.Enqueue(10);
		q.Enqueue(20);
		q.Enqueue(30);
        System.out.println("Elements in the queue are: ");
		while(!q.isEmpty()) {
			System.out.println(q.Front());
			q.Dequeue();
		}
	}

}
