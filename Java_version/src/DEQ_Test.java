import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.NoSuchElementException;

public class DEQ_Test {

    @Test
    public void isEmptyTrue(){
        DoubleEndedQueue_Implementation<Integer> deq = new DoubleEndedQueue_Implementation<Integer>();
        Assertions.assertEquals(true, deq.isEmpty());
    }

    @Test
    public void isEmptyFalse(){
        DoubleEndedQueue_Implementation<Integer> deq = new DoubleEndedQueue_Implementation<Integer>();
        deq.addFirst(11);
        Assertions.assertEquals(false, deq.isEmpty());
    }

    @Test
    public void additionFirstAndSize(){
        DoubleEndedQueue_Implementation<Integer> deq = new DoubleEndedQueue_Implementation<Integer>();
        deq.addFirst(1);
        Assertions.assertEquals(1, deq.size());
    }

    @Test
    public void additionMultipleFirstAndSize(){
        DoubleEndedQueue_Implementation<Integer> deq = new DoubleEndedQueue_Implementation<Integer>();
        deq.addFirst(11);
        deq.addFirst(22);
        deq.addFirst(33);
        Assertions.assertEquals(3, deq.size());
    }

    @Test
    public void additionLastAndSize(){
        DoubleEndedQueue_Implementation<Integer> deq = new DoubleEndedQueue_Implementation<Integer>();
        deq.addLast(1);
        Assertions.assertEquals(1, deq.size());
    }

    @Test
    public void additionMultipleLastAndSize(){
        DoubleEndedQueue_Implementation<Integer> deq = new DoubleEndedQueue_Implementation<Integer>();
        deq.addLast(1);
        deq.addLast(12);
        deq.addLast(13);
        deq.addLast(133);
        Assertions.assertEquals(4, deq.size());
    }

    @Test
    public void removeFirst(){
        DoubleEndedQueue_Implementation<Integer> deq = new DoubleEndedQueue_Implementation<Integer>();
        deq.addLast(5);
        deq.addLast(12);
        deq.addLast(13);
        deq.addLast(133);
        Assertions.assertEquals(5, deq.removeFirst());
    }

    @Test
    public void removeFirstTwice(){
        DoubleEndedQueue_Implementation<Integer> deq = new DoubleEndedQueue_Implementation<Integer>();
        deq.addLast(5);
        deq.addLast(12);
        deq.addLast(13);
        deq.addLast(133);
        Assertions.assertEquals(5, deq.removeFirst());
        Assertions.assertEquals(12, deq.removeFirst());
    }

    @Test
    public void removeLast(){
        DoubleEndedQueue_Implementation<Integer> deq = new DoubleEndedQueue_Implementation<Integer>();
        deq.addLast(5);
        deq.addLast(12);
        deq.addLast(13);
        deq.addLast(133);
        Assertions.assertEquals(133, deq.removeLast());
    }

    @Test
    public void removeLastTwice(){
        DoubleEndedQueue_Implementation<Integer> deq = new DoubleEndedQueue_Implementation<Integer>();
        deq.addLast(25);
        deq.addLast(212);
        deq.addLast(213);
        deq.addLast(1233);
        Assertions.assertEquals(1233, deq.removeLast());
        Assertions.assertEquals(213, deq.removeLast());
    }

    @Test
    public void removeLastremoveFirstTwice(){
        DoubleEndedQueue_Implementation<Integer> deq = new DoubleEndedQueue_Implementation<Integer>();
        deq.addLast(25);
        deq.addLast(212);
        deq.addLast(213);
        deq.addLast(1233);
        Assertions.assertEquals(1233, deq.removeLast());
        Assertions.assertEquals(25, deq.removeFirst());
        Assertions.assertEquals(212, deq.removeFirst());
    }

    @Test
    public void removeFirstremoveLastTwice(){
        DoubleEndedQueue_Implementation<Integer> deq = new DoubleEndedQueue_Implementation<Integer>();
        deq.addLast(25);
        deq.addLast(212);
        deq.addLast(213);
        deq.addLast(1233);
        Assertions.assertEquals(25, deq.removeFirst());
        Assertions.assertEquals(1233, deq.removeLast());
        Assertions.assertEquals(213, deq.removeLast());
    }

    @Test
    public void getFirstgetLastgetLast(){
        DoubleEndedQueue_Implementation<Integer> deq = new DoubleEndedQueue_Implementation<Integer>();
        deq.addLast(25);
        deq.addLast(212);
        deq.addLast(213);
        deq.addLast(1233);
        Assertions.assertEquals(25, deq.getFirst());
        Assertions.assertEquals(1233, deq.getLast());
        Assertions.assertEquals(1233, deq.getLast());
    }

    @Test
    public void getFirstremoveLastgetLast(){
        DoubleEndedQueue_Implementation<Integer> deq = new DoubleEndedQueue_Implementation<Integer>();
        deq.addLast(25);
        deq.addLast(212);
        deq.addLast(213);
        deq.addLast(1233);
        Assertions.assertEquals(25, deq.getFirst());
        Assertions.assertEquals(1233, deq.removeLast());
        Assertions.assertEquals(213, deq.getLast());
    }

    @Test
    public void getFirstremoveFirstremoveLastgetLast(){
        DoubleEndedQueue_Implementation<Integer> deq = new DoubleEndedQueue_Implementation<Integer>();
        deq.addLast(25);
        deq.addLast(212);
        deq.addLast(2142);
        deq.addLast(213333);
        deq.addLast(1233);
        Assertions.assertEquals(25, deq.getFirst());
        Assertions.assertEquals(25, deq.removeFirst());
        Assertions.assertEquals(1233, deq.removeLast());
        Assertions.assertEquals(213333, deq.getLast());
    }

    @Test
    public void getFirstException(){
        DoubleEndedQueue_Implementation<Integer> deq = new DoubleEndedQueue_Implementation<Integer>();
        Assertions.assertThrows(NoSuchElementException.class, ()->{deq.getFirst();});
    }

    @Test
    public void getLastException(){
        DoubleEndedQueue_Implementation<Integer> deq = new DoubleEndedQueue_Implementation<Integer>();
        Assertions.assertThrows(NoSuchElementException.class, ()->{deq.getLast();});
    }

    @Test
    public void removeFirstException(){
        DoubleEndedQueue_Implementation<Integer> deq = new DoubleEndedQueue_Implementation<Integer>();
        Assertions.assertThrows(NoSuchElementException.class, ()->{deq.removeFirst();});
    }

    @Test
    public void removeLastException(){
        DoubleEndedQueue_Implementation<Integer> deq = new DoubleEndedQueue_Implementation<Integer>();
        Assertions.assertThrows(NoSuchElementException.class, ()->{deq.removeLast();});
    }

}
