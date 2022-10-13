import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        // First in, Last out

        Stack<String> st = new Stack<String>();

        st.add("Lance");
        st.add("Bret");
        st.add("Doms");

        System.out.println(st.peek()); // printing only the first element that been putted last in the stack (not removing)
        System.out.println(st); // printing all the elements in the stack

        System.out.println(st.pop()); // getting the first element that been putted last in the stack and removing it into the values
        System.out.println(st); // printing all the elements in the stack

        System.out.println(st.contains("Bret")); // contain method

        
    }
    
}
