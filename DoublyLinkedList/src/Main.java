public class Main {
    public static void main(String[] args) {
        DLL<Integer> list = new DLL<>();
        list.add(2);
        list.addFirst(1);
        list.addLast(5);
        list.printLL();
        list.addAtIndex(3,3);
        list.addAtIndex(4,4);
        list.printLL();
        list.removeAtIndex(3);
        list.removeFirst();
        list.removeLast();
        list.printLL();
//        System.out.println(list.getFirst());
//        System.out.println(list.getLast());
//        System.out.println(list.getValueAtIndex(3));
//        System.out.println(list.size());
//        System.out.println(list.contains(7));
//        System.out.println(list.contains(3));
    }
}