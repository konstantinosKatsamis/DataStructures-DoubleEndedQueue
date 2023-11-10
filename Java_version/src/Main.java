import java.util.Scanner;

public class Main {

    public static void main(String args[]){

        DoubleEndedQueue_Implementation<Integer> deq = new DoubleEndedQueue_Implementation<Integer>();
        Scanner in = new Scanner(System.in);
        String answer = "";

        do{
            System.out.println("\nMenu: ");
            System.out.println("1. Add First");
            System.out.println("2. Remove First");
            System.out.println("3. Add Last");
            System.out.println("4. Remove Last");
            System.out.println("5. Get First");
            System.out.println("6. Get Last");
            System.out.println("7. Get the size of the Queue");
            System.out.println("8. Print Queue");
            System.out.println("9. Exit");
            System.out.print("> ");
            answer = in.next();

            switch (answer){
                case "1":
                    System.out.println("\nSelection to add an item at the Front of the Queue");
                    System.out.print("Give the item you want: ");
                    answer = in.next();
                    deq.addFirst(Integer.valueOf(answer));
                    break;

                case "2":
                    System.out.println("\nSelection to Remove the First item of the Queue");
                    System.out.println("Removed item: " + deq.removeFirst());
                    break;

                case "3":
                    System.out.println("\nSelection to add an item at the End of the Queue");
                    System.out.print("Give the item you want: ");
                    answer = in.next();
                    deq.addLast(Integer.valueOf(answer));
                    break;

                case "4":
                    System.out.println("\nSelection to Remove the Last item of the Queue");
                    System.out.println("Removed item: " + deq.removeLast());
                    break;

                case "5":
                    System.out.println("\nSelection to get the First item of the Queue");
                    System.out.println("Returned item: " + deq.getFirst());
                    break;

                case "6":
                    System.out.println("\nSelection to get the Last item of the Queue");
                    System.out.println("Returned item: " + deq.getLast());
                    break;

                case "7":
                    System.out.println("\nSelection to get the Size of the Queue");
                    System.out.println("Size of Queue: " + deq.size());
                    break;

                case "8":
                    System.out.println("Selection for Print the Queue");
                    deq.printQueue(System.out);
                    break;

            }
        } while(!answer.equals("9"));

    }

}
