import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Create ArrayList
        ArrayList<Integer> list = new ArrayList<>();

        // Add elements
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println("ArrayList: " + list);

        // Add element at a specific index
        list.add(1, 15);

        System.out.println("After adding 15: " + list);

        // Get an element
        System.out.println("Element at index 2: " + list.get(2));

        // Change an element
        list.set(2, 25);

        System.out.println("After changing: " + list);

        // Remove an element
        list.remove(Integer.valueOf(40));

        System.out.println("After removing 40: " + list);

        // Check if element exists
        System.out.println("Contains 20: " + list.contains(20));

        // Size
        System.out.println("Size: " + list.size());

        // Print using loop
        System.out.println("Elements:");

        for (int num : list) {
            System.out.println(num);
        }
    }
}

