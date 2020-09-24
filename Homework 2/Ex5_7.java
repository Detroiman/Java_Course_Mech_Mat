import java.util.Scanner;
import java.util.ArrayList;


public class Ex5_7{
    public static void main(String args[]) {
        int num, num_n, len=0;
        boolean cur;
        Scanner number = new Scanner(System.in);
        int n = number.nextInt();
        ArrayList<Integer> list_int = new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            num = number.nextInt();
            num_n = num;
            cur = true;
            int r = 9;
            while(cur){
                int c = num%10;
                if(r < c){
                    cur = false;
                    break;
                }
                r = c;
                num = num/10;
                if(num == 0){
                    cur = false;
                    list_int.add(num_n);
                    len++;
                }
            }
        }
        for(int i=0;i<len;i++){
            System.out.println(list_int.get(i));
        }
    }
}
