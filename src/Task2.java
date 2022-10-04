import java.util.Scanner;

public class Task2 {

    /*
    Составить алгоритм: если введенное имя совпадает с Вячеслав, то вывести “Привет, Вячеслав”, если нет, то вывести "Нет такого имени"
     */

    public static void isEqualsVyacheslav() {

        try {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter name: ");
            String name = input.nextLine();

            if (name.equals("Вячеслав")) {
                System.out.println("Привет, Вячеслав!");
            } else {
                System.out.println("Нет такого имени!");
            }

        } catch (Exception e) {
            System.out.println("Попробуйте еще раз!");
        }
    }
}
