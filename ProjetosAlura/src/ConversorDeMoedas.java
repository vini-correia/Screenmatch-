public class ConversorDeMoedas implements ConversaoFinanceira {


    @Override
    public void dolarParaReal(double valorDolar) {
        double cotacao = 5.50;
        double valorReal = valorDolar * cotacao;

        System.out.println("o valor convertido em reais é de: " + valorReal);

    }
}


