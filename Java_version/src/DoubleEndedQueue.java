import java.io.PrintStream;
import java.util.NoSuchElementException;

/**
 * Defines the methods for a Double-ended Queue
 */

public interface DoubleEndedQueue<T> {
    /**
     * @return true if the queue is empty
     */
    public boolean isEmpty();

    /**
     * insert an item at the front of the queue
     */
    public void addFirst(T item);

    /**
     * remove and return the item at the front of the queue
     * @return the item from the front of the queue
     * @throws NoSuchElementException if the queue is empty
     */
    public T removeFirst() throws NoSuchElementException;

    /**
     * insert an item at the end of the queue
     */
    public void addLast(T item);

    /**
     * remove and return the item at the end of the queue
     * @return the item from the end of the queue
     * @throws NoSuchElementException if the queue is empty
     */
    public T removeLast() throws NoSuchElementException;

    /**
     * return without removing the item at the front of the queue
     * @return the item from the front of the queue
     * @throws NoSuchElementException if the queue is empty
     */
    public T getFirst();

    /**
     * return without removing the item at the end of the queue
     * @return the item from the end of the queue
     * @throws NoSuchElementException if the queue is empty
     */
    public T getLast();

    /**
     * print the items of the queue, starting from the front,
     * to the print stream given as argument. For example, to
     * print the elements to the
     * standard output, pass System.out as parameter. E.g.,
     * printQueue(System.out);
     */
    public void printQueue(PrintStream stream);

    /**
     * return the size of the queue, 0 if empty
     * @return number of elements in the queue
     */
    public int size();
}
