package padroescomportamentais.command;

public class FechamentoReembolsoTarefa implements Tarefa {

   private Reembolso reembolso;

    public FechamentoReembolsoTarefa(Reembolso reembolso) {
        this.reembolso = reembolso;
    }

    @Override
    public void executar() {
    this.reembolso.fecharReembolso();
    }

    @Override
    public void cancelar() {
    this.reembolso.abrirReembolso();
    }
}
