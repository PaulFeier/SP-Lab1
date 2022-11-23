public interface TipDeFisier {
    public void add(TipDeFisier p);
    public void remove(TipDeFisier p);
    public TipDeFisier get(int index);
    public void print();
    void accept(Visitor v);
}
