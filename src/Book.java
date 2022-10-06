import java.util.*;

public class Book {
    private List<String> paragraphList = new ArrayList<>();
    private List<String> imagesList = new ArrayList<>();
    private List<String> tableList = new ArrayList<>();
    private String title;

    public Book(String title) {
        this.title = title;
    }

    public void createNewParagraph(String paragraph) {
        this.paragraphList.add(paragraph);
    }

    public void createNewImage(String image) {
        this.imagesList.add(image);
    }

    public void createNewTable(String table) {
        this.tableList.add(table);
    }

    public void print() {
        System.out.println(this.title);
        this.paragraphList.forEach(System.out::println);
        this.imagesList.forEach(System.out::println);
        this.tableList.forEach(System.out::println);
    }
}
