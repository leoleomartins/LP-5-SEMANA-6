package padroescomportamentais.strategy;

public class OperacaoPrejuizo implements Operacao {

    @Override
    public float calcular(float valor1, float valor2) {
        return valor1 - valor2;
    }
}
