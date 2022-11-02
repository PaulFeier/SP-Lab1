public class AlignLeft implements AlignStrategy{

    public AlignLeft() {
    }
    @Override
    public void render(String context) {
        System.out.println("." + context);
    }
}
