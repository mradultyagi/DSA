package LL;



public class LL {
    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size += 1;
    }
    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value + "->");
            temp=temp.next;
        }
        System.out.println("END");
    }
    //use void if you dont wany to return the removed value to show
    public int deletefirst(){

        if(head==null){
            tail=null;

        }
        int value= head.value;
        head=head.next;
        size--;
        return value;

    }
    public int deletelast(){
        if(size<=1){
            return deletefirst();

        }

        Node secondlast =  get(size-2);
        int val = tail.value;
        tail = secondlast;
        tail.next=null;
        size--;
        return val;

    }
    public int delete (int index){
        if(index==0){
            return deletefirst();
        }
        if(index==size-1){
            return deletelast();
        }
        Node prev = get(index-1);
        int val = prev.next.value;
        prev.next=prev.next.next;
        return head.value;


    }
    public Node get(int index){
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }
    public Node find(int value){
        Node node = head;
        while(node!=null){
            if(node.value == value){
                return node;
            }
            node=node.next;
        }
        return null;
    }
    public void insertlast(int val){

        if(tail == null){
            insertFirst(val);
            return;
        }

        Node node = new Node(val);
        tail.next=node;
        tail=node;
        size++;

    }
    public void insert (int val , int index){
        if(index == 0){
            insertFirst(val);
            return;
        }
        if(index==size){
            insertlast(val);
            return;
        }
        Node temp =head;
        for (int i = 1; i < index; i++) {
            temp=temp.next;

        }
        Node node = new Node(val , temp.next);
        temp.next=node;
        size++;

    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
