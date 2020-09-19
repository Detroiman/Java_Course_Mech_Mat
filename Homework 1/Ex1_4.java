/* Єфімов Денис, завдання 1.4*/
import java.util.Date;
import java.util.Scanner;

public class Ex1_4 {
    /**
     * Конвертор цельсій в фаренгейти
     */
    public static void main(String[] args) {
        Date dat = new Date();
        System.out.println("Efymov Denys ");
        System.out.println("Ex 1.4");
        System.out.println(dat.toString());
        Scanner num = new Scanner(System.in);
        System.out.println("Enter C: ");
        float c = (float) num.nextInt();
        float faren = 9*c/5+32;
        System.out.print("F = " + faren);
    }
}
