package TestTask;
import java.util.Scanner;

public class Shorokhov_Nikita_java {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = scanner.nextInt();


        if (number > 7) {
            System.out.println("Привет, Java!");
        }
        scanner.close();
    }
}

