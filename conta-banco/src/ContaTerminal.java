        // TO DO: 1 - Conhecer e importar a classe Scanner

        // 2. Exibir as mensagens para o usuário

        // 3. Obter pela Scanner os valores digitados no terminal

        // 4. Exibir a mensagem da conta criada

import java.text.DecimalFormat;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("R$ #,##0.00");

        System.out.println("--- Bem-vindo ao Banco DIO da Kim Kim! Irei te auxiliar hoje! ---");

        System.out.println("Digite o número da conta:");
        int numero = scanner.nextInt();

        System.out.println("Digite a agência:");
        String agencia = scanner.next();

        scanner.nextLine(); 

        System.out.println("Digite o nome do cliente:");
        String nomeCliente = scanner.nextLine();

        double saldo;

        // validação de saldo
        do {
            System.out.println("Digite o saldo inicial:");
            saldo = scanner.nextDouble();

            if (saldo < 0) {
                System.out.println("Saldo inválido! Digite um valor positivo.");
            }

        } while (saldo < 0);

        // definição do tipo de conta
        String tipoConta;

        if (saldo <= 500) {
            tipoConta = "Conta Básica";
        } else if (saldo <= 2000) {
            tipoConta = "Conta Corrente";
        } else {
            tipoConta = "Conta Premium";
        }

        System.out.println("\n====================================");

        System.out.println("Olá " + nomeCliente +
                ", obrigado por criar uma conta em nosso banco! Aqui estão os detalhes:");

        System.out.println("Agência: " + agencia);
        System.out.println("Conta: " + numero);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo disponível: " + df.format(saldo));

        System.out.println("====================================");

        scanner.close();
    }
}