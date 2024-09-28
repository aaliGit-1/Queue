# Queue
Practice Questions on Queue<br>
CirQ_Arr.java<br>
>Implementation of Circular Queue using Array<br>

Q_Arr.java<br>
>Implementation of Queue using Array<br>

Q_LL.java<br>
>Implementatiion of Queue using LinkedList<br>

Question1.java<br>
>Implement a Queue using two stacks<br>
Approach:<br>
Let take two stacks as S1 and S2 respectively.<br>
For 1st element:<br>
Add elements in the stack S1<br>
For nth element:<br>
Add elements to stack S2 which are popped from stack S1 and make the stack S1 empty.<br>
Add the nth element to stack S1 and push the popped element from S2 to S1.<br>
