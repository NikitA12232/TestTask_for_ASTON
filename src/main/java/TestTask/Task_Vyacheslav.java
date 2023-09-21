package TestTask;
import java.util.Scanner;

public class Task_Vyacheslav {
    public static void main(String[] args) {
        // Создаем объект Scanner для ввода с клавиатуры
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите имя: ");
        String name = scanner.nextLine();


        if (name.equalsIgnoreCase("Вячеслав")) {
            System.out.println("Привет, Вячеслав!");
        } else {
            System.out.println("Нет такого имени");
        }

        // Закрываем сканнер
        scanner.close();
    }
}
