package padroescomportamentais.strategy;

public class Investidor {

    private float montante;

    public float getMontante() {
        return montante;
    }

    public void operacaoComLucro(float valor1, float valor2){
        Calculadora calculadora = new Calculadora(valor1, valor2);
        this.montante = calculadora.calcular(new OperacaoLucro());
    }

    public void operacaoComPrejuizo(float valor1, float valor2){
        Calculadora calculadora = new Calculadora(valor1, valor2);
        this.montante = calculadora.calcular(new OperacaoPrejuizo());
    }
}
