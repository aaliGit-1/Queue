//Implement Queue using two stacks
import java.util.*;
public class Question1 {
    static class Queue{
    	static Stack<Integer> s1=new Stack<>();
    	static Stack<Integer> s2=new Stack<>();
        public static boolean isEmpty() {
        	return s1.isEmpty();
        }
        public static void addEle(int data) {
        	if(s1.isEmpty()) {
        		s1.push(data);
        	}
        	else {
        		while(!s1.isEmpty()) {
        			s2.push(s1.pop());
        		}
        		s1.push(data);
        		while(!s2.isEmpty()) {
       			    s1.push(s2.pop());
        		}
        		
        	}
        }
        public static int popELe() {
        	if(s1.isEmpty()) {
        		System.out.println("Queue is empty");
        		return -1;
        	}
        	
        	return s1.pop();
        }
        public static int peekELe() {
        	if(s1.isEmpty()) {
        		System.out.println("Queue is empty");
        		return -1;
        	}
        	return s1.peek();
        }
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Queue q=new Queue();
        q.addEle(10);
        q.addEle(20);
        q.addEle(30);
        q.addEle(40);
        System.out.println("Elements in the Queue:");
        System.out.println("Remove: "+q.popELe());
        while(!q.isEmpty()) {
        	System.out.println(q.peekELe());
        	q.popELe();
        }
	}

}
