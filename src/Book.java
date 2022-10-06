import java.util.*;

public class Book {
    private String paragraph;
    private String image;
    private String table;
    private String title;
    private List<String> book = new ArrayList<>();

    public Book(String title) {
        this.title = title;
    }

    public void createNewParagraph(String paragraph) {
        this.book.add(paragraph);
    }

    public void createNewImage(String image) {
        this.book.add(image);
    }

    public void createNewTable(String table) {
        this.book.add(table);
    }

    public void print() {
        System.out.println(this.title);
        this.book.forEach(System.out::println);
    }
}
