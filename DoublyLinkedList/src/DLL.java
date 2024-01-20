public class DLL <T>{
    private int size;
    class Node{
        T data;
        Node next;
        Node prev;
        Node(T data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    Node head;


}
