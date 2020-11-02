import java.util.Scanner;
import java.util.ArrayList;

class Stroki {
    String stroka;
    ArrayList<String> list_of_elem = new ArrayList<String>();

    public static boolean isNumeric(String strNum) {
        try {
            int d = Integer.parseInt(strNum);
        } catch (NumberFormatException | NullPointerException nfe) {
            return false;
        }
        return true;
    }

    public void input(String str){
        stroka = str;
    }

    public void out(){
        System.out.println(stroka);

    }

    public void splt_str(){
        String[] srt = stroka.split("", list_of_elem.size());
        for (String word : srt) {
            list_of_elem.add(word);
        }
    }

    public void perev(){
        String num = "";
        ArrayList<String> list_of_num = new ArrayList<String>();
        for (int i = 0; i < list_of_elem.size(); i++){
            if (isNumeric(list_of_elem.get(i))){
                num += list_of_elem.get(i);
                list_of_num.add(list_of_elem.get(i));
            }
        }
        for (int i = 0; i<list_of_num.size(); i++){
            list_of_elem.remove(list_of_num.get(i));
        }
        int n = Integer.parseInt(num);
        if (n == list_of_elem.size()+list_of_num.size()-1){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}





public class Ex8_8V {
    public static void main(String[] args) {
        Stroki st = new Stroki();
        st.input("HelloWorlld12");
        st.out();
        st.splt_str();
        st.perev();
        Stroki st1 = new Stroki();
        st1.input("HelloWorlld11");
        st1.out();
        st1.splt_str();
        st1.perev();
    }
}
