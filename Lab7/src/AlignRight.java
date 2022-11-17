public class AlignRight implements AlignStrategy{

    public AlignRight() {
    }
    @Override
    public void render(String context) {
        System.out.println("\t\t" + context + ".");
    }
}
