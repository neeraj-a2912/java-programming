public class Main {
    public static void main(String[] args) {
        // Creating a linked list object
        SLL<String> list = new SLL<>();

        // Adding Elements

        list.add("java");
        list.add("is");
        list.add("my");
        list.add("favourite");
        list.add("programming");
        list.add("language");

        list.printLL();
//        System.out.println(list.contains("java"));

//        System.out.println("First Element "+list.getFirst());
//        System.out.println("last Element "+list.getLast());
//        System.out.println("Indexed Element "+list.getValueAtIndex(3));
//        System.out.println("Size of the LL: "+list.size());

    }
}