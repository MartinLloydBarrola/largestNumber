import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            System.out.println("Input 3 numbers ");
            int input = scanner.nextInt();
            numbers.add(input);

        }
        System.out.println(numbers);

      System.out.println((numbers.get(0) > numbers.get(1)) ? "Largest number is: " +
              numbers.get(0) : (numbers.get(1) > numbers.get(2)) ? "Largest number is: " +
              numbers.get(1) : (numbers.get(2) > numbers.get(0)) ? "Largest number is: " +
              numbers.get(2) : "All Numbers are equal");
    }
}
