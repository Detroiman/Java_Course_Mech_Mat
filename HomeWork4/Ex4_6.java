import java.util.Scanner;
import java.util.ArrayList;


interface Planets{
    ArrayList<Object> list_of_planets = new ArrayList<Object>();
    public void add_Planet(String plan);
    public void get_Planet(int num);
}

interface Stars{
    ArrayList<Object> list_of_stars = new ArrayList<Object>();
    public void add_Star(String star);
    public void get_Stars(int num);
}

interface Moon{
}

class StarSyst implements Planets, Stars, Moon{
    @Override
    public void add_Planet(String plan){
        Planets.list_of_planets.add(plan);
        System.out.println("Added!");
    };
    @Override
    public void add_Star(String star){
        Stars.list_of_stars.add(star);
        System.out.println("Added!");
    };
    @Override
    public void get_Planet(int num){
        System.out.println(list_of_planets.get(num));
    };
    @Override
    public void get_Stars(int num){
        System.out.println(list_of_stars.get(num));
    };
}


public class Ex4_6 {
    public static void main(String[] args) {
        StarSyst sts = new StarSyst();
        int len_lst = 0;
        Scanner func = new Scanner(System.in);
        while (true) {
            System.out.println("1: Add Planet to Star System. 2. Add Star to Star System. 3. Get Planet from Star System. 4. Get Star from Star System. 5. Print number planet of Star System. 0. Out from exercise.");
            int func1 = func.nextInt();
            if (func1 == 0) {
                break;
            }
            if (func1 == 1) {
                System.out.println("Enter the name of Planet: ");
                String plan = func.next();
                sts.add_Planet(plan);
                ++len_lst;
            }
            if (func1 == 2) {
                System.out.println("Enter the name of Star: ");
                String plan = func.next();
                sts.add_Star(plan);
            }
            if (func1 == 3) {
                System.out.println("Enter the index(n-1) of Planet: ");
                int plan = func.nextInt();
                sts.get_Planet(plan);
            }
            if (func1 == 4) {
                System.out.println("Enter the index(n-1) of Star: ");
                int plan = func.nextInt();
                sts.get_Stars(plan);
            }
            if (func1 == 5) {
                System.out.println("System has " + len_lst + " Planets!");
            }
        }
    }
}
