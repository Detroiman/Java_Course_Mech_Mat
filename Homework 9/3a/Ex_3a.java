import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.PrintWriter;


public class Ex_3a{
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Integer> array_of_line = new ArrayList<Integer>();
        ArrayList<Integer> array_of_finish = new ArrayList<Integer>();
        Scanner number = new Scanner(System.in);
        File file = new File("F.txt");
        Scanner scanner = new Scanner(file);
        while(scanner.hasNextLine()){
            String num = scanner.nextLine();
            int num1 = Integer.parseInt(num);
            array_of_line.add(num1);
        }

        for (int i = 0; i < array_of_line.size(); i++){
            if (array_of_line.get(i)%2==0){
                array_of_finish.add(array_of_line.get(i));
            }
        }
        try{
            File file1 = new File("G.txt");
            if (!file1.exists()){
                file1.createNewFile();
            }
            PrintWriter pw = new PrintWriter(file1);
            for (int i = 0; i<array_of_finish.size(); i++){
                pw.println(array_of_finish.get(i));

            }
            pw.close();
        }catch (IOException e){
            System.out.println("Error!");
        }



    }
}