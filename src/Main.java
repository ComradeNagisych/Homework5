public class Main {
    public static void main(String[] args) {
        System.out.println("Задача №1");
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        System.out.println("Задача №2");
        clientOS = 1;
        int clientDeviceYear = 2015;
        if (clientOS == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
        System.out.println("Задача №3");
        int year = 2021;
        if (year > 1584) {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
            } else {
            System.out.println(year + " год не является високосным");
            }
        } else {
            System.out.println("Некорректный год!");
        }
        System.out.println("Задача №4");
        int deliveryDistance = 95;
        int deliveryDays = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + deliveryDays);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: " + (deliveryDays + 1));
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: " + (deliveryDays + 2));
        } else {
            System.out.println("Доставки нет");
        }
        System.out.println("Задача №5");
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
                System.out.println("Это зимний месяц");
                break;
            case 2:
                System.out.println("Это зимний месяц");
                break;
            case 3:
                System.out.println("Это весенний месяц");
                break;
            case 4:
                System.out.println("Это весенний месяц");
                break;
            case 5:
                System.out.println("Это весенний месяц");
                break;
            case 6:
                System.out.println("Это летний месяц");
                break;
            case 7:
                System.out.println("Это летний месяц");
                break;
            case 8:
                System.out.println("Это летний месяц");
                break;
            case 9:
                System.out.println("Это осенний месяц");
                break;
            case 10:
                System.out.println("Это осенний месяц");
                break;
            case 11:
                System.out.println("Это осенний месяц");
                break;
            case 12:
                System.out.println("Это зимний месяц");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }
}