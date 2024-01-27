import java.util.ArrayList;

public class Queue <T>{
    private ArrayList<T> q;
    Queue(){
        q = new ArrayList<>();
    }
    public int size(){
        return q.size();
    }
    public boolean isEmpty(){
        return q.isEmpty();
    }

    public void enqueue(T val){
        q.add(val);
    }

    public T dequeue(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return null;
        }
        return q.remove(0);
    }

    public T front(){
            return q.get(0);
    }

    public void printQueue(){
        System.out.println(q);
    }

}
