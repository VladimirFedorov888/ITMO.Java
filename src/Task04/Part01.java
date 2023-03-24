package Task04;
import java.util.Scanner;

public class Part01 {

    public static void ex01() {
        for (int i = 1; i <= 99; i += 2) {
            System.out.println(i);
        }
    }

    public static void ex02() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " делится на 3 и 5");
            } else if (i % 3 == 0) {
                System.out.println(i + " делится на 3");
            } else if (i % 5 == 0) {
                System.out.println(i + " делится на 5");
            }
        }
    }


    public static void ex03() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();
        System.out.print("Введите третье число: ");
        int num3 = scanner.nextInt();
        int sum = num1 + num2;
        boolean result = (sum == num3);
        System.out.println("Результат: " + result);
    }

    public static void ex04() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();
        System.out.print("Введите третье число: ");
        int num3 = scanner.nextInt();
        boolean result = (num2 > num1 && num3 > num2);
        System.out.println("Результат: " + result);
    }

    public static void ex05() {
        int[] numbers = {1, 2, 3, 4, 5};
        boolean result = (numbers[0] == 3 || numbers[numbers.length - 1] == 3);
        if (result) {
            System.out.println("Число 3 появляется как первый или последний элемент массива");
        } else {
            System.out.println("Число 3 не появляется как первый или последний элемент массива");
        }
    }

    public static void ex06() {
        int[] numbers = {2, 4, 1, 6, 8};
        boolean result = false;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 1 || numbers[i] == 3) {
                result = true;
                break;
            }
        }
        if (result) {
            System.out.println("Массив содержит число 1 или 3");
        } else {
            System.out.println("Массив не содержит число 1 или 3");
        }
    }

    public static void main(String[] args) {
        ex01();
        ex02();
        ex03();
        ex04();
        ex05();
        ex06();







    }
}
