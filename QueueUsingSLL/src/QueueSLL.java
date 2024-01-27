public class QueueSLL<T> {
     class Node{
        T data;
        Node next;

        Node(T data){
            this.data = data;
            this.next = null;
        }
    }
    Node front = null, rear = null;
    int size = 0;

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return front==null;
    }

    public void enqueue(T data){
        Node newNode = new Node(data);
        if(front == null){
            front = newNode;
        }else {
            rear.next = newNode;
        }
        rear = newNode;
        size++;
    }

    public T dequeue(){
        if(front==null){// can also be done by isEmpty()
            System.out.println("Queue is Empty!");
            return null;
        }
        T data = front.data;
        front = front.next;
        size--;
        return data;
    }

    public T peek(){
        if(front==null){ // can also be done by isEmpty()
            System.out.println("Queue is Empty!!");
            return null;
        }
        return front.data;
    }

    public void printQueue(){
        if(front==null) {// can also be done by isEmpty()
            System.out.println("Queue is Empty");
            return;
        }
        Node curr = front;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
    }
}
