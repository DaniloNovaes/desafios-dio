package org.example;

import java.util.Scanner;

/**
 * Classe com os atributos da Conta, bem como os métodos SET e toSTRING,
 * para imprimir no console o solicitado no desafio.
 */
public class ContaTerminal {
    private int numeroConta;
    private String agencia;
    private String nomeCliente;
    private float saldo;

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Olá " + nomeCliente + ", obrigado por criar uma conta em nossa banco, sua agência é " + agencia
                + ", conta " + numeroConta + " e seu saldo de R$ " + saldo + " já está disponível para saque.";
    }

}
