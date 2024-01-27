public class StackSLL<T> {

    class Node{
        T data;
        Node next;

        Node(T data){
            this.data = data;
            this.next = null;
        }
    }

    Node top;
    int size=0;

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return top==null;
    }

    public void push(T data){
        Node newNode = new Node(data);
        if(isEmpty()){
            top = newNode;
            size++;
            return;
        }
        newNode.next = top;
        top = newNode;
        size++;
    }

    public T pop(){
        if(isEmpty()){
            return null;
        }
        T topValue = top.data;
        top = top.next;
        size--;
        return topValue;
    }

    public T peek(){
        if(isEmpty()){
            return null;
        }
        return top.data;
    }

    public void print(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return;
        }
        Node curr = top;
        System.out.println("--");
        while(curr!=null){
            System.out.println(curr.data);
            System.out.println("--");
            curr = curr.next;
        }
    }

}
