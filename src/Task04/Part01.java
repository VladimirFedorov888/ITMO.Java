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

    public static void ex05(int[] array) {
        boolean result = (array[0] == 3 || array[array.length - 1] == 3);
        if (result) {
            System.out.println(result);
        } else {
            System.out.println(result);
        }
    }

    public static void ex06(int[] array) {
        boolean result = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1 || array[i] == 3) {
                result = true;
                break;
            }
        }
        if (result) {
            System.out.println(result);
        } else {
            System.out.println(result);
        }
    }

    public static void main(String[] args) {
        ex01();
        ex02();
        ex03();
        ex04();
        ex05(new int[]{3, -12, 7, 4, 5, 4, 3});
        ex06(new int[]{1, -12, 7, 4, 5, 4, 0});







    }
}
