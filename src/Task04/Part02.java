package Task04;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class Part02 {

    public static void swapFirstAndLast(int[] arr) {
        if (arr == null || arr.length < 2) {
            return; // Массив слишком короткий или null, ничего не делаем
        }

        int temp = arr[0]; // Сохраняем первый элемент массива во временную переменную
        arr[0] = arr[arr.length - 1]; // Заменяем первый элемент последним
        arr[arr.length - 1] = temp; // Заменяем последний элемент сохраненным первым элементом
        System.out.println(Arrays.toString(arr));
    }



    public static void checkSorted(int[] arr) {
        boolean sorted = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                sorted = false;
                break;
            }
        }
        if (sorted) {
            System.out.println("OK");
        } else {
            System.out.println("Please, try again");
        }
    }

    public static void arrayPrint() {
        Scanner scanner = new Scanner(System.in);
        // Считываем длину массива с клавиатуры
        System.out.print("Введите длину массива: ");
        int length = scanner.nextInt();
        // Создаем массив нужной длины
        int[] array = new int[length];
        // Считываем элементы массива с клавиатуры
        System.out.println("Введите " + length + " чисел:");
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }
        // Выводим массив на экран
        System.out.print("Массив: " + Arrays.toString(array));
    }

    public static void findUnique(int[] arr) {
        // Проходим по всем элементам массива и ищем первый уникальный элемент
        for (int i = 0; i < arr.length; i++) {
            boolean isUnique = true;
            // Проверяем, есть ли элемент в массиве еще раз
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                System.out.println("Уникальное число в массиве: " + arr[i]);
            }
        }
    }

    public static int[] generateRandomArray(int n) {
        Random random = new Random();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(100);
        }
        return arr;
    }

    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    public static void merge(int[] arr, int left, int mid, int right) {
        int[] temp = new int[arr.length];
        for (int i = left; i <= right; i++) {
            temp[i] = arr[i];
        }
        int i = left;
        int j = mid + 1;
        int k = left;
        while (i <= mid && j <= right) {
            if (temp[i] <= temp[j]) {
                arr[k] = temp[i];
                i++;
            } else {
                arr[k] = temp[j];
                j++;
            }
            k++;
        }
        while (i <= mid) {
            arr[k] = temp[i];
            k++;
            i++;
        }
    }

    public static void main(String[] args) {
        checkSorted(new int[]{1, 3, 5, 11, 15, 17});
        arrayPrint();
        swapFirstAndLast(new int[]{3,5,6,7,8});
        findUnique(new int[]{1,2,3,2,1});
        int[] arr = generateRandomArray(10);
        System.out.println("Исходный массив: " + Arrays.toString(arr));
        mergeSort(arr, 0, arr.length - 1);
        System.out.println("Отсортированный массив: " + Arrays.toString(arr));
    }
}

