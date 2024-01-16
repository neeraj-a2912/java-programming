import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,0,3,5};
        System.out.println(Arrays.toString(nextGreaterEle(arr)));
    }

    public static int[] nextGreaterEle(int[] numbers){
        Stack<Integer> st = new Stack<>();
        int[] result = new int[numbers.length];
        Arrays.fill(result,-1);
        for (int i = 0; i < numbers.length; i++) {
            while(!st.isEmpty() && numbers[st.peek()]<numbers[i]){
                int stackTop = st.pop();
                result[stackTop] = numbers[i];
            }
            st.push(i);
        }
        return result;
    }



}