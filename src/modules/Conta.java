package modules;

import interfaces.IConta;

public abstract class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 0001;
    private static int numeroSequencial = 00001;
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = numeroSequencial++;
        this.cliente = cliente;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }
    @Override
    public void sacar(double valor) {
        if(saldo >= valor) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente para saque!");
        }
    }
    @Override
    public void transferir(double valor, Conta contaDestino) {
        if(saldo >= valor) {
            this.sacar(valor);
            contaDestino.depositar(valor);
        } else {
            System.out.println("Saldo insuficiente para transferência!");
        }
    }
    @Override
    public void extrato() {
            System.out.println(String.format("Titular: %s", cliente.getNome()));
            System.out.println(String.format("Agencia: %d", agencia));
            System.out.println(String.format("Numero: %d", numero));
            System.out.println(String.format("Saldo: %.2f", saldo));
    }

    public int getAgencia() {
        return agencia;
    }
    public int getNumero() {
        return numero;
    }
    public double getSaldo() {
        return saldo;
    }
}
