public class Gif implements TipDeFisier {

    public String title;
    public Integer size;

    public Gif(String title, Integer size) {
        this.title = title;
        this.size = size;
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

    @Override
    public void accept(Visitor v) {
        v.visitGif(this);
    }

    public Integer getSize() {
        return this.size;
    }
}
