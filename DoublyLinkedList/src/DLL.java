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
    Node head; // initializing head

    // checks if the list is empty
    public boolean isEmpty(){
        return size == 0;
    }

    // returns the size of the list
    public int size(){
        return size;
    }

    // Methods to add elements to the linked list
    // Adds element at First Index
    public void addFirst(T data){
        Node newNode = new Node(data);
        if(isEmpty()){
            head = newNode;
            size++;
            return;
        }
        newNode.next = head;
        newNode.prev = null;
        head.prev = newNode;
        head = newNode;
        size++;
    }

    // Adds element at Last Index
    public void add(T data){
        Node newNode = new Node(data);
        if(isEmpty()){
            head = newNode;
            size++;
            return;
        }
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        newNode.prev = currNode;
        currNode.next = newNode;
        size++;
    }

    // Adds element at Last Index
    public void addLast(T data){
        Node newNode = new Node(data);
        if(isEmpty()){
            head = newNode;
            size++;
            return;
        }
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        newNode.prev = currNode;
        currNode.next = newNode;
        size++;
    }

    // Adds element at a given index
    public void addAtIndex(int index, T data){
        Node newNode = new Node(data);
        if(index>size){
            add(data);
            size++;
            return;
        }
        Node currNode = head;
        for(int i=1; i<index-1; i++) {
            currNode = currNode.next;
        }
        newNode.next = currNode.next;
        currNode.next.prev = newNode;
        currNode.next = newNode;
        size++;
    }


    // Methods to Delete Elements from the linked list
    // Removes Head
    public void removeFirst(){
        if(head==null){
            System.out.println("List is Empty");
            return;
        }
        head = head.next;
        head.next.prev = null;
        size--;
    }

    // Removes Element at the last
    public void removeLast(){
        if(head==null){
            System.out.println("List is Empty");
            return;
        }
        Node currNode = head;
        while(currNode.next.next != null){
            currNode = currNode.next;
        }
        currNode.next = null;
        size--;
    }

    // Removes element at a given index
    public void removeAtIndex(int index){
        if(index>size){
            System.out.println("Index Out of Bounds");
            return;
        }
        Node currNode = head;
        for(int i=1; i<index-1; i++){
            currNode = currNode.next;
        }
        currNode.next.next.prev = currNode;
        currNode.next = currNode.next.next;
        size--;
    }


    // Methods to get values of the nodes
    // value of head
    public T getFirst(){
        if(head==null){
            System.out.println("List is Empty");
            return null;
        }
        return head.data;
    }

    // value of node at last index
    public T getLast(){
        if(isEmpty()){
            System.out.println("List is Empty");
            return null;
        }
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        return currNode.data;
    }

    // value of a node at a given index
    public T getValueAtIndex(int index){
        if(index>size){
            System.out.println("Index Out Of Bounds");
            return null;
        }
        Node currNode = head;
        for(int i=1; i<index; i++){
            currNode = currNode.next;
        }
        return currNode.data;
    }

    // method to check whether a given value exists in the list
    public boolean contains(T val){
        Node currNode = head;
        while(currNode != null){
            if(currNode.data==val){
                return true;
            }
            currNode = currNode.next;
        }
        return false;
    }

    // method to print the linked list
    public void printLL(){
        if(isEmpty()){
            System.out.println("LinkedList is Empty");
            return;
        }
        Node currNode = head;
        System.out.print("null<->");
        while(currNode!=null){
            System.out.print(currNode.data+"<->");
            currNode = currNode.next;
        }
        System.out.println("null");
    }
}
