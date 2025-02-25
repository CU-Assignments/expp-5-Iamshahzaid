import java.util.*;

public class SumCalculator {
    public static void main(String[] args) {
        List<String> numberStrings = Arrays.asList("10", "20", "30", "40", "50");
        List<Integer> numbers = new ArrayList<>();

        // Parsing strings into Integer objects (Autoboxing)
        for (String numStr : numberStrings) {
            numbers.add(Integer.parseInt(numStr));
        }

        // Calculating the sum (Unboxing occurs automatically)
        int sum = calculateSum(numbers);
        
        System.out.println("Sum of numbers: " + sum);
    }

    public static int calculateSum(List<Integer> numbers) {
        int sum = 0;
        for (int num : numbers) { // Unboxing happens here
            sum += num;
        }
        return sum;
    }
}
