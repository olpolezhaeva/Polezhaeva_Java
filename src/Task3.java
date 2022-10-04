import java.util.Scanner;

public class Task3 {

    /*
    Составить алгоритм: на входе есть числовой массив, необходимо вывести элементы массива кратные 3
     */

    public static void printArrElMultiplesThree() {
        try {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter array length: ");

            int[] array = new int[input.nextInt()];
            if (array.length != 0) {

                int index = -1;

                System.out.print("Insert array elements: ");
                for (int i : array) {
                    array[i] = input.nextInt();
                    index++;

                    if (array[i] % 3 == 0) {
                        System.out.println("Элемент под индексом " + index + " кратен 3: " + array[i]);
                    } else {
                        System.out.println("Элементов кратных 3 нет!");
                    }

                }
            }
            System.out.println("Это пустой массив!");

        } catch (Exception e) {
            System.out.println("Попробуйте еще раз. Вводите целые числа через пробел!");
        }
    }
}
