import java.util.Scanner;

public class Outroloop {
      public static void main(String[] args) {
        
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        int totalDeNotas = 0;
        // while
        while(nota != -1){
            System.out.println("Diga sua avaliação para o filme ou-1 para encerrar ");
            nota = leitura.nextDouble();

            if (nota!= -1){
            mediaAvaliacao += nota;
            totalDeNotas++;
        }
    }
        System.out.print("Média de avaliações " + mediaAvaliacao/3);
    }
}
