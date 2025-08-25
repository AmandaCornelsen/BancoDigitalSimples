package banco;

import java.util.ArrayList;

public class Banco {
    ArrayList<Conta> contas = new ArrayList<>();

    public void adicionarConta(Conta conta) {
        contas.add(conta);
        System.out.println("Conta adicionada com sucesso!");
    }

    public Conta buscarConta(String numeroConta) {
        for(Conta c : contas) {
            if(c.getNumeroConta().equals(numeroConta)) {
                return c;
            }
        }
        System.out.println("Conta não encontrada!");
        return null;
    }

    public void removerConta(String numeroConta) {
        Conta conta = buscarConta(numeroConta);
        if (conta != null) {
            contas.remove(conta);
            System.out.println("Conta removida com sucesso!");
        } else {
            System.out.println("Conta não encontrada.");
        }
    }

    public void listarContas () {
        if(contas.isEmpty()){
            System.out.println("Nenhuma conta cadastrada!");
        } else {
            for(Conta c : contas) {
                System.out.println(c);
            }
        }
    }
}
