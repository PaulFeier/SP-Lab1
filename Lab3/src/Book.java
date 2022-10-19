import java.util.*;

public class Book extends Section {
    private Author a;
    public Book(String title) {
        super(title);
    }

    public void addContent(Element e) {
        super.add(e);
    }
    public void addAuthor(Author a) {
        this.a = a;
    }
    @Override
    public void print() {
        a.print();
        super.print();
    }
}
