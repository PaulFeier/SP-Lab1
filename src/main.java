
public class main {
    public static void main(String[] args) {
        Book b = new Book("Disco Titanic");
        b.createNewParagraph("1");
        b.createNewParagraph("2");
        b.createNewParagraph("3");
        b.createNewImage("Image 1");
        b.createNewTable("Table 1");
        b.createNewParagraph("4");
        b.print();
    }
}
