import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Ex5_3{
    public static void main(String[] args) {
        int c, len=0, n;
        Scanner number = new Scanner(System.in);
        ArrayList<Integer> list_int = new ArrayList<Integer>();
        ArrayList<Integer> list_int_colec = new ArrayList<Integer>();
        ArrayList<Integer> list_int_colec1 = new ArrayList<Integer>();
        System.out.println("Enter n: ");
        n = number.nextInt();
        System.out.println("Enter the element of array: ");
        for (int i=0; i<n; ++i){
            c = number.nextInt();
            ++len;
            list_int.add(c);
        }
        int cur, last_cur = -12321;
        for (int i=0; i<n; i++){
            cur = list_int.get(i);
            if (cur != last_cur | i == 0){
                list_int_colec.add(list_int.get(i));
                list_int_colec1.add(Collections.frequency(list_int, cur));
            }
            last_cur = cur;
        }
        int max = Collections.max(list_int_colec1);
        for (int i = 0; i<n; ++i){
            try {
                if (list_int_colec1.get(i) == max) {
                    System.out.print(list_int_colec.get(i) + " ");
                }
            }
            catch (java.lang.IndexOutOfBoundsException e){
            }
        }
    }
}
