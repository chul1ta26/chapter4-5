package chapter4;

public class Date {
    public static void main(String args[]) {

        String day = "Saturday", month = "July";
        int date = 8, year = 2019;
        System.out.println("American format:");
        printAmerican(day, date, month, year);
        System.out.println("European format:");
        printEuropean(day, date, month, year);
    }


    public static void printAmerican(String day, int date, String month, int year) {
        System.out.println(day + ", " + month + " " + date + ", " + year);
    }

    public static void printEuropean(String day, int date, String month, int year) {
        System.out.println(day + " " + date + " " + month + " " + year);
    }


}
