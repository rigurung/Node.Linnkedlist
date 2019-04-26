class Node{
    int value;
    Node next;

    public Node(int value){ // to create new node
        this.value = value;
        this.next = null; // the next node
    }
}

public class DemoLinkedList { //creating linked list
    Node first; //the first node in the linked list

    //method to insert value in the linked list //inserts value next to the last node
    public void insert(int value){
        Node current = first; //the current node will move from the start

        while (current.next != null){ //while the next node isn't null, the current will takeover the value of the next node continuously
            current = current.next;
        }

        Node newNode = new Node(value); //now we are creating a node with the given value and the next node as null
        current.next = newNode; //the node which was null before-- now has new node and the next node is now null
    }

    public void printList(){ //method to print the Linked-list
        Node current = first; //again, starting from the first node
        while (current != null){ //till the node isn't null
            System.out.println(current.value); //we are going to print the value
            current= current.next; //moving the node from the first to next and then again, to next
        }
    }

    public void deleteItem(int item){ //method to delete the item in the linked-list
        if(item == first.value){ //if the value is first we are simply gonna change the first node to next node
            first = first.next;
            return;
        }else { //if the value is in the middle or else --
            Node current = first; //we are still gonna start from first
            while (current.next.value != item){ //we are gonna check the next value so that we can stop ahead
                current = current.next; //if the value isn't the next, we are moving the current value ahead in linked-list
            }
            //if the value is equal to the linked list item, it will break through the loop
            current.next = current.next.next; //and now, we are changing the current.next or just say skipping the node and pointing whats ahead of the current.next node
            return;
        }

    }


    public boolean search(int item){ //method to search the iteam in the list
        Node current = first;
        while(current != null){ //until the list don't end, we are gonna check //unless the value matches the item and return true
            if(current.value == item){
                return true;
            }
            current = current.next; //if there is no return, this moves the current
        }
        return false; //if not found, the method returns false
    }


    public static void main(String[]args){
        DemoLinkedList Linkedlist = new DemoLinkedList();
        Linkedlist.first = new Node(12);
        Linkedlist.insert(15);
        Linkedlist.insert(20);

        Linkedlist.insert(30);

        Linkedlist.insert(40);

        Linkedlist.insert(55);

        Linkedlist.printList();
        Linkedlist.deleteItem(30);
        Linkedlist.printList();
        System.out.println(Linkedlist.search(40));
        System.out.println(Linkedlist.search(12));

    }

}
