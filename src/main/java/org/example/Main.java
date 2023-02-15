package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double saldo = 3000, retirar, saldoFinal = 0, leiaCodigo, codigoConta, valorTransferencia, saldoFinalContaTransferida;
        double marcos = 6325, paulo = 4145, aurelio = 3265;
        int servicoDesejado;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Unidade do Banco central");
        System.out.println("Bem vindo! Selecione o serviço desejado:");
        System.out.println("OPÇÃO 1- Visualizar saldo");
        System.out.println("OPÇÃO 2- Saque");
        System.out.println("OPÇÃO 3- Transferências");
        servicoDesejado = scanner.nextInt();
        if (servicoDesejado == 1) {
            System.out.println("Seu saldo atual é de: r$" + saldo);
        } else if (servicoDesejado == 2) {
            System.out.println("Seu saldo atual é de: r$" + saldo);
            System.out.println("Qual valor você deseja retirar?");
            retirar = scanner.nextInt();
            if (retirar <= saldo) {
                saldoFinal = saldo - retirar;
                System.out.println("Saque realizado! Aguarde a contagem das cédulas.");
                System.out.println("O valor do seu saldo atual após o saque é de: R$" + saldoFinal);
            } else {
                System.out.println("Valor de saque indisponivel.");
                System.out.println("O valor que você deseja retirar é maior do que você possui em sua conta.");
            }
        } else if (servicoDesejado == 3) {
            System.out.println("Informe o codigo da conta que a transferencia deverá ser realizada: ");
            System.out.println(" marcos=6325,paulo=4145,aurelio=3265");
            leiaCodigo = scanner.nextInt();
            if (leiaCodigo == 6325) {
                System.out.println("Marcos tem R$ 600, quanto deseja transferir?");
                valorTransferencia = scanner.nextInt();
                if (valorTransferencia > saldo) {
                    System.out.println("Transferencia inválida. O valor da transferencia é superior ao seu saldo.");
                } else {
                    saldoFinalContaTransferida = (600 + valorTransferencia);
                    System.out.println("Transferência realizada.");
                    System.out.println("Agora marcos tem r$" + saldoFinalContaTransferida + " de saldo na conta.");
                }
            } else if (leiaCodigo == 4145) {
                System.out.println("Paulo tem R$ 300, quanto deseja transferir?");
                valorTransferencia = scanner.nextInt();
                if (valorTransferencia > saldo) {
                    System.out.println("Transferencia inválida. O valor da transferencia é superior ao seu saldo.");
                } else {
                    saldoFinalContaTransferida = (300 + valorTransferencia);
                    System.out.println("Transferência realizada.");
                    System.out.println("Agora Paulo tem r$" + saldoFinalContaTransferida + " de saldo na conta.");
                }
            } else if (leiaCodigo == 3265) {
                System.out.println("Aurelio tem R$ 1000, quanto deseja transferir?");
                valorTransferencia = scanner.nextInt();
                if (valorTransferencia > saldo) {
                    System.out.println("Transferencia inválida. O valor da transferencia é superior ao seu saldo.");
                } else {
                    saldoFinalContaTransferida = (1000 + valorTransferencia);
                    System.out.println("Transferência realizada.");
                    System.out.println("Agora Aurelio tem r$" + saldoFinalContaTransferida + " de saldo na conta.");
                }
            } else {
                System.out.println("Código de conta inexistente.");
            }
        } else {
            System.out.println("Serviço indisponível.");
        }
    }
}
