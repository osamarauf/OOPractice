package LinkedList;


public class LinkedList {

    private Node head;
    private Node tail;
    private int size;
    public LinkedList(){
        this.size=0;
    }

    private class Node {
        int value;
        Node next;

        public Node(int value){
            this.value = value;
            this.next = null;
        }
        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }

    public void insertAtFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        if (tail==null){
            tail = head;
        }
        size+=1;
    }

    public void deleteAtFirst(){
        head = head.next;
        if(head == null){
            tail=null;
        }
        size--;
    }

    public void deleteAtLast(){

        Node temp = head;
        Node previous = null;
        while (temp.next!=null){
            previous = temp;
            temp = temp.next;
        }
        if (previous != null) {
            previous.next=null;
        }
        size--;
    }

    public void insertAtLast(int val){
        if (tail==null){
            insertAtFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size+=1;
    }


    public void insert(int val, int index){
        if (tail==null){
            insertAtFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size+=1;
    }

    public void insertPosition(int pos, int data) {
        Node new_node = new Node(data);
        new_node.value = data;
        new_node.next = null;

        if(pos < 1 || pos > size + 1)
            System.out.println("Invalid\n");
        else if(pos == 1){
            new_node.next = head;
            head = new_node;
            size++;
        } else {
            Node temp = head;
            while(--pos > 1){
                temp = temp.next;
            }
            new_node.next= temp.next;
            temp.next = new_node;
            size++;
        }
    }

    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtFirst(3);
        list.insertAtFirst(5);
        list.insertAtFirst(2);
//        list.insertAtLast(7);
//
//        list.insertPosition(3, 4);

        list.display();

        list.deleteAtLast();

        list.display();
    }
}
