import java.time.LocalDate;

public class Main {

    public static boolean leapYear(int year){
        if ((year >= 1584) && (((year%4==0) && (year%100!=0)) || (year % 400 == 0))){
            return true;
        } else {
            return false;
        }
    }

    public static String verifyOS(int OS, int year) {

        if (OS == 0 && year < 2015) {
            return  "Установите облегченную версию приложения для iOS по ссылке";
        }
        if (OS == 0 && year >= 2015){
            return "Установите версию приложения для iOS по ссылке";
        }
        if (OS == 1 && year < 2015){
            return "Установите облегченную версию приложения для Android по ссылке";
        }
        if (OS == 1 && year >= 2015){
           return "Установите версию приложения для Android по ссылке";
        }
        return "";
    }

    public static int delivery(int distance){
        if (distance <= 20){
            return 1;
        } else if (distance <= 60){
            return 2;
        } else if (distance <= 100){
            return 3;
        } else
            return -1;
    }

    public static void main(String[] args) {

        System.out.println("Задача №1");
        int year = 2021;
        if (leapYear(year)) {
            System.out.println(year + " год - високостный год");
        } else {
            System.out.println(year + " год - невисокостный год");
        }

        System.out.println("Задача №2");
        int currentYear = LocalDate.now().getYear();
        int clientOS = 0;
        System.out.println(verifyOS(clientOS, currentYear));

        System.out.println("Задача №3");
        int deliveryDistance = 95;
        switch (delivery(deliveryDistance)){
            case 1:
                System.out.println("Потребуется дней: 1");
                break;
            case 2:
                System.out.println("Потребуется дней: 2");
                break;
            case 3:
                System.out.println("Потребуется дней: 3");
                break;
            default:
                System.out.println("В ваш регион нет доставки");
                break;
        }


    }
}