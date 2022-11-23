import java.util.ArrayList;
import java.util.List;

public class MediaPlayer implements TipDeFisier{

    public String title;
    public List<Playlist> playlists;

    public MediaPlayer(String title) {
        this.title = title;
        playlists = new ArrayList<>();
    }

    @Override
    public void add(TipDeFisier p) {

    }

    @Override
    public void remove(TipDeFisier p) {

    }

    @Override
    public TipDeFisier get(int index) {
        return null;
    }

    @Override
    public void print() {

    }

    public void add(Playlist p) {
        playlists.add(p);
    }
    public void accept(Visitor v) {
        for (Playlist p : playlists)
            p.accept(v);
    }
}