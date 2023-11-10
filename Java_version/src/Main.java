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
            answer = in.next();

            switch (answer){
                case "1":
                    System.out.println("\nSelection for add item at First");
                    System.out.println("Give the item you want");
                    answer = in.next();
                    deq.addFirst(Integer.valueOf(answer));
                    break;

                case "2":
                    break;

                case "3":
                    break;

                case "4":
                    break;

                case "5":
                    break;

                case "6":
                    break;

                case "7":
                    break;

                case "8":
                    System.out.println("Selection for Print the Queue");
                    deq.printQueue(System.out);
                    break;

            }
        } while(!answer.equals("9"));
        
    }

}
