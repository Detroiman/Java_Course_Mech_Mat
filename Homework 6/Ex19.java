import java.util.ArrayList;

class Ryadok{
    ArrayList<Integer> list_of_num = new ArrayList<Integer>();
    ArrayList<String> list_of_char = new ArrayList<String>();
    ArrayList<String> list_of_copy = new ArrayList<String>();
    String ryad;
    public void input(String rd){
        ryad = rd;
    }
    public static boolean isNumeric(String strNum) {
        try {
            int d = Integer.parseInt(strNum);
        } catch (NumberFormatException | NullPointerException nfe) {
            return false;
        }
        return true;
    }
    public void splt_str(){
        String[] srt = ryad.split(" ");
        for (String word : srt) {
            list_of_char.add(word);
        }
    }
    public  void sort(){
        for (int i = 0; i<list_of_char.size(); i++)
            if (isNumeric(list_of_char.get(i))){
                int n = Integer.parseInt(list_of_char.get(i));
                list_of_num.add(n);
            }
            else if (!isNumeric(list_of_char.get(i))){
                list_of_copy.add(list_of_char.get(i));
            }
    }
    public void output(){
        System.out.println("List of num: " + list_of_num);
        System.out.println("List of word: " + list_of_copy);
    }
}

public class Ex19 {
    public static void main(String[] args) {
        Ryadok rd = new Ryadok();
        rd.input("Hello 1 2 232 Worlld 123 its me 2133 Johny");
        rd.splt_str();
        rd.sort();
        rd.output();
        Ryadok rd1 = new Ryadok();
        rd1.input("Ukraine 1 Russia 2 Turkey 3 Island 4 Poland 5 USA 6");
        rd1.splt_str();
        rd1.sort();
        rd1.output();
    }
}
