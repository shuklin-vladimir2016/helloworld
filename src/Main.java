import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 200_000);
        }
        return array;
    }

    public static void task1() {
        System.out.println("Task 1");

        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Сумма затрат за месяц составила " + sum + " рублей");

        System.out.println("Task 2");

        int[] wastes = {35000, 43000, 37000, 31000, 32000};
        int min = wastes[0];
        int max = wastes[0];
        for (int i = 1; i < wastes.length; i++) {
            if (wastes[i] < min) {
                min = wastes[i];
            }
            if (wastes[i] > max) {
                max = wastes[i];
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + min + " рублей");
        System.out.println("Максимальная сумма трат за неделю составила " + max + " рублей");

        System.out.println("Task 3");

        int[] monthWastes = {38590, 76500, 57890, 44780, 47560};
        float total = 0;
        for (int week : monthWastes) {
            total = total + week;
        }
        float weekAverage = (total / (monthWastes.length));
        System.out.println("Средняя сумма трат за месяц составила " + weekAverage + " рублей");

        System.out.println("Task 4");

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        int start = 0;
        int end = reverseFullName.length - 1;
        while (start < end) {
            char temp = reverseFullName[start];
            reverseFullName[start] = reverseFullName[end];
            reverseFullName[end] = temp;
            start++;
            end--;
        }
        for (int i = 0; i < reverseFullName.length; i++) {
            System.out.print(reverseFullName[i]);
        }
    }
}