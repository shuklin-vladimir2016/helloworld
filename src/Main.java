public class Main {
    public static void main(String[] args) {

        System.out.println("Task 1");
        System.out.println(checkLeapYear(2025));

        System.out.println("Task 2");
        recommendAppVersion(0, 2014);
        recommendAppVersion(1, 2016);

        System.out.println("Task 3");
        int deliveryDistance = 95;
        System.out.println("Потребуется дней: " + calculateDeliveryDays(deliveryDistance));
    }

    public static String checkLeapYear(int year) {

        year = 2025;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return year + " год - високосный год";
        } else {
            return year + " год - не високосный год";
        }
    }

    public static void recommendAppVersion(int osType, int deviceYear) {

        String os = (osType == 0) ? "iOS" : "Android";
        String messge;

        if (deviceYear < 2015) {
            messge = "Установите облегченную версию приложения для " + os + " по ссылке";
        } else {
            messge = "Установите приложение для " + os + " по ссылке";
        }
        System.out.println("Установить приложение для " + os + " по ссылке");
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