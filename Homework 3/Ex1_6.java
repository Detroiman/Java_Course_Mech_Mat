import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

class Houses {
    int id, floor, area, num_flat, number_of_rooms, service_life;
    String street, type_of_build;
    public String toString()
    {
        return "id: " + this.id + " \n" + "floor: " + this.floor + " \n" + "area: " + this.area + " \n" + "num_flat: " + this.num_flat + " \n" +
                "Number of rooms: " + this.number_of_rooms + " \n" + "service life: " + this.service_life + " \n" + "street: " + this.street + " \n" +
                "type of builds: " + this.type_of_build;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public void setFloor(int floor) {
        this.floor = floor;
    }
    public int getFloor() {
        return floor;
    }
    public void setArea(int area) {
        this.area = area;
    }
    public int getArea() {
        return area;
    }
    public void setNum_flat(int num_flat) {
        this.num_flat = num_flat;
    }
    public int getNum_flat() {
        return num_flat;
    }
    public void setNumber_of_rooms(int number_of_rooms) {
        this.number_of_rooms = number_of_rooms;
    }
    public int getNumber_of_rooms() {
        return number_of_rooms;
    }
    public void setService_life(int service_life) {
        this.service_life = service_life;
    }
    public int getService_life() {
        return service_life;
    }
    public void setType_of_build(String type_of_build) {
        this.type_of_build = type_of_build;
    }
    public String getType_of_build() {
        return type_of_build;
    }
    public void setStreet(String street) {
        this.street = street;
    }
    public String getStreet() {
        return street;
    }
}



public class Ex1_6{
    public static void main(String[] args) {

        List<List<Object>> list_of_flat =new ArrayList<List<Object>>();
        Scanner number = new Scanner(System.in);
        System.out.println("Enter the number of flats: ");
        int n = number.nextInt(), som_int, zapit, zapit1, zapit2;
        boolean perev = false;
        String som_str;
        int lens = 0;
        for (int i = 0; i < n; ++i){
            List<Object> hel = new ArrayList<Object>();
            Houses h = new Houses();
            System.out.println("Enter the ID of flat: ");
            som_int = number.nextInt();
            h.setId(som_int);
            hel.add(som_int);
            System.out.println("Enter the FLOOR of flat: ");
            som_int = number.nextInt();
            h.setFloor(som_int);
            hel.add(som_int);
            System.out.println("Enter the AREA of flat: ");
            som_int = number.nextInt();
            h.setArea(som_int);
            hel.add(som_int);
            System.out.println("Enter the APARTAMENT NUMBER of flat: ");
            som_int = number.nextInt();
            h.setNum_flat(som_int);
            hel.add(som_int);
            System.out.println("Enter the NUMBER OF ROOMS of flat: ");
            som_int = number.nextInt();
            h.setNumber_of_rooms(som_int);
            hel.add(som_int);
            System.out.println("Enter the SERVICE LIFE of flat: ");
            som_int = number.nextInt();
            h.setService_life(som_int);
            hel.add(som_int);
            System.out.println("Enter the STREET of flat(without space bar): ");
            som_str = number.next();
            h.setStreet(som_str);
            hel.add(som_str);
            System.out.println("Enter the TYPE OF BUILD of flat(without space bar): ");
            som_str = number.next();
            h.setType_of_build(som_str);
            hel.add(som_str);
            list_of_flat.add(hel);
            ++lens;
            System.out.println(list_of_flat);

        }
        System.out.println("How much room u need to search?");
        zapit = number.nextInt();
        for (int i=0; i < lens; i++){
            if (list_of_flat.get(i).get(4).equals(zapit)){
                System.out.println("Your flats with " + zapit + " number of rooms is: ");
                System.out.println(list_of_flat.get(i));
            }
        }
        System.out.println("How much room u need to search?");
        zapit = number.nextInt();
        System.out.println("Enter first number of interval: ");
        zapit1 = number.nextInt();
        System.out.println("Enter second number of interval: ");
        zapit2 = number.nextInt();
        for (int i=0; i < lens; i++){
            if (list_of_flat.get(i).get(4).equals(zapit)){
                for (int k = zapit1; k < zapit2; k++){
                    if (list_of_flat.get(i).get(1).equals(k)){
                        perev = true;
                        break;
                    }
                }
                if (perev){
                    System.out.println("Your flats with " + zapit + " number of rooms is: ");
                    System.out.println(list_of_flat.get(i));
                }
            }
        }
        perev = true;
        System.out.println("How much room u need to search?");
        zapit = number.nextInt();
        System.out.println("Enter area: ?");
        zapit1 = number.nextInt();
        for (int i=0; i < lens; i++){
            if (list_of_flat.get(i).get(4).equals(zapit)){
                for (int k = 0; k < zapit1; k++){
                    if (list_of_flat.get(i).get(2).equals(k)){
                        perev = false;
                        break;
                    }
                }
                if (perev){
                    System.out.println("Your flats with " + zapit + " number of rooms is: ");
                    System.out.println(list_of_flat.get(i));
                }

            }
        }

    }
}


