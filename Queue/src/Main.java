public class Main {
    public static void main(String[] args) {
        Queue<Integer> q = new Queue<>();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        q.printQueue();
        q.dequeue();
        q.dequeue();
        q.printQueue();
        System.out.println(q.front());
        System.out.println(q.size() );
    }
}