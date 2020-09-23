import java.util.Scanner;

public class Ex2_4{
    public static void main(String[] args) {
        int c, i;
        String binary, first, second;
        System.out.println("Enter the number: ");
        Scanner number = new Scanner(System.in);
        c = number.nextInt();
        binary = Integer.toBinaryString(c);
        System.out.println(c + " in double system: ");
        System.out.println(binary);
        System.out.println("Enter the i-element: ");
        i = number.nextInt()-1;
        first = binary.substring(0, i);
        second = binary.substring(i+1, binary.length());
        System.out.println("Your number in double system is: ");
        System.out.println(first+second);
        System.out.println("Your answer is: " + Integer.parseInt(first+second, 2));
    }
}

