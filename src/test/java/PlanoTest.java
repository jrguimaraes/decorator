import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PlanoTest {

    @Test
    void deveRetornarPreco() {
        Plano plano = new PlanoInternet(20.00f);

        assertEquals(20.00f, plano.getPreco());
    }

    @Test
    void deveRetornarPrecoComDiariaLigacao() {
        Plano plano = new DiariaLigacao(new PlanoInternet(20.00f));

        assertEquals(21.30f, plano.getPreco());
    }

    @Test
    void deveRetornarPrecoComDiariaInstagram() {
        Plano plano = new DiariaInstagram(new PlanoInternet(20.00f));

        assertEquals(23.00f, plano.getPreco());
    }

    @Test
    void deveRetornarPrecoComDiariaTwitch() {
        Plano plano = new DiariaTwitch(new PlanoInternet(20.00f));

        assertEquals(23.80f, plano.getPreco());
    }
    @Test
    void deveRetornarPrecoComDiariaLigacaoMaisDiariaInstagram() {
        Plano plano = new DiariaLigacao(new DiariaInstagram(new PlanoInternet(20.00f)));

        assertEquals(24.30f, plano.getPreco());
    }

    @Test
    void deveRetornarPrecoComDiariaLigacaoMaisDiariaTwitch() {
        Plano plano = new DiariaLigacao(new DiariaTwitch(new PlanoInternet(20.00f)));

        assertEquals(25.10f, plano.getPreco(), 0.01f);
    }

    @Test
    void deveRetornarPrecoComDiariaInstagramMaisDiariaTwitch() {
        Plano plano = new DiariaInstagram(new DiariaTwitch(new PlanoInternet(20.00f)));

        assertEquals(26.80f, plano.getPreco(), 0.01f);
    }

    @Test
    void deveRetornarPrecoComDiariaLigacaoMaisDiariaInstagramMaisDiariaTwitch() {
        Plano plano = new DiariaLigacao(new DiariaInstagram(new DiariaTwitch(new PlanoInternet(20.00f))));

        assertEquals(28.10f, plano.getPreco(), 0.01f);
    }

}
