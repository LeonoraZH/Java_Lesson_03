import java.util.ArrayList;
import java.util.List;

public class task01 {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);

        removeEvenNumbers(numbers);

        System.out.println(numbers);
    }

    public static void removeEvenNumbers(List<Integer> numbers) {
        List<Integer> oddNumbers = new ArrayList<>();

        for (Integer number : numbers) {
            if (number % 2 != 0) {
                oddNumbers.add(number);
            }
        }

        numbers.clear();

        numbers.addAll(oddNumbers);
    }
}