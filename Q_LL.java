//Queue implementation using LinkedList and Collection Framework
import java.util.*;
public class Q_LL {
    static class Node{
    	int data;
    	Node next;
    	Node(int d){
    		this.data=d;
    		this.next=null;
    	}
    }
    static class QueueLL{
    	static Node head=null;
    	static Node tail=null;
    	public static boolean isEmpty() {
    		return head==null&&tail==null;
    	}
    	public static void Enqueue(int data) {
    		Node newN=new Node(data);
    	    if(isEmpty()) {
    	    	tail=head=newN;
    	    	return;
    	    }
    	    tail.next=newN;
    	    tail=newN;
    	}
    	public static int Dequeue() {
    		if(isEmpty()) {
    			System.out.println("Queue is empty. No element will be deleted.");
    			return -1;
    		}
    		int delEle=head.data;
    		if(head==tail) {//for single element in the queue
    			tail=null;
    		}
    		head=head.next;
    		return delEle;
    	}
    	public static int Front() {
    		if(isEmpty()) {
    			System.out.println("Queue is empty.");
    			return -1;
    		}
    		return head.data;
    	}
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        QueueLL q=new QueueLL();
        q.Enqueue(1);
        q.Enqueue(2);
        q.Enqueue(3);
        System.out.println("Remove: "+q.Dequeue());
        q.Enqueue(4);
        System.out.println("Elements in the queue are: ");
        while(!q.isEmpty()) {
        	System.out.println(q.Front());
        	q.Dequeue();
        }
        //Queue<Character> q1=new LinkedList<>();
        Queue<Character> q1=new ArrayDeque<>();
        q1.add('a');
        q1.add('b');
        q1.add('c');
        q1.add('d');
        System.out.println("Elements in the queue using LL/AD are: ");
        while(!q1.isEmpty()) {
        	System.out.println(q1.peek());
        	q1.remove();
        }
        /*There is a difference in LL and AD in the cache memory 
          otherwise it is same for implementing the method*/
	}

}
