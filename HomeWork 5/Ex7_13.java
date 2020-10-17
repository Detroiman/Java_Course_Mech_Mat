import java.util.Scanner;
import java.util.ArrayList;

interface Vehicle{
    public void EnterVehicle();
    public void OutVehicle();
}

abstract class Public_transport implements Vehicle{
    int number_of_seats;
    int Tram_number;
    int price;
    ArrayList<ArrayList<Object>> list_of_transport =new ArrayList<ArrayList<Object>>();
    @Override
    public void EnterVehicle(){
        Scanner n = new Scanner(System.in);
        System.out.println("Enter the Bus number: ");
        Tram_number = n.nextInt();
        System.out.println("Enter the number of seats: ");
        number_of_seats = n.nextInt();
        System.out.println("Enter the price: ");
        price = n.nextInt();
        ArrayList<Object> list_of_transporth =new ArrayList<Object>();
        list_of_transporth.add(Tram_number);
        list_of_transporth.add(number_of_seats);
        list_of_transporth.add(price);
        list_of_transport.add(list_of_transporth);
    };
    public void OutVehicle(){
        System.out.println("Tram number is " + Tram_number + " has " + number_of_seats + " number of seats and cost " + price);
    };
}

class Tram extends Public_transport{
    public void StartDay(){
        System.out.println("Enter the number of Tram: ");
        Scanner n = new Scanner(System.in);
        int num = n.nextInt();
        for (int i = 0; i< num; ++i){
            EnterVehicle();
            OutVehicle();
        }
        System.out.println(list_of_transport);
    }
}

public class Ex7_13 {
    public static void main(String[] args) {
        Tram t = new Tram();
        t.StartDay();
    }
}
