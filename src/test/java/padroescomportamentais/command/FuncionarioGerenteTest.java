package padroescomportamentais.command;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Teste Gerente: Command")
class FuncionarioGerenteTest {

    FuncionarioGerente gerente;
    Reembolso reembolso;

    @BeforeEach
    void setUp(){
        gerente = new FuncionarioGerente();
        reembolso = new Reembolso(10d);
    }

    @Test
    @DisplayName("Deve abrir pedido de reembolso")
    void deveAbrirReembolso(){
        Tarefa aberturaReembolso = new AberturaReembolsoTarefa(reembolso);
        gerente.executarTarefa(aberturaReembolso);

        assertEquals("Reembolso aberto", reembolso.getSituacao());
    }

    @Test
    @DisplayName("Deve fechar pedido de reembolso")
    void deveFecharReembolso(){
        Tarefa fechamentoReembolso = new FechamentoReembolsoTarefa(reembolso);
        gerente.executarTarefa(fechamentoReembolso);

        assertEquals("Reembolso fechado", reembolso.getSituacao());
    }

    @Test
    @DisplayName("Deve cancelar fechamento do pedido de reembolso")
    void deveCancelarFecharReembolso(){
        Tarefa aberturaReembolso = new AberturaReembolsoTarefa(reembolso);
        Tarefa fechamentoReembolso = new FechamentoReembolsoTarefa(reembolso);

        gerente.executarTarefa(aberturaReembolso);
        gerente.executarTarefa(fechamentoReembolso);

        gerente.cancelarUltimaTarefa();

        assertEquals("Reembolso aberto", reembolso.getSituacao());
    }
}
