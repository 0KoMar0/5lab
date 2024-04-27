public class Main {
    public static void main(String[] args) {
        int sum = 15; // Заданная сумма цифр

        System.out.println("Трехзначные числа с суммой цифр равной " + sum + ":");

        for (int i = 100; i < 1000; i++) {
            int digit1 = i / 100;
            int digit2 = (i % 100) / 10;
            int digit3 = i % 10;

            if (digit1 + digit2 + digit3 == sum) {
                System.out.println(i);
            }
        }
    }
}