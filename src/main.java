
public class main {
    public static void main(String[] args) {
        Book b = new Book("Disco Titanic");
        b.createNewParagraph("Text 1");
        b.createNewParagraph("Text 2");
        b.createNewParagraph("Text 3");
        b.createNewImage("Image 1");
        b.createNewTable("Table 1");
        b.createNewParagraph("Text 4");
        b.print();
    }
}
