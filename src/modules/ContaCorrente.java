package modules;

public class ContaCorrente extends Conta{
    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    public void extrato() {
        System.out.println("==== Extrato Conta Corrente ====");
        super.extrato();
    }
}
