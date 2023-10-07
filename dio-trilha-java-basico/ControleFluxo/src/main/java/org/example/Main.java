package org.example;

import java.util.Scanner;

public class Main {

    //Main só com a execução, com o metódos implementados na classe Contador.

    public static void main(String[] args) {
        Contador contador = new Contador(); // Instancia o objeto
        Contador.scanner(); //Inicia a coleta de dados para o usuário

        try {
            contador.contar(contador.getParametroUm(), contador.getParametroDois());
        }catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }
    }


}