public class AlignCenter implements AlignStrategy{

    public AlignCenter() {
    }
    @Override
    public void render(String context) {
        System.out.println("\t." + context + ".");
    }
}
