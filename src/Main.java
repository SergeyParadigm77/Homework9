import java.util.Random;
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
    // Объявить метод «сгенерироватьМассив»
    public static int[] generateRandomArray() {
        Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void task1() {
        int[] arr = generateRandomArray();
        // int[] arr — объявление массива
        // generateRandomArray() — вызов метода «сгенерироватьМассив»
        int allPaymentsMonth = 0;
        for (int oneDayPayment : arr) {
            allPaymentsMonth += oneDayPayment;
        }
        System.out.println("Сумма трат за месяц составила " + allPaymentsMonth + " рублей");
    }
    public static void task2() {
        int[] arr = generateRandomArray();
        int minPayment = 200_000, maxPayment = 0;
        for (int oneDayPayment: arr) {
            if (oneDayPayment > maxPayment) {
                maxPayment = oneDayPayment;
            }
            if (oneDayPayment < minPayment) {
                minPayment = oneDayPayment;
            }
        }
            System.out.println("Минимальная сумма трат за день составила " + minPayment + " рублей. Максимальная сумма трат за день составила " + maxPayment + " рублей");
    }
    public static void task3() {
        int[] arr = generateRandomArray();
        int allPaymentsMonth = 0;
        for (int oneDayPayment: arr) {
            allPaymentsMonth += oneDayPayment;
            }
        double averageMonthPayment = (double)allPaymentsMonth / arr.length;
        if (allPaymentsMonth % arr.length == 0) {
            System.out.println("Средняя сумма трат за месяц составила " + (int)averageMonthPayment + " рублей");
            }
        else {
            System.out.println("Средняя сумма трат за месяц составила " + averageMonthPayment + " рублей");
        }
    }
    public static void task4() {
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }

}