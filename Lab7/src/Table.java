public class Table implements Element {
    private String text;

    public Table(String text){
        this.text = text;
    }

    @Override
    public void add(Element element) {}

    @Override
    public void remove(Element element) {}

    @Override
    public Element get(int index) {
        return null;
    }

    @Override
    public void print() {
        System.out.println(text);
    }

    @Override
    public void accept(Visitor v) {
        v.visitTable(this);
    }
}
