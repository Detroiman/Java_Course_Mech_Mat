import java.util.ArrayList;
import java.util.Scanner;

class Europe{
    ArrayList<String> list_of_country = new ArrayList<String>();
    int num_country = 0;
    class Help extends Europe{
        public void AddCountry(String country){
            this.list_of_country.add(country);
            ++num_country;
            System.out.println("Country added in Europe!)");
        }
        public void RemoveCountry(String country){
            this.list_of_country.remove(country);
            --num_country;
            System.out.println("Country were removed from Europe!)");
        }
        public void RenameCountry(String country, String new_c){
            for (int i = 0; i < num_country; ++i){
                String cur_country = list_of_country.get(i);
                if (cur_country.equals(country)){
                    this.list_of_country.set(i, new_c);
                    System.out.println(country + " were renamed on " + new_c + "!)");
                }
            }
        }
    }

}


public class Ex8_7 {
    public static void main(String[] args) {
        Europe e = new Europe();
        Europe.Help e1 = e.new Help();
        e1.AddCountry("Ukraine");
        e1.AddCountry("Polska");
        e1.AddCountry("Spain");
        e1.AddCountry("Portugal");
        e1.AddCountry("Germain");
        System.out.println(e1.list_of_country);
        e1.RemoveCountry("Portugal");
        System.out.println(e1.list_of_country);
        e1.RenameCountry("Polska", "Polwa");
        System.out.println(e1.list_of_country);

    }
}
