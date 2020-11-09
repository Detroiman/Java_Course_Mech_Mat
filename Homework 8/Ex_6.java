import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class Ex_6 {
    public static void main(String[] args) throws FileNotFoundException{
        ArrayList<String> array_of_line = new ArrayList<String>();
        Scanner number = new Scanner(System.in);
        System.out.println("Enter the path of file: ");
        System.out.println("For example /D:/example.txt");
        String path = number.next();
        File file = new File(path);
        Scanner scanner = new Scanner(file);
        while(scanner.hasNextLine()){
            array_of_line.add(scanner.nextLine());
        }
        System.out.println(array_of_line);
        int max_length = 0;
        int max_first_line = 0;
        for (int i = 0; i<array_of_line.size(); i++){
            String cur_line = array_of_line.get(i);
            if (cur_line.length() > max_length){
                max_length = cur_line.length();
                max_first_line = i;
            }
        }
        System.out.println(array_of_line.get(max_first_line));
        System.out.println(max_length);
    }

}
