package banco;

public class ContaPoupanca extends Conta {
    private double taxaRendimento = 0.05; // 5% de rendimento

    public ContaPoupanca(String titular) {
        super(titular);
    }

    public void aplicarRendimento() {
        saldoConta += saldoConta * taxaRendimento;
        System.out.println("Rendimento aplicado! Novo saldo: " + saldoConta);
    }
}
