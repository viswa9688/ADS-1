import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 *  @author Robert Sedgewick
 *  @author Harika
 *
 *  @param <Key> the generic type of key on this priority queue
 */

public class MaxPQ<Key> implements Iterable<Key> {
    
    /**
     * Initializes an empty priority queue with the given initial capacity.
     *
     * @param  initCapacity the initial capacity of this priority queue
     */
    public MaxPQ(int initCapacity) {
        pq = (Key[]) new Object[initCapacity + 1];
        n = 0;
    }

    
