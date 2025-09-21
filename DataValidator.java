import java.util.HashSet;
import java.util.Set;

class DataValidator {
    /**
     * TO-DO: Efficiently check for duplicates in an array using a HashSet.
     * The method should stop and return true as soon as the first duplicate is found.
     \*
     * @param items The array of strings to check.
     * @return true if duplicates exist, false otherwise.
     */
    public boolean hasDuplicates(String[] items) {
        Set<String> seenItems = new HashSet<>();
        for (String item : items){
            if (!seenItems.add(item)){
                return true;
            }
        }
        // Your code here. Use the return value of set.add() to detect a duplicate.
        return false; // Placeholder
    }

    public static void main(String[] args) {
        DataValidator validator = new DataValidator();

        String[] list1 = {"Apple", "Banana", "Orange"};
        String[] list2 = {"Car", "Bike", "Car"};
        String[] list3 = {"A", "B", "C", "D", "E"};

        System.out.println("List1 has duplicates? " + validator.hasDuplicates(list1)); // false
        System.out.println("List2 has duplicates? " + validator.hasDuplicates(list2)); // true
        System.out.println("List3 has duplicates? " + validator.hasDuplicates(list3)); // false
    }
}