import java.util.Arrays;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] temp = new int[3];
        for (int i = 0; i < 3; i++){
            System.out.println("Input 3 numbers ");
            int input = scanner.nextInt();
            temp[i] = input;

        }
        System.out.println("Numbers input are: " + Arrays.toString(temp));
        System.out.println((temp[0] > temp[1]) ? "Largest number is: " +
        temp[0] : (temp[1] > temp[2]) ? "Largest number is: " + 
        temp[1] : (temp[2] > temp[0]) ? "Largest number is: " + 
        temp[2] : "All Numbers are equal");
    }
}
