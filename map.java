import java.util.HashMap;
import java.util.Scanner;

public class map {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> hm = new HashMap<String, Integer>();

        hm.put("a", 5); // keys, values
        hm.put("b", 10);
        hm.put("c", 15);

        System.out.println(hm); // printing all the keys and values
        System.out.println(hm.get("b")); // printing the value of key "b"
        System.out.println(hm.keySet()); // printing all the key
        System.out.println(hm.values()); // printing all the values
        System.out.println(hm.containsKey("b")); // checking if the hashmap contains a key "b"
        System.out.println(hm.containsValue(12)); // checking if the hashmap contains a value "12"



        // Putting User Input to the Hashmap
        HashMap<String, String> hm1 = new HashMap<String, String>();

        System.out.println("Enter your User Name: ");
        String name = sc.nextLine();
        System.out.println("Enter your password: ");
        String pass = sc.nextLine();

        hm1.put(name, pass);

        System.out.println(hm1);
        
    }
}
