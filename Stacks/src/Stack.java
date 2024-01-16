import java.util.ArrayList;

public class Stack<T> {
    private ArrayList<T> st;
    Stack(){
        st = new ArrayList<T>();
    }
    public boolean isEmpty(){
        return st.isEmpty();
    }
    public void push(T x){
        st.add(x);
    }
    public T pop(){
        if(isEmpty()){
            System.out.println("Stack Underflow");
        }
        return st.remove(st.size()-1);
    }

    public T peek(){
        return st.get(st.size()-1);
    }
    public void printStack(){
        for (int i = 0; i < st.size()-1; i++) {
            System.out.print(st.get(i)+"->");
        }
        System.out.println(st.get(st.size()-1));
    }

}