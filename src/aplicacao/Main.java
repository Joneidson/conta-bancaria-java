package aplicacao;

import entidades.Conta;
import entidades.Titular;

import java.util.Locale;
import java.util.Scanner;

// Estrutura base de qualquer programa Java
public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int opcao;
        Conta conta = null;
        do {
            System.out.print("""
                    ==================
                    |      MENU      |
                    ==================
                    1 - CRIAR CONTA
                    2 - ALTERAR NOME
                    3 - SACAR
                    4 - DEPOSITAR
                    5 - SAIR
                    Qual a opção :
                    """);
            opcao = sc.nextInt();

            switch (opcao) {

                case 1 -> {

                    System.out.println("Digite o n° da conta:");
                    int numeroConta = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Digite o nome do Titular: ");
                    String titularName = sc.nextLine();

                    Titular titular = new Titular(titularName);

                    System.out.println("Quer fazer deposito inicial? (S/N) ");
                    char opcaoDeposito = sc.next().charAt(0);

                    if (opcaoDeposito == 's') {
                        System.out.println("Digite o valor do deposito: $ ");
                        double deposito = sc.nextDouble();
                        conta = new Conta(numeroConta, titular, deposito);
                    } else {
                        conta = new Conta(numeroConta, titular);
                    }

                }
                case 2 -> {
                    sc.nextLine();
                    if (conta == null) {
                        System.out.println("Cadastre uma conta primeiro");
                    } else {

                        System.out.println("Digite o novo nome do Titular: ");
                        String novoNome = sc.nextLine();
                        conta.setTitular(novoNome);
                        System.out.println("Nome atualizado com sucesso!");
                        System.out.println(conta);
                    }
                }
                case 3 -> {
                    if (conta == null) {
                        System.out.println("Cadastre uma conta primeiro");
                    } else {
                        System.out.println("Qual o valor do saque: $ ");
                        double valorSaque = sc.nextDouble();
                        conta.sacar(valorSaque);
                        System.out.println("Saque realizado com sucesso!");
                        System.out.println(conta);
                    }
                }
                case 4 -> {
                    if (conta == null) {
                        System.out.println("Cadastre uma conta primeiro");
                    } else {
                        System.out.println("Qual o valor deposito: $ ");
                        double valorDeposito = sc.nextDouble();
                        conta.depositar(valorDeposito);
                        System.out.println("Valor depositado com sucesso!");
                        System.out.println(conta);
                    }
                }
                case 5 -> {
                    System.out.println("Saindo . . .");
                }
                default -> {
                    System.out.println("Opcao invalida!");
                }

            }

        } while (opcao != 5);
        sc.close();
    }
}