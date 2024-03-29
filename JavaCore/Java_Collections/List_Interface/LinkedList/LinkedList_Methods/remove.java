/*
*   syntax:
*           list.remove(value)
*
*           list.remove(index)
*
*   => xóa phần tử chỉ định trước.
*
* */

package JavaCore.Java_Collections.List_Interface.LinkedList.LinkedList_Methods;

import java.util.LinkedList;

public class remove {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("hga");
        linkedList.add("shi");
        System.out.println(linkedList);

        // xóa phần tử
        linkedList.remove("hga");
        System.out.println(linkedList);


        // xóa phần tử ở vị trí chỉ định.
        linkedList.remove(0);
        System.out.println(linkedList);
        System.out.println("LinkedList Empty: " + linkedList.isEmpty());

    }
}
