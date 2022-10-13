import java.util.Iterator;
import java.util.LinkedList;

public class linkedlist {
    public static void main(String[] args) {
        LinkedList<String> link = new LinkedList<String>(); // linkedlist - string

        link.add("Lance"); // elements
        link.add("Dominic");
        link.add("Bret");
        link.add("Algen");
        link.add("Normel");
        link.add("Lineth");

        System.out.println(link.getFirst()); // only printing the first element
        System.out.println(link.get(1)); // getting the value of index 1
        link.remove("Lance"); // removing the value "Lance"

        System.out.println(link); // printing the elements in linkedlist

        for(String linky : link) { // printing the elements in linkedlist using for each loop
            System.out.println(linky);
        }

        Iterator ite = link.iterator(); // iterator object using the iterator function in the linked list
        while (ite.hasNext()) {
            if(ite.next() == "Algen") {
                System.out.println(link.indexOf("Algen")); // printing the index of the value "Algen"
            }
        }
    }
}
