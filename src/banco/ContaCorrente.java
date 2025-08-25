package banco;

public class ContaCorrente extends Conta {
    private double limiteChequeEspecial = 500.0;

    public ContaCorrente(String titular) {
        super(titular);
    }

    @Override
    public void sacar(double valor) {
        if (valor <= saldoConta + limiteChequeEspecial) {
            saldoConta -= valor;
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Limite do cheque especial ultrapassado.");
        }
    }

    public void usarChequeEspecial(double valor) {
        if (valor <= limiteChequeEspecial) {
            saldoConta -= valor;
            limiteChequeEspecial -= valor;
            System.out.println("Usou cheque especial! Novo saldo: " + saldoConta);
        } else {
            System.out.println("Limite do cheque especial insuficiente.");
        }
    }
}
