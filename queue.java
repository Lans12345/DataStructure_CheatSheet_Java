import java.util.Queue;
import java.util.LinkedList;
public class queue {

    public static void main(String[] args) {
        // First in, First out 
        
        Queue<String> qu = new LinkedList<String>();

        qu.add("Lance");
        qu.add("Bret");
        qu.add("Doms");

        System.out.println(qu.peek()); // peek method means printing the first element but not removing it to the values
        System.out.println(qu); // printing the elements

        System.out.println(qu.poll()); // poll method means removing the first element in the line (removing "Lance")
        System.out.println(qu); // printing the elements

        System.out.println(qu.contains("Doms")); // contains method
    }
    
}
