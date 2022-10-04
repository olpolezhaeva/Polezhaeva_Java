import java.util.Scanner;

public class Task1 {

    /*
    Составить алгоритм: если введенное число больше 7, то вывести “Привет”
     */

    public static void printHello() {
        try {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter number: ");
            int a = input.nextInt();
            if (a > 7) {
                System.out.println("Привет!");
            }

        } catch (Exception e) {
            System.out.println("Попробуйте еще раз!");
        }
    }
}
