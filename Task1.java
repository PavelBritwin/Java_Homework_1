package Java_homework_1;
import java.util.Scanner;

// Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n) тр 5 = 1+2+3+4+5 5! = 1*2*3*4*5

class Task1
{
    public static void main(String[] args) {
        System.out.print("Введите число: ");
        Scanner scanner = new Scanner(System.in, "Cp866");
        Integer number = scanner.nextInt();
        scanner.close();
        int factorial = 1;
        int sumOfnumber = 1;
        for (int i = 2; i <= number; i++)
        {
            factorial *= i;
            sumOfnumber += i;
        }
        System.out.println("factorial = " + factorial);
        System.out.println("sumOfnumber = " + sumOfnumber);
    }
}