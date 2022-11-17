public class BookStatistics implements Visitor{
    private Integer books = 0;
    private Integer sections = 0;
    private Integer paragraphs = 0;
    private Integer imageProxyies = 0;
    private Integer images = 0;
    private Integer tables = 0;

    @Override
    public void visitBook(Book v) {
        books += 1;
    }

    @Override
    public void visitSection(Section v) {
        sections += 1;
    }

    @Override
    public void visitContent(TableOfContents tableOfContent) {}

    @Override
    public void visitParagraph(Paragraph v) {
        paragraphs += 1;
    }

    @Override
    public void visitImageProxy(ImageProxy v) {
        imageProxyies += 1;
    }

    @Override
    public void visitImage(Image v) {
        images += 1;
    }

    @Override
    public void visitTable(Table v) {
        tables += 1;
    }

    public void printStatistics() {
        System.out.println("Book Statistics:");
        System.out.println(" * Number of books: " + books);
        System.out.println(" * Number of sections: " + sections);
        System.out.println(" * Number of paragraphs: " + paragraphs);
        System.out.println(" * Number of imageProxyies: " + imageProxyies);
        System.out.println(" * Number of images: " + images);
        System.out.println(" * Number of tables: " + tables);
    }
}
