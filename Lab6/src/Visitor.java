public interface Visitor {
    void visitBook(Book v);
    void visitSection(Section v);
    // void visitTableOfContents(TableOfContents v);
    void visitParagraph(Paragraph v);
    void visitImageProxy(ImageProxy v);
    void visitImage(Image v);
    void visitTable(Table v);
}
