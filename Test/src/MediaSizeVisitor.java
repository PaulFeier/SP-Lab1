public class MediaSizeVisitor implements Visitor{

    public Integer videos = 0;
    public Integer melodii = 0;
    public Integer gifs = 0;
    public Integer playlists = 0;

    public MediaSizeVisitor() {

    }

    @Override
    public void visitVideo(Video v) {
        videos += v.size;
    }

    @Override
    public void visitMelodie(Melodie m) {
        melodii += m.size;
    }

    @Override
    public void visitGif(Gif gif) {
        gifs += gif.size;
    }

    @Override
    public void visitPlaylist(Playlist v) {
        playlists += videos + melodii + gifs;
    }

    public void printSizes() {
        System.out.println("videos size: " + videos);
        System.out.println("melodii size: " + melodii);
        System.out.println("gifs size: " + gifs);
        System.out.println("playlits size: " + playlists);
    }
}
