import java.util.Scanner;

public class Ex2_3{
    public static void main(String[] args) {
        int c;
        String binary;
        System.out.println("Enter the number: ");
        Scanner number = new Scanner(System.in);
        c = number.nextInt();
        binary = Integer.toBinaryString(c);
        System.out.println(binary);
        int count = 0;
        for (int i=0; i < binary.length(); i++)
        {
            if (i != binary.length()-1) {
                if (binary.substring(i, i + 2).equals("11")) {
                    count += 1;
                }
            }
        }
        System.out.println(count);
    }
}
