/* Єфімов Денис, завдання 1.7*/
import java.util.Date;
import java.util.Scanner;

public class Ex1_7 {
    /**
     * @param args int number for dobytok
     */
    public static void main(String[] args) {
        Date dat = new Date();
        System.out.println("Efymov Denys ");
        System.out.println("Ex 1.7");
        System.out.println(dat.toString());
        float result = 0;
        for (int i = 0; i < args.length; i++) {
            int n = Integer.parseInt(args[i]);
            if (i==0)
                result += n;
            else
                result *= n;
        }
        System.out.println("Your answer is: " + result);
    }
}
