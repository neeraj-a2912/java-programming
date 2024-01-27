public class Main {
    public static void main(String[] args) {
        StackSLL<Integer> st = new StackSLL<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println("top value: "+st.peek());
        System.out.println("Original Stack");
        st.print();
        st.pop();
        st.pop();
        st.pop();
        st.pop();
        System.out.println(st.isEmpty());
        System.out.println("Stack after popping");
        st.print();
    }
}