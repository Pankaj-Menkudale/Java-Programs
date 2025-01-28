public class StackEx{

    Node top;


    class Node{

        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public void push(int data){
        Node newNode = new Node(data);
        if (top == null) {
            top = newNode;
            return;
        }

        newNode.next=top;
        top=newNode;

    }
    public void display(){
        Node n = top;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
            }
            System.out.println();
            

    }

    public void pop(){
        if(top==null){
            System.out.println("Stack is empty");
            return;
            }
            Node temp=top;
            top=top.next;
            temp.next=null;
            
    }

    public void peek(){
        if(top==null){
            System.out.println("Stack is empty");
            return;
        }
            
            System.out.println(top.data);
    }
    public static void main(String[] args) {
        StackEx obj = new StackEx();
        obj.push(10);
        obj.push(20);
        obj.push(30);
        obj.push(40);
        obj.push(50);
        obj.display();
        System.out.println("after pop elements");
        obj.pop();
        obj.display();
        obj.peek();

        }
       


}