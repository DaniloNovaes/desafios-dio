package org.example;

public class ContaTerminalScanner {

    private ContaTerminal contaTerminal;

    /**
     * Classe com método para a leitura da informações, com o intuito de deixar o main mais enxuto.
     */
    public ContaTerminalScanner(ContaTerminal contaTerminal) {
      this.contaTerminal = contaTerminal;
    }

    public void leitor () {

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Por favor digite o número da agência: ");
        contaTerminal.setAgencia(scanner.nextLine());

        System.out.println("Por favor digite o número da conta: ");
        contaTerminal.setNumeroConta(Integer.parseInt(scanner.nextLine()));

        System.out.println("Por favor, digite o seu nome:");
        contaTerminal.setNomeCliente(scanner.nextLine());

        System.out.println("Por favor, digite o saldo inicial:");
        contaTerminal.setSaldo(Float.parseFloat(scanner.nextLine()));

        scanner.close();

        System.out.println(contaTerminal.toString());
    }
}
