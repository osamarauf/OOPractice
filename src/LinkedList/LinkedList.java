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

    public void deleteAtLast(int val){
        if (tail==null){
            insertAtFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size+=1;
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

        list.insertAtLast(7);

        list.display();
    }
}
