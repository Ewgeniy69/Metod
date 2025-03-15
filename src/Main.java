import java.time.LocalDate;

public class Main {

    public static void checkLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void suggestAppVersion(int osType, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        String osName = (osType == 0) ? "iOS" : "Android";
        if (clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для " + osName + " по ссылке.");
        } else {
            System.out.println("Установите приложение для " + osName + " по ссылке.");
        }
    }

    public static int calculateDeliveryDays(int deliveryDistance) {
        int days = 0;
        if (deliveryDistance <= 20) {
            days = 1;
        } else if (deliveryDistance <= 60) {
            days = 2;
        } else if (deliveryDistance <= 100) {
            days = 3;
        } else {
            days = -1;
        }
        return days; // Возвращаем количество дней
    }

    public static void main(String[] args) {
        System.out.println("Task # 1");
        int year = 2025;
        checkLeapYear(year);
        System.out.println("Task # 2");
        int clientDeviceYear = 2015;
        int osType = 0;
        suggestAppVersion(osType, clientDeviceYear);
        System.out.println("Task # 3");
        int deliveryDistance = 95;
        int days = calculateDeliveryDays(deliveryDistance);
        if (days == -1) {
            System.out.println("Доставка свыше 100 км невозможна.");
        } else {
            System.out.println("Потребуется дней: " + days);
        }
    }
}