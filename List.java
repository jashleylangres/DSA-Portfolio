import java.util.ArrayList;

public class List {
    public static void main(String[] args) {
        ArrayList<String> fruitList = new ArrayList<>();

        // Add fruits to the list
        fruitList.add("Apple");
        fruitList.add("Blueberry");
        fruitList.add("Strawberry");
        fruitList.add("Banana");
        fruitList.add("Pineapple");
        fruitList.add("Watermelon");
        fruitList.add("Orange");

        System.out.println("List of my favorite fruits:");
        for (String fruit : fruitList) {
            System.out.println(fruit);
        }
    }
}
