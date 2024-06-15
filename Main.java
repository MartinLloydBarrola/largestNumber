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
        System.out.println(Arrays.toString(temp));

        if(temp[0] > temp[1]){
            System.out.println("Largest number is: " + temp[0]);
        } else if (temp[1] > temp[2]) {
            System.out.println("Largest number is: " + temp[1]);
        } else if (temp[2] > temp[0]){
            System.out.println("Largest number is: " + temp[2]);
        } else {
            System.out.println("All numbers are equal");
        }
    }
    
}
