package banco;

import java.util.Random;

public class Conta {
    private String numeroConta;
    private String titular;
    protected double saldoConta;

    public Conta(String titular) {
        this.numeroConta = gerarNumeroConta();
        this.titular = titular;
        this.saldoConta = 0.0;
    }

    private String gerarNumeroConta() {
        Random random = new Random();
        int numeroConta = 100000 + random.nextInt(900000);
        return String.valueOf(numeroConta);
    }

    public void depositar (double valor) {
        if(valor > 0 ) {
        saldoConta += valor;
        System.out.println("Valor depositado com sucesso!");
        } else {
            System.out.println("Valor inválido para depósito!");
        }
    }

    public void sacar (double valor) {
        if(valor > 0 && saldoConta >= valor) {
        saldoConta -= valor;
        System.out.println("Valor sacado com sucesso!");
        }else {
        System.out.println("Valor disponível insulficiente para saque!");
        }
    }

    public void transferir(Conta contaDestino, double valor) {
        if(valor > 0 && saldoConta >= valor) {
        this.sacar(valor);
        contaDestino.depositar(valor);
        System.out.println("Tranferência realizada com sucesso!");
        }else {
        System.out.println("Não foi possível realizar a transferência!");
        }
    }

    public double getSaldoConta() {
        return saldoConta;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "numeroConta='" + numeroConta + '\'' +
                ", titular='" + titular + '\'' +
                ", saldoConta=" + saldoConta +
                '}';
    }
}
