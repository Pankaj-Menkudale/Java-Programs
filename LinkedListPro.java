public class LinkedListPro{

    Node head;

    class Node{

        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public void addFirst(int data){

        Node newNode=new Node(data);

        if(head==null){
            head=newNode;
            return;
        }

        newNode.next=head;
        head=newNode;
    }
    public void addLast(int data){

        Node newNode=new Node(data);
        Node current=head;

        if(head==null){
            head=newNode;
            return;
        }

        while(current!=null){
            current.next
        }
        current.next=newNode;

    }

    public void print(){

        Node current=head;

        while(current!=null){
            System.out.print(current.data +"->");
            current=current.next;
        }
        System.out.print("null");
    }
    public static void main(String[] args) {
        
        LinkedListPro obj=new LinkedListPro();
        obj.addFirst(1);
        obj.addFirst(2);
        obj.addFirst(3);
        obj.print();
    }
}