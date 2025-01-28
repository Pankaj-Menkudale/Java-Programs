public class LL {
    
    Node head;
    private int size;

      LL(){
        this.size=0;
     }

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            next=null;
            size++;
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
    public void addLast(int data)
  {
    Node newNode=new Node(data);
    Node current=head;

    while(current.next!=null){
 
        current=current.next;
    }
    current.next=newNode;

}

public void print(){
    if(head==null){
        System.out.println("List is empty");
        return;
    }

    Node current=head;;

    while(current!=null){

        System.out.print(current.data+ "->");

        current=current.next;
    }
    System.out.println("null");
}

public void removeFirst(){

    if(head==null){
        System.out.println("List is empty");
        return;
    }
    size--;
    head=head.next;
}
public void removeLast(){

    if(head==null){
        System.out.println("List is empty");
        return;
    }
   
    Node secondLast=head;
    Node lastNode=head.next;

    while(lastNode.next!=null){
        lastNode=lastNode.next;
        secondLast=secondLast.next;
    }
    size--;
    secondLast.next=null;

}
public int getSize() {
    return size;
}
public void addthirdPosition(int data){
    Node newNode=new Node(data);
    Node current=head;
    int i=1;
    while (i < 2 && current.next != null) {
        current = current.next;
        i++;
    }

    // Insert the new node
    newNode.next = current.next; // Point new node to the 3rd node
    current.next = newNode;
}
public void reverseLinked(){

    if(head==null || head.next==null){
        return;
    }

    Node prevNode=head;
    Node currentNode=head.next;
    while(currentNode!=null){
        Node nextNode=currentNode.next;
        currentNode.next=prevNode;

        //update


        prevNode=currentNode;
        currentNode=nextNode;
    }

    head.next=null;
    head=prevNode;
}
public Node reverseRecursion(Node head){
    if(head==null || head.next==null){
        return head;
    }

    Node newHead=reverseRecursion(head.next);
    head.next.next=head;
    head.next=null;
    return newHead;
}
 public static void main(String[] args) {
        LL list=new LL();

        System.out.println("After add first node");
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.print();
        list.addFirst(4);
        list.print();
        System.out.println("After add last nofe");
        list.addLast(5);
        list.print();
        System.out.println("After remove first node");
        list.removeFirst();
        list.print();
        System.out.println("After remove last node");
        list.removeLast();
        list.print();
        list.addFirst(6);
        list.print();
        list.addFirst(7);
        list.print();
        list.removeFirst();
        list.addthirdPosition(10);
        list.print();
        // System.out.println(list.getSize());
        list.reverseLinked();
        list.print();
       list.head= list.reverseRecursion(list.head);
       list.print();
  


    }
}
