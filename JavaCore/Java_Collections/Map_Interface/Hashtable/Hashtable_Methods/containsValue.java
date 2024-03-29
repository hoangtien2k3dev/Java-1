
// containsValue(Object value): Trả về true nếu có Value cần tìm nằm trong Hashtable, ngược lại trả về false

package JavaCore.Java_Collections.Map_Interface.Hashtable.Hashtable_Methods;

import java.util.Hashtable;

public class containsValue {
    public static void main(String[] args) {
        // Creating an empty Hashtable
        Hashtable<Integer, String> hash_table = new Hashtable<Integer, String>();

        // Putting values into the table
        hash_table.put(10, "Geeks");
        hash_table.put(15, "4");
        hash_table.put(20, "Geeks");
        hash_table.put(25, "Welcomes");
        hash_table.put(30, "You");

        System.out.println("Có chứa: " + hash_table.containsValue("Welcomes"));
        System.out.println("Có Chứa: " + hash_table.containsValue("Tien"));

    }
}
