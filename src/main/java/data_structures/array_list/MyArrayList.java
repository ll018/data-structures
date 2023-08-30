package data_structures.array_list;

import java.util.ArrayList;
import java.util.List;

public class MyArrayList  {

    private List<String> names = new ArrayList<>(1);
    // initial capacity is good to add to avoid resize when something gets added

    {
        names.add("John"); // O(1) if backing array is not full
        names.add("Per"); // O(n) if backing array is full
        names.remove(1); // O(1) if end of list otherwise O(n)
        names.get(0); // O(1) - Random access is constant
        names.add("Jonas");
        names.add(1, "Calle"); // O(n) since it has to shift indexes
        names.indexOf("Calle"); // O(n)


        names.toArray(new String[names.size()]); // turn to array
    }
}
