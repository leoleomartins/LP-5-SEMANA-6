package padroescomportamentais.command;

public class Reembolso {

    private double valor;
    private String situacao;

    public Reembolso(double valor) {
        this.valor = valor;
    }

    public String getSituacao() {
        return situacao;
    }

    public void abrirReembolso(){this.situacao = "Reembolso aberto";}

    public void fecharReembolso(){this.situacao= "Reembolso fechado";}
}
