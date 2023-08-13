import java.math.BigInteger;
import java.text.DecimalFormat;

class Estatistica {

    // BigInteger amazena valores inteiro grandes se fosse o int não daria, como é
    // fatorial valores altos.
    // esta função tem como objetivo de criar um fatorial receber um valor e retorna
    // o resultado fatorial
    public BigInteger fatorial(int numero) {
        BigInteger resultado = BigInteger.ONE;

        for (int i = 1; i <= numero; i++) {
            resultado = resultado.multiply(BigInteger.valueOf(i));
        }
        return resultado;
    }

    // esta função tem comom objetivo de calculcar combinação precisa do fatorial
    // para isso recebe dois valores e
    // retorna o rresultado a combinação.
    public BigInteger combinacao(int valor1, int valor2) {

        BigInteger valor1_fatorial = fatorial(valor1);
        BigInteger valor2_fatorial = fatorial(valor2);

        BigInteger denominador = valor2_fatorial.multiply(fatorial(valor1 - valor2));
        BigInteger resultado = valor1_fatorial.divide(denominador);
        return resultado;
    }

    // aqui é equação hipergeometrica recebe quatro valores
    public double hiperGeometrica(int N, int n, int r, int k) {

        BigInteger denominador = combinacao(r, k).multiply(combinacao(N - r, n - k));
        BigInteger numerador = combinacao(N, n);

        double resultado = denominador.doubleValue() / numerador.doubleValue();
        return resultado;
    }

    public static void main(String[] args) {

        // instanciando a classe
        Estatistica teste = new Estatistica();

        // chamando metodo hipergeometrico
        double mostrar = teste.hiperGeometrica(13, 2, 4, 1);

        // instanciando class DecimalFormat para formatar o numero
        DecimalFormat df = new DecimalFormat("0,00%");
        String str = df.format(mostrar);

        System.out.println(str);
    }
}
