import java.util.ArrayList;
import java.util.List;

public class Playlist implements TipDeFisier {

    public String title;
    public List<TipDeFisier> playlist;

    public Playlist(String title) {
        this.title = title;
        playlist = new ArrayList<>();
    }

    @Override
    public void add(TipDeFisier p) {
        playlist.add(p);
    }

    @Override
    public void remove(TipDeFisier p) {
        playlist.remove(p);
    }

    @Override
    public TipDeFisier get(int index) {
        return playlist.get(index);
    }

    @Override
    public void print() {
        System.out.println(this.title);
        for (TipDeFisier p : playlist)
            p.print();
    }

    @Override
    public void accept(Visitor v) {
        for (TipDeFisier p : playlist)
            p.accept(v);
        v.visitPlaylist(this);
    }
}
