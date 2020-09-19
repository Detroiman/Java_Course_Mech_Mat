/* Єфімов Денис, завдання 1.3 */
import java.util.Date;
import java.util.Scanner;

class Scratch {
    /**
     * Добуток двох чисел!
     */
    public static void main(String[] args) {
        Date dat = new Date();
        System.out.print("Efymov Denys ");
        System.out.println(dat.toString());
        Scanner num = new Scanner(System.in);
        System.out.println("Enter the first and second number: ");
        float a = (float) num.nextInt();
        float c = (float) num.nextInt();
        double k = Math.sqrt((double) (a * c));
        System.out.println(k);
        int z = (int) k;
        System.out.println(z);
    }}