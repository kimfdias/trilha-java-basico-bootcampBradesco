        // TO DO: 1 - Conhecer e importar a classe Scanner

        // 2. Exibir as mensagens para o usuário

        // 3. Obter pela Scanner os valores digitados no terminal

        // 4. Exibir a mensagem da conta criada

import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da conta:");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite a agência:");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o seu nome:");
        scanner.nextLine(); // limpa o buffer
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo:");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente +
                ", obrigado por criar uma conta em nosso banco, sua agência é " +
                agencia + ", conta " + numero +
                " e seu saldo de" + saldo + " já está disponível para saque.");

        scanner.close();
    }
}