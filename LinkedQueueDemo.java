/* LinkedQueueDemo.java */
 /* LinkedQueue.java */
import java.lang.Iterable;
import java.util.*;
public class LinkedQueueDemo
{
  public static void main (String a[])
  {
    Queue <Integer> q = new LinkedQueue<Integer>();
    q.insert(20);
    q.insert(30);
    q.insert(40);
    q.insert(50);
    q.insert(60);
    q.insert(70);
 
    System.out.println("Delete an item from queue: " + q.delete());    
    System.out.println("Size of the queue: " + q.size());
 
    // iterate through queue
    System.out.println("Queue contains following items till this moment:");
    for (Integer i : q)
    {
      System.out.println(i);
    }  
  }
}