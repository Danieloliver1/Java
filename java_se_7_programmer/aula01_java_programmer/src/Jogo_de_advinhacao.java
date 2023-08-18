// Crie um programa que simula um jogo de adivinhação, que deve gerar um número aleatório ////entre 0 e 100 e pedir para que o usuário tente adivinhar o número, em até 5 //tentativas. A cada tentativa, o programa deve informar se o número digitado pelo usuário é //maior ou menor do que o número gerado.

//Para gerar um número aleatório em Java: new Random().nextInt(100);
//Utilize o Scanner para obter os dados do usuário;
//Utilize uma variável para contar as tentativas;
//Utilize um loop para controlar as tentativas;
//Utilize a instrução break; para interromper o loop.

import java.util.Random;
import java.util.Scanner;

public class Jogo_de_advinhacao {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // criando uma instancia da classe aleatorio
        Random random = new Random();

        // gerando um numero aleatorio entre 0 a 100
        int numero_aleatorio = random.nextInt(5);

        for (int i = 0; i <= 5; i++) {
            System.out.println("Digite o valor");
            int numero_digitado = scanner.nextInt();
            System.out.println(numero_aleatorio);
            if(numero_digitado == numero_aleatorio){System.out.println("Parabens voce acertou");break;}
            else if(i == 5)System.out.println("não foi dessa vez");
        }

        // System.out.println(numero_aleatorio);

    }
}
