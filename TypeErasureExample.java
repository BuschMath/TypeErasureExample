/*In this example, we create two List objects - one that contains 
    String objects, and another that contains Integer objects. When 
    we print the class of each list object using the getClass() 
    method, we can see that they are both erased to the same class 
    - ArrayList<Object>.

    We also create a third List object, without specifying a type 
    parameter. This list is erased to ArrayList<Object> as well. We 
    then add both a String and an Integer object to this list, and 
    try to cast them back to their original types. This results in 
    a ClassCastException because the list contains objects of 
    different types. */

import java.util.*;

public class TypeErasureExample {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("hello");
        list1.add("world");

        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);

        // Both lists are erased to List<Object>
        System.out.println(list1.getClass()); // class java.util.ArrayList
        System.out.println(list2.getClass()); // class java.util.ArrayList

        // This will result in a ClassCastException
        // because the list contains objects of different types
        List list3 = new ArrayList();
        list3.add("hello");
        list3.add(1);
        String s = (String) list3.get(0); // OK
        Integer i = (Integer) list3.get(1); // ClassCastException
    }
}
