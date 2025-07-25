import java.util.InputMismatchException;
import java.util.Scanner;


public class HomeWork5 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        System.out.println("Введи год:");
        int year = scanner.nextInt();
        int year_st=365;
        int year_vis=366;


        if (year % 400 == 0 ) System.out.println(year_vis);
        else if (year % 100 == 0 ) System.out.println(year_st);
        else if (year % 4 == 0 ) System.out.println(year_vis);
        else System.out.println(year_st);

     }
}