
public class Escopo_da_variavel {

    public static void main(String[] args) {

        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        System.out.println(incluidoNoPlano);
        int num = 5;
        int resultado = ++num; // num é incrementado para 6 e depois atribuído a resultado
        System.out.println(num); // imprime 6
        System.out.println(resultado); // imprime 6

        int num1 = 5;
        int resultado1 = num1++; // num é atribuído primeiramente à variável resultado e depois incrementado para
                                 // 6
        System.out.println(num1); // imprime 6
        System.out.println(resultado1); // imprime 5

        double notaDoFilme = 8.1;

        double media = (9.8 + 6.3 + 8.0) / 3;

        System.out.println(media);

        String sinopse;
        sinopse = "Filme de aventura com galã dos anos 80";
        System.out.println(sinopse);

        String teste = """
                Filme Top Gun
                Filme de aventura com galã dos anos 80
                muito bom!
                Ano de lançamento
                """ + anoDeLancamento;
        System.out.println(teste);

        String tipo_string = "Maria";
        int numero_inteiro = 30;
        double numero_decimal = 55.9999;
        System.out.println(String.format("Meu nome é %s, eu tenho %d anos e hoje gastei %.2f reais", tipo_string,
                numero_inteiro, numero_decimal));

        int classificacao;
        classificacao = (int) (media / 2);
        System.out.println(classificacao);
        // Casting é um recurso utilizado em Java para converter um tipo de dado em
        // outro. Essa conversão pode ser feita de forma automática pelo compilador
        // (conversão implícita), quando o tipo de dado de destino é compatível com o
        // tipo de dado de origem, ou de forma manual (conversão explícita), utilizando
        // o operador de casting.

        // O casting é utilizado para permitir que tipos de dados incompatíveis possam
        // ser utilizados em uma mesma operação ou expressão. Por exemplo, se um método
        // espera um parâmetro do tipo int e o valor que se deseja passar é do tipo
        // double, é necessário fazer um casting para converter o valor em int.
    }
}



