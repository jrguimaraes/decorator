public class DiariaLigacao extends PlanoDecorator {

    public DiariaLigacao (Plano plano) {
        super(plano);
    }

    public float getPrecoExtra() {
        return 1.30f;
    }
}
