public class Paire<A, B>{

    private final A fst;
    private final B snd;

    public Paire(A fst, B snd){
        this.fst = fst;
        this.snd = snd;
    }

    public A fst() { return fst;}
    public B snd() { return snd;}


    public <C> Paire <C,B> changeFst(C val){
        return new Paire<>(val, snd);
    }

    public <C> Paire <A,C> changeSnd(C val){
        return new Paire<>(fst, val);
    }

    @Override
    public String toString() {
        return String.format("(%s; %s) :: Paire[%s,%s]",
                fst, snd, fst.getClass().getSimpleName(), snd.getClass().getSimpleName());
    }
}
