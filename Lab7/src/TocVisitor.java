public class TocVisitor implements Visitor{
    int nrOfPages;
    TableOfContents tableOfContent;

    public TocVisitor() {
        nrOfPages = 0;
        tableOfContent = new TableOfContents();
    }

    @Override
    public void visitBook(Book book) {
        nrOfPages++;
    }

    @Override
    public void visitSection(Section section) {
        tableOfContent.addContent(section.getTitle(), nrOfPages);
    }

    @Override
    public void visitParagraph(Paragraph paragraph) {
        nrOfPages++;
    }

    @Override
    public void visitImageProxy(ImageProxy imageProxy) {
        nrOfPages++;
    }

    @Override
    public void visitImage(Image image) {
        nrOfPages++;
    }

    @Override
    public void visitTable(Table table) {
        nrOfPages++;
    }

    @Override
    public void visitContent(TableOfContents tableOfContent) {
        nrOfPages++;
    }

    public TableOfContents getToC(){
        return tableOfContent;
    }
}
