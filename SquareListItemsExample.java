import java.util.*;
public class SquareListItemsExample {
    public static void main(String[] args) {
        
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        for (int i = 0; i < numbers.size(); i++) {
            int squared = numbers.get(i) * numbers.get(i);
            numbers.set(i, squared);
        }

        System.out.println("Squared list: " + numbers);
    }
}
