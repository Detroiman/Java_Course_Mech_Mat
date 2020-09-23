import java.util.Scanner;
import java.util.ArrayList;

public class Ex4_4{
    public static void main(String[] args) {
        int c, len=0, count = 0;
        boolean cur=false, last_cur=false;
        Scanner number = new Scanner(System.in);
        ArrayList<Integer> list_int = new ArrayList<Integer>();
        while (true){
            System.out.println("Enter the element of array: ");
            c = number.nextInt();
            if (c == 0)
                break;
            else
                list_int.add(c);
                ++len;
        }
        for (int i = 0; i < len; i++){
            if (list_int.get(i) > 0){
                cur = true;
            }
            if (list_int.get(i) < 0){
                cur = false;
            }
            if (i == 0){
                last_cur = cur;
            }
            if (i != 0){
                if (last_cur != cur){
                    ++count;
                }
            }
            last_cur = cur;
        }
        System.out.println(count);
    }
}
