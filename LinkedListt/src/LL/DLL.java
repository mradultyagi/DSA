package LL;

public class DLL {
    private class Node{
        int val;
        Node head;
        Node next;
        Node prev;

        public Node( int val) {
            this.val=val;
        }
        public Node(int val,Node next,Node prev){
            this.val=val;
            this.next=next;
            this.prev=prev;
        }
        public void insertfirst(int val){
            Node node =  new Node(val);
            node.next = head;
            node.prev = null;
            if(head != null){
                head.prev = node;
            }
            head = node;
        }
        public Node find(int val){
            Node node = head;
            while(node!=null){
                if(node.val == val){
                    return node;
                }
                node=node.next;

            }
            return null;
        }
        public void insert(int after,int val){
            Node p = find(after);
            if(p==null){
                System.out.println("dosent exist");
                return;
            }
            Node node = new Node(val);
            node.next=p.next;
            p.next=node;
            node.prev=p;
            if(node.next!=null){
                node.next.prev=node;
            }


        }
        public void display(){
            Node node = head;
            while(node != null){
                System.out.print(node.val + "->");
                node=node.next;
            }
            System.out.println();
        }


    }
}
