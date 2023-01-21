// Реализовать простой калькулятор Scanner sc = ... int a = sc.nextLine int b = sc.nextLine
package Java_homework_1;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "Cp866");
        System.out.print("Введите первое число: ");
        Integer firstNum = scanner.nextInt();
        System.out.print("Введите операцию (+, -, *, /): ");
        scanner = new Scanner(System.in, "Cp866");
        String operation = scanner.nextLine();
        System.out.print("Введите второе число: ");
        scanner = new Scanner(System.in, "Cp866");
        Integer secondNum = scanner.nextInt();
        scanner.close();

        switch (operation)
        {
            case ("+"):
                System.out.print(firstNum + " " + operation + " " + secondNum + " = " + (firstNum+secondNum));
                break;
            case ("-"):
                System.out.print(firstNum + " " + operation + " " + secondNum + " = " + (firstNum-secondNum));
                break;
            case ("*"):
                System.out.print(firstNum + " " + operation + " " + secondNum + " = " + (firstNum*secondNum));
                break;
            case ("/"):
                System.out.print(firstNum + " " + operation + " " + secondNum + " = " + (firstNum/secondNum));
                break;
            default:
                System.out.print("Введенная операция недоступна!");
        }
    }
}
