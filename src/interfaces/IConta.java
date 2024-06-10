package interfaces;

import modules.Conta;

public interface IConta {
    void depositar(double valor);
    void sacar(double valor);
    void transferir(double valor, Conta contaDestino);
    void extrato();
}
