import java.io.PrintStream;
import java.util.NoSuchElementException;

public class DoubleEndedQueue_Implementation<T> implements DoubleEndedQueue<T> {

    private Node first;
    private Node last;
    private int N;

    public DoubleEndedQueue_Implementation() {}

    public class Node{
        private T item;
        private Node next = null;
        private Node previous = null;

        Node (T data){
            this.item = data;
        }
    }

    @Override
    public boolean isEmpty() {
        return first==null;
    }

    @Override
    public void addFirst(T item) {
        if (isEmpty()){
            Node n = new Node(item);
            first = n;
            last = first;
        }
        else {
            Node n = new Node(item);
            n.next = first;
            first.previous = n;
            first = n;
        }
        N++;
    }

    @Override
    public T removeFirst() throws NoSuchElementException {
        if (isEmpty()){
            throw new NoSuchElementException("Method: 'removeFirst' - The Queue is Empty");
        }
        T return_T = getFirst();
        if (first == last){
            first = last = null;
        }
        else {
            first = first.next;
            first.previous = null;
        }
        N--;
        return return_T;
    }

    @Override
    public void addLast(T item) {
        if (isEmpty()){
            Node n = new Node(item);
            last = n;
            first = last;
        }
        else {
            Node n = new Node(item);
            n.previous = last;
            last.next = n;
            last = n;
        }
        N++;
    }

    @Override
    public T removeLast() throws NoSuchElementException {
        if (isEmpty()){
            throw new NoSuchElementException("Method: 'removeLast' - The Queue is Empty");
        }
        T return_t = getLast();
        if (last == first){
            last = first = null;
        }
        else {
            last = last.previous;
            last.next = null;
        }
        N--;
        return return_t;
    }

    @Override
    public T getFirst() {
        if (isEmpty()){
            throw new NoSuchElementException("Method: 'getFist' - The Queue is Empty");
        }
        else {
            return first.item;
        }
    }

    @Override
    public T getLast() {
        if (isEmpty()){
            throw new NoSuchElementException("Method: 'getLast' - The Queue is Empty");
        }
        else {
            return last.item;
        }
    }

    @Override
    public void printQueue(PrintStream stream) {
        if (isEmpty()){
            stream.println("The Queue is Empty");
        }
        else {
            Node n = first;
            int i = 1;
            while (n != null){
                stream.print(i + ". ");
                stream.println(n.item);
                n = n.next;
                i++;
            }
        }
    }

    @Override
    public int size() {
        return N;
    }

}
