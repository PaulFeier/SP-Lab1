import java.util.ArrayList;
import java.util.List;

public class TableOfContents implements Element{
    List<String> content;

    public TableOfContents() {
        content = new ArrayList<>();
    }

    public void addContent(String name, int page){
        content.add(name + "................. pag " + page);
    }

    @Override
    public void add(Element element) {

    }

    @Override
    public void remove(Element element) {

    }

    @Override
    public Element get(int index) {
        return null;
    }

    @Override
    public void print() {
        content.forEach(System.out::println);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitContent(this);
    }
}