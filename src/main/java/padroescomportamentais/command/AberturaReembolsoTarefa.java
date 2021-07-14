package padroescomportamentais.command;

public class AberturaReembolsoTarefa implements Tarefa{

    private Reembolso reembolso;

    public AberturaReembolsoTarefa(Reembolso reembolso) {
        this.reembolso = reembolso;
    }

    @Override
    public void executar() {
        this.reembolso.abrirReembolso();
    }

    @Override
    public void cancelar() {
        this.reembolso.fecharReembolso();
    }

}
