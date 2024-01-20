class SLL<T> {
    private int size = 0;
    class Node{
        T data;
        Node next;

        Node(T data){
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    // Methods to add elements to the linked list
    // Adds element at First Index
    public void addFirst(T data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // Adds element at Last Index
    public void addLast(T data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    // Adds element at Last Index
    public void add(T data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    // Adds element at a given index
    public void addAtIndex(int index, T data){
        Node newNode = new Node(data);
        size++;
        if(index>size){
            add(data);
            return;
        }
        Node currNode = head;
        for(int i=1; i<index-1; i++){
            currNode = currNode.next;
        }
        // 1->3->4-null
        newNode.next = currNode.next;
        currNode.next = newNode;

    }

    // Methods to Delete Elements from the linked list
    // Removes Head
    public void removeFirst(){
        if(head==null){
            System.out.println("List is Empty");
            return;
        }
        head = head.next;
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
        if(head==null){
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
    // method to get the size of the linked list
    public int size(){
        return size;
    }

    // method to print the linked list
    public void printLL(){
        if(head==null){
            System.out.println("LinkedList is Empty");
            return;
        }
        Node currNode = head;
        while(currNode!=null){
            System.out.print(currNode.data+"->");
            currNode = currNode.next;
        }
        System.out.println("null");
    }
}