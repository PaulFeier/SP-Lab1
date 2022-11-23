public class Main {
    public static void main(String[] args) {

        MediaPlayer m = new MediaPlayer("Winamp");
        Playlist p = new Playlist("Chill");
        p.add(new Melodie("BudaBar", 3000));
        p.add(new Video("Waves of Caraibe", 20000));
        p.add(new Melodie("Simple things", 4000));
        p.add(new Gif("sunglasses", 500));
        m.add(p);

        MediaSizeVisitor v = new MediaSizeVisitor();
        m.accept(v);
        v.printSizes();

    }
}