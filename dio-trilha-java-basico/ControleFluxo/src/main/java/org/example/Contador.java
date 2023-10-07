package org.example;

import java.util.Scanner;

public class Contador {

    private static int parametroUm;
    private static int parametroDois;

    public static int getParametroUm() {
        return parametroUm;
    }

    public static int getParametroDois() {
        return parametroDois;
    }

    public static void scanner(){
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro: ");
        parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro: ");
        parametroDois = terminal.nextInt();
    }
    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {

        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException ("O segundo parâmetro deve ser maior que o primeiro");
        }

        int contagem = parametroDois - parametroUm;
        for (int i=1; i<=contagem; i++) {
            System.out.println("Imprimindo o número " + i);

        }
    }

}
