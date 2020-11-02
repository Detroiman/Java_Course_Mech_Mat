import java.util.ArrayList;
class Some_line{
    ArrayList<String> list_of_word = new ArrayList<String>();
    public void split_line(String line){
        String[] srt = line.split(" ");
        for (String word : srt) {
            list_of_word.add(word);
        }
    }

    public int number_of_word(){
        return list_of_word.size();
    }

    public static boolean isNumeric(String strNum) {
        try {
            int d = Integer.parseInt(strNum);
        } catch (NumberFormatException | NullPointerException nfe) {
            return false;
        }
        return true;
    }

    public void start_from_num(){
        int sum = 0;
        for (int i = 0; i < list_of_word.size(); i++){
            ArrayList<String> list_of_new = new ArrayList<String>();
            String cur_word = list_of_word.get(i);
            String[] srt1 = cur_word.split("");
            for (String word : srt1) {
                list_of_new.add(word);
            }
            if (isNumeric(list_of_new.get(0))){
                sum += 1;
            }
        }
        System.out.println(sum);
    }

    public void end_on_num(){
        int sum = 0;
        for (int i = 0; i < list_of_word.size(); i++){
            ArrayList<String> list_of_new = new ArrayList<String>();
            String cur_word = list_of_word.get(i);
            String[] srt1 = cur_word.split("");
            for (String word : srt1) {
                list_of_new.add(word);
            }
            if (list_of_new.size() >= 3){
                if (isNumeric(list_of_new.get(list_of_new.size()-1))){
                    if (isNumeric(list_of_new.get(list_of_new.size()-2))){
                        if (isNumeric(list_of_new.get(list_of_new.size()-3))){
                            if (!isNumeric(list_of_new.get(list_of_new.size()-4))){
                                sum += 1;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(sum);
    }

    public void start_end_on_same(){
        int sum = 0;
        for (int i = 0; i < list_of_word.size(); i++){
            ArrayList<String> list_of_new = new ArrayList<String>();
            String cur_word = list_of_word.get(i);
            String[] srt1 = cur_word.split("");
            for (String word : srt1) {
                list_of_new.add(word);
            }
            if (list_of_new.get(0).equals(list_of_new.get(list_of_new.size()-1))){
                sum += 1;
            }
        }
        System.out.println(sum);
    }

    public void word_email(){
        int sum = 0;
        String email = "@gmail.com";
        for (int i = 0; i < list_of_word.size(); i++){
            String cur_word = list_of_word.get(i);
            if (cur_word.contains(email)){
                sum += 1;
            }
        }
        System.out.println(sum);
    }


}



public class Ex14 {
    public static void main(String[] args) {
        Some_line sl = new Some_line();
        sl.split_line("Two123 1roads 321diverged in a yellow cac wood And 5sorry I could denefimov2001@gmail.com not travel321 both 1And be one111 traveler long I stood And looked 2down one as far as I could");
        System.out.println("Number of word: ");
        System.out.println(sl.number_of_word());
        System.out.println("Number of word that starts from number: ");
        sl.start_from_num();
        System.out.println("Number of word that end on three-digit number: ");
        sl.end_on_num();
        System.out.println("Start and end on the same symbol: ");
        sl.start_end_on_same();
        System.out.println("Number of word-email:");
        sl.word_email();
    }
}
