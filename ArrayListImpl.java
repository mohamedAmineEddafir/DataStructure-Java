package DataStructures;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Demonstrates the use of ArrayList and various operations such as adding elements,
 * accessing elements, sorting, and retrieving specific information about the list.
 *
 * @param <T> - Generic type parameter for flexibility, though Integer is used in this example.
 */
public class ArrayListImpl<T> {
    public static void main(String[] args) {
        // Initialize an ArrayList to store integer values (years in this case).
        ArrayList<Integer> years = new ArrayList<>();

        // Adding years to the ArrayList.
        years.add(2000);
        years.add(2010);
        years.add(2020);
        years.add(2030);
        years.add(2040);

        // Uncomment the line below to clear all elements from the list.
        // years.clear();

        // Iterate through the ArrayList and print each year.
        System.out.println("Original list of years:");
        for (Integer year : years) {
            System.out.println(year);
        }

        // Retrieve and print the value at index 1 before modification.
        System.out.println("\nThe index after change the element : " + years.get(1));

        // Add a new year (2025) at index 1, shifting existing elements to the right.
        years.add(1, 2025);

        // Retrieve and print the value at index 1 after modification.
        System.out.println("The index before change the element : " + years.get(1));

        // Uncomment the line below to sort the list in ascending order using Collections.sort().
        Collections.sort(years);

        // Print the sorted list of years.
        System.out.println("\nList of years after sorting with Collections:");
        for (Integer year : years) {
            System.out.println(year);
        }

        // Retrieve and print the first element in the ArrayList.
        System.out.println("\nThe first element in the list: " + years.get(0));

        // Retrieve and print the last element in the ArrayList.
        System.out.println("The last element in the list: " + years.get(years.size() - 1));

        // Retrieve and print the maximum value from the list using Collections.max().
        System.out.println("Maximum year in the list: " + Collections.max(years));

        // Check if the list is empty and print the result.
        System.out.println("Is the list empty? " + years.isEmpty());
    }
}