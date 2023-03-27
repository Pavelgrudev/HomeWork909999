public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void task1() {
        int[] myArray = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            sum = sum + myArray[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей».");
    }
    public static void task2() {
        int[] myArray2 = generateRandomArray();
        int maxSum = -1;
        int minSum = 200000;
        for (int i = 0; i < myArray2.length; i++) {
            if (myArray2[i] > maxSum) {
                maxSum = myArray2[i];}
        }
        System.out.println("Максимальная сумма трат за день составила " + maxSum + " рублей.");
        for (int i = 0; i < myArray2.length; i++) {
            if (myArray2[i] < minSum) {
                minSum = myArray2[i];}}
        System.out.println("Минимальная сумма трат за день составила " + minSum + " рублей.");
    }
    public static void task3() {
        int[] myArray3 = generateRandomArray();
        double averageSum = 0;
        int totalSum = 0;
        int day = 30;
        for (int i = 0; i < myArray3.length; i++) {
            totalSum = totalSum + myArray3[i];
            averageSum = totalSum / day;
        }
        System.out.println("Средняя сумма трат за день составила " + averageSum + " рублей.");
    }
    public static void task4() {
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = 10; i >=0 ; i=i-1) {
            System.out.print(reverseFullName[i]); }}}
