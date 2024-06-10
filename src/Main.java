import modules.Cliente;
import modules.Conta;
import modules.ContaCorrente;
import modules.ContaPoupanca;

public class Main {
    public static void main(String[] args) {
        Cliente anderson = new Cliente();
        anderson.setNome("Anderson");

        Conta cc = new ContaCorrente(anderson);
        cc.depositar(100);
        cc.extrato();

        Conta poupanca = new ContaPoupanca(anderson) ;
        poupanca.extrato();

        cc.transferir(100, poupanca);
        cc.extrato();

        poupanca.extrato();
    }
}