// ***********************
// Dados iniciais do cliente:

// Nome: Jacqueline Oliveira
// Tipo conta: Corrente
// Saldo inicial: R$ 2500,00
// ***********************

// Operações

// 1- Consultar saldos
// 2- Receber valor
// 3- Transferir valor
// 4- Sair

// Digite a opção desejada:

// Inicializar dados do cliente
// Menu de opções
// Visualização do saldo
// Enviar valor
// Receber valor

import java.util.Scanner;

public class Cliente_transferencia {

    private String nome;
    private String tipo_conta;
    private double saldo;
    Scanner scanner = new Scanner(System.in);

    // Construtor padrão
    Cliente_transferencia() {

    }

    // Inicializar dados do cliente
    public Cliente_transferencia(String nome, String tipo_conta, double saldo) {
        this.nome = nome;
        this.tipo_conta = tipo_conta;
        this.saldo = saldo;
        System.out.println("------------------------");
        System.out.println("Nome: " + nome);
        System.out.println("Tipo conta: " + tipo_conta);
        System.out.println("Saldo inicial: " + saldo);
        System.out.println("***********************");
    }

    // Menu de opções
    public void menudeopcoes() {
        // 1- Consultar saldos
        // 2- Receber valor
        // 3- Transferir valor
        // 4- Sair
        // Operações
        String menu = """
                Operações
                1- Consultar saldos
                2- Receber valor
                3- Transferir valor
                4- Sair
                numero: ?
                """;

        System.out.println(menu);
        String valor_digitado = scanner.next();

        if (valor_digitado.equals("1")) {
            consulta_dados();
        } else if (valor_digitado.equals("2")) {
            quardar_saldos_recebido();
        } else if (valor_digitado.equals("3")) {
            transferir_saldos_recebido();
        } else if (valor_digitado.equals("4")) {
            System.out.println("Obrigado por usar nossos serviços.");
        }
    }

    private void consulta_dados() {
        System.out.printf("Saldo da consulta: %s  \n", saldo);
        System.out.println("------------------------");
        System.out.println("------------------------\n");
        menudeopcoes();
    }

    private void quardar_saldos_recebido() {
        System.out.println("Digite o valor o valor");
        double novo_saldo = scanner.nextDouble();
        receber_saldos(novo_saldo);
        menudeopcoes();
    }

    public double receber_saldos(double novo_saldo) {
        saldo = saldo + novo_saldo;
        return saldo;
    }

    private void transferir_saldos_recebido() {
        System.out.println("Digite o valor: ");
        double novo_saldo = scanner.nextDouble();
        transferir_saldos(novo_saldo);
        menudeopcoes();
    }

    public double transferir_saldos(double novo_saldo) {
        if (saldo >= novo_saldo) {
            saldo = saldo - novo_saldo;
        } else if (novo_saldo > saldo) {
            System.out.println("Infelizmente voçe não tem saldo na conta");
        }
        return saldo;
    }

    public static void main(String[] args) {

        Cliente_transferencia usuario1 = new Cliente_transferencia("Daniel", "Corrente", 2351);

        usuario1.menudeopcoes();

    }
}
// double saldoNumerico = Double.parseDouble(saldoString);