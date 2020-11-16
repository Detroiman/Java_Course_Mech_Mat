import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class Ex_2g {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String> array_of_line = new ArrayList<String>();
        int sum = 0;
        Scanner number = new Scanner(System.in);
        File file = new File("F.txt");
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            array_of_line.add(scanner.nextLine());
        }
        for (int i = 0; i<array_of_line.size(); i+=4){
            System.out.println(array_of_line.get(i) + " costs " + array_of_line.get(i+1) + " and for children from " + array_of_line.get(i+2) + " to " + array_of_line.get(i+3));
        }
        for (int i = 0; i<array_of_line.size(); i++){
            if (array_of_line.get(i).equals("Cubes")){
                int num = Integer.parseInt(array_of_line.get(i+1));
                sum += num;
            }
        }
        System.out.println("All sum of cubes is: " + sum);
    }

}
