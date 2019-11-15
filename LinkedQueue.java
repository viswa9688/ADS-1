/* Queue.java */
 /* LinkedQueue.java */
import java.lang.Iterable;
import java.util.*;

public interface Queue <Item> extends Iterable <Item>
{
  Item delete(); // removes an item from the front of the queue
  void insert(Item item); // adds an item to the rear end of the queue
  boolean isEmpty(); // returns true if queue is empty, false otherwise
  int size();  // returns the number of items in the queue right now
}

class LinkedQueue <Item> implements Queue <Item>
{
  private Node front, rear; //begin and end nodes
  private int size; // number of items
 
  //nested class to define node
  private class Node
  { 
    Item item;
    Node next;
  }
 
  //Zero argument constructor
  public LinkedQueue()
  {
    front = null;
	rear = null;
    size = 0;
  }
 
  public boolean isEmpty()
  {
    return (size == 0);
  }
 
  //Remove item from the beginning of the list.
  public Item delete()
  {
    Item item = rear.next.item;
    rear.next = rear.next.next;
    if (isEmpty())  
    {
      rear.next = rear;
    }
    size--;
    return item;
  }
 
  //Add item to the end of the list.
  public void insert(Item item)
  {
    Node oldRear = rear;
    rear = new Node();
    rear.item = item;
    rear.next = oldRear;
    if (isEmpty()) 
    {
      rear.next = rear;
    }
    else 
    {
      oldRear.next = rear;
      rear.next=oldRear;
    }
    size++;
  }
 
  public int size()
  {
    return size;
  }
 
  //Iterator for traversing queue items
  public Iterator<Item> iterator()
  {
    return new LinkedQueueIterator();
  }
 
  //inner class to implement iterator interface
  private class LinkedQueueIterator implements Iterator <Item>
  {
    private int i = size;
    private Node first = front; //the first node
 
    public boolean hasNext()
    {
      return (i > 0);
    }
 
    public Item next()
    {
      Item item = first.item;
      first = first.next;
      i--;
      return item;
    }
 
    public void remove()
    {
      // not needed
    }
  }
}

