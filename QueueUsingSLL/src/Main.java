public class Main {
    public static void main(String[] args) {
        QueueSLL<Integer> q = new QueueSLL<>();
        q.enqueue(10);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        q.printQueue();
        System.out.println();
        q.dequeue();
//        System.out.println(q.peek());
        q.enqueue(6);
        q.printQueue();
    }
}