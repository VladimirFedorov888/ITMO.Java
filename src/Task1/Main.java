package Task1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Я");
        System.out.println("Хорошо");
        System.out.println("Знаю");
        System.out.println("Java");


        double result1 = (46 + 10) * (10d / 3);
        int result2 = (29) * (4) * (-15);
        System.out.println("Результат первого выражения: " + result1);
        System.out.println("Результат второго выражения: " + result2);


        int number = 10500;
        double result = ((double)number / 10) / 10;
        System.out.println(result);

        double num1 = 3.6;
        double num2 = 4.1;
        double num3 = 5.9;
        double result3 = num1 * num2 * num3;
        System.out.println("Произведение чисел: " + result3);

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        if (b % 2 != 0) {
            System.out.println("Нечетное");
        } else if (b > 100) {
            System.out.println("Выход за пределы диапазона");
        } else {
            System.out.println("Четное");
        }

    }
}
