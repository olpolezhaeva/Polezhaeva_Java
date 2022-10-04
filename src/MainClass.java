
public class MainClass {

    public static void main(String[] args) {
        Utils.printTask(1, "Task 1: Составить алгоритм: если введенное число больше 7, то вывести \"Привет\"\nResult:");
        Task1.printHello();

        Utils.printTask(2, "Task 2: Составить алгоритм: если введенное имя совпадает с Вячеслав, то вывести “Привет, Вячеслав,\nесли нет, то вывести \"Нет такого имени\"\nResult:");
        Task2.isEqualsVyacheslav();

        Utils.printTask(3, "Task 3: Составить алгоритм: на входе есть числовой массив, необходимо вывести элементы массива кратные 3\nResult:");
        Task3.printArrElMultiplesThree();

        Utils.printTask(4, "Дана скобочная последовательность: [((())()(())]]\n" +
                "    - Можно ли считать эту последовательность правильной?\n" +
                "    - Если ответ на предыдущий вопрос “нет” - то что необходимо в ней изменить, чтоб она стала правильной?\n");
        Task4.bracketSequence();
    }
}
