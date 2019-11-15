// Simple Queue using a Circular Linked List type Data Structure
// Here, enque , dequeue takes o(1) complexity.
/* When compare to array implementation, the enqueue and 
dequeue have to iterate throught the entire array and resize them, hence their */
    public class CQueue
    {
        public CQueue( )
        {
            rear=null;
        }

        public boolean isEmpty()
	{
	    return (rear==null);
	}
        public void enQueue(Object i)
	{
            if (isEmpty()){
               CNode tmp= new CNode(i,null);
               rear=tmp;
               tmp.next=rear; 
            }
            else {
                CNode front=rear.next;
		rear.next= new CNode(i,front);
                rear=rear.next;
	    }
	}

        public Object deQueue()
	{
            if(isEmpty()){
		System.out.println("error: dequeue from empty queue!") ;
                return(null);
	    }
            else {
               CNode front=rear.next;
               Object x =front.data;
               if(rear==rear.next) rear=null; //deQueue single element
                else rear.next=front.next;
               return x;
	    }
	}

        public void printQueue() 
        { 
            System.out.print("the Queue: ");
            if (!isEmpty()) {
	      CNode p =rear.next;
              while (p!=rear){
		System.out.print(" " + p.data);
                p=p.next;
	      } 
              System.out.print(" " + p.data);
              System.out.println();
            } else System.out.println("Queue empty!") ;
        }

        public CNode rear;

        public static void main( String [ ] args )
        {
           CQueue Q = new CQueue();
           Object x;  int i;

           Q.printQueue();  //Checking if queue is empty or not. 

           for( i = 0; i < 5; i++ )
           {
                System.out.print("Enqueue " + i + " ");
                Q.enQueue( new Integer( i ));
                Q.printQueue();
           }
           System.out.println( "Dequeing" );
           while(!Q.isEmpty()) {
                 x = Q.deQueue();
                 System.out.print( "Dequeued " +(Integer)x +" ");
                 Q.printQueue();
	    }
            Q.deQueue();  //error: dequeue from empty queue

// Checking for a particular queue
            System.out.print("Enqueue " + 73 + " ");
            Q.enQueue(new Integer(73));
            Q.printQueue();
        }

    }