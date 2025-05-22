public class Main {
    public static void main(String[] args) {

        System.out.println("Task 1");
        checkLeapYear(2025);

        System.out.println("Task 2");
        recommendAppVersion(0, 2014);
        recommendAppVersion(1, 2016);

        System.out.println("Task 3");
        int deliveryDistance = 95;
        System.out.println("Потребуется дней: " + calculateDeliveryDays(deliveryDistance));
    }

    public static void checkLeapYear(int year) {
        boolean Leapyear = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
        if (Leapyear) {
            System.out.println(year + " год - високосный год");
        } else {
            System.out.println(year + " год - не високосный год");
        }
    }

    public static void recommendAppVersion(int osType, int deviceYear) {
        if (osType == 0) {
            if (deviceYear >= 2015) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        } else if (osType == 1) {
            if (deviceYear >= 2015)
                System.out.println("Установить версию приложения для Android по ссылке");
        } else {
            System.out.println("Установить облегченную версию приложения для Android по ссылке");
        }
    }

    public static int calculateDeliveryDays(int distance) {
        if (distance <= 20) {
            return 1;
        } else if (distance <= 60) {
            return 2;
        } else if (distance <= 100) {
            return 3;
        } else {
            throw new IllegalArgumentException("Доставка на расстояние более 100 км не предусмотрена");
        }
    }
}