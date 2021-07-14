package padroescomportamentais.strategy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
@DisplayName("Teste Strategy")
class InvestidorTest {

    @Test
    @DisplayName("Operacao com lucro: deve somar o lucro")
    void deveSomar(){
        Investidor investidor = new Investidor();
        investidor.operacaoComLucro(10f,90f);
        assertEquals(100f,investidor.getMontante());
    }

    @Test
    @DisplayName("Operacao com prejuizo: deve subtrair")
    void deveSubtrair(){
        Investidor investidor = new Investidor();
        investidor.operacaoComPrejuizo(100f,90f);
        assertEquals(10f,investidor.getMontante());
    }

}
