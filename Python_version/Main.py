from DoubleEndedQueue_Implementation import *

menu_answer = ""
input_answer = ""

deq = DoubleEndedQueue_Implementation[str]()

while menu_answer != "9":
    print("\nMenu: ")
    print("1. Add First")
    print("2. Remove First")
    print("3. Add Last")
    print("4. Remove Last")
    print("5. Get First")
    print("6. Get Last")
    print("7. Get the size of the Queue")
    print("8. Print Queue")
    print("9. Exit")
    menu_answer = input("> ")

    if menu_answer == "1":
        print("\nSelection to add an item at the Front of the Queue")
        input_answer = input("Give the item you want: ")
        deq.addFirst(input_answer)
    elif menu_answer == "2":
        print("\nSelection to Remove the First item of the Queue")
        print("Removed item:", deq.removeFirst())
    elif menu_answer == "3":
        print("\nSelection to add an item at the End of the Queue")
        input_answer = input("Give the item you want: ")
        deq.addLast(input_answer)
    elif menu_answer == "4":
        print("\nSelection to Remove the Last item of the Queue")
        print("Removed item:", deq.removeLast())
    elif menu_answer == "5":
        print("\nSelection to get the First item of the Queue")
        print("Returned item:", deq.getFirst())
    elif menu_answer == "6":
        print("\nSelection to get the Last item of the Queue")
        print("Returned item:", deq.getLast())
    elif menu_answer == "7":
        print("\nSelection to get the Size of the Queue")
        print("Size of Queue:", deq.getSize())
    elif menu_answer == "8":
        deq.printQueue()
