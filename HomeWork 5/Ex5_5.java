import java.util.ArrayList;

interface Show_Compose{
    ArrayList<ArrayList<Object>> music_list = new ArrayList<ArrayList<Object>>();
    void AddAlbum(double  dur, String genre, String name, String album);
    void OutAll();
    public void CulDur(String genre);
}


class Music_recorder implements Show_Compose{
    int len_list = 0;
    double sum_dur = 0;
    @Override
    public void AddAlbum(double  duration_track, String genre, String name_track, String album){
        ArrayList<Object> album_list = new ArrayList<Object>();
        album_list.add(name_track);
        album_list.add(genre);
        sum_dur += duration_track;
        album_list.add(duration_track);
        album_list.add(album);
        Show_Compose.music_list.add(album_list);
        ++len_list;
    }
    @Override
    public void OutAll() {
        for (int i = 0; i < len_list; ++i){
            System.out.println(music_list.get(i).get(0) + " are " + music_list.get(i).get(1) + " and has duration(min) " + music_list.get(i).get(2) + " from " + music_list.get(i).get(3));
        }
    }
    @Override
    public void CulDur(String genre){
        System.out.println("Max duration is " + sum_dur);
    }
}


public class Ex5_5 {
    public static void main(String[] args){
        Music_recorder m = new Music_recorder();
        m.AddAlbum(3.15, "Rock", "Pieces", "Hybrid Theory");
        m.AddAlbum(2.35, "Rock", "Numb", "Hybrid Theory");
        m.AddAlbum(3.26, "Metal", "In the end", "Hybrid Theory");
        m.AddAlbum(3.50, "Heavy-Metal", "What i've done", "Hybrid Theory");
        m.AddAlbum(2.25, "Rock", "One more Light", "OML");
        m.AddAlbum(1.56, "Rock", "On a Valentine's day", "OML");
        m.OutAll();
        m.CulDur("OML");
    }
}
