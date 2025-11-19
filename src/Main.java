import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Задание 1.1: Удаление дубликатов ===");
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("C++");
        list.add("Java");
        list.add("Python");
        System.out.println("Было: " + list);
        System.out.println("Стало: " + Alghoritms.removeDups(list));

        System.out.println("\n=== Задание 1.2: Линейный поиск ===");
        Integer[] arr = {10, 45, 23, 99, 12};
        int searchVal = 23;
        System.out.println("Массив: [10, 45, 23, 99, 12]");
        System.out.println("Индекс элемента " + searchVal + ": " + Alghoritms.lSearch(arr, searchVal));
        System.out.println("Индекс элемента 100: " + Alghoritms.lSearch(arr, 100));

        System.out.println("\n=== Задание 1.3: Максимум в массиве (Circle) ===");
        Circle[] circles = {
                new Circle(3.5),
                new Circle(10.2),
                new Circle(5.0)
        };
        System.out.println("Круги: 3.5, 10.2, 5.0");
        System.out.println("Макс: " + Alghoritms.max(circles));

        System.out.println("\n=== Задание 1.4: Максимум в 2D массиве ===");
        Integer[][] matrix = {
                {1, 2, 3},
                {8, 9, 4},
                {7, 6, 5}
        };
        System.out.println("Макс элемент матрицы: " + Alghoritms.max2d(matrix));

        System.out.println("\n=== Задание 2.1: Стек на массиве ===");
        ArrStack<Double> stack1 = new ArrStack<>();
        for (int i = 0; i < 15; i++) { // Тест расширения массива
            stack1.push((double)i);
        }
        System.out.println("Размер: " + stack1.getSize());
        System.out.println("Вершина (peek): " + stack1.peek());
        System.out.println("Pop: " + stack1.pop());

        System.out.println("\n=== Задание 2.3: Глубокое клонирование (MyStack) ===");
        MyStack original = new MyStack();
        original.push("Original Data");

        MyStack cloned = (MyStack) original.clone();

        original.pop(); // Удаляем из оригинала

        System.out.println("Размер оригинала: " + original.getSize());
        System.out.println("Размер клона: " + cloned.getSize() + " (должен остаться 1)");

        System.out.println("\n=== Задание 2.2: Стек на наследовании + Ввод строк ===");
        Scanner scanner = new Scanner(System.in);
        InStack<String> strStack = new InStack<>();

        System.out.println("Введите 5 строк:");
        for (int i = 0; i < 5; i++) {
            System.out.print((i+1) + ": ");
            strStack.push(scanner.nextLine());
        }

        System.out.println("В обратном порядке:");
        while (!strStack.isEmpty()) {
            System.out.println(strStack.pop());
        }
    }
}