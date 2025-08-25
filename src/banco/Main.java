import banco.Banco;
import banco.Conta;
import banco.ContaCorrente;
import banco.ContaPoupanca;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Banco banco = new Banco();
        int escolha;

        do {
            System.out.println("""
                    === Banco Digital ===
                    1 - Criar conta
                    2 - Deletar conta
                    3 - Listar contas
                    4 - Entrar em conta
                    5 - Sair
                    """);
            escolha = sc.nextInt();
            sc.nextLine(); // limpar buffer

            switch (escolha) {
                case 1 -> {
                    System.out.print("Digite o nome do titular: ");
                    String titular = sc.nextLine();

                    System.out.print("Tipo da conta (1- Corrente / 2- Poupança): ");
                    int tipo = sc.nextInt();

                    Conta conta;
                    if (tipo == 1) {
                        conta = new ContaCorrente(titular);
                    } else {
                        conta = new ContaPoupanca(titular);
                    }

                    banco.adicionarConta(conta);
                    System.out.println("Conta criada com sucesso: " + conta);
                }
                case 2 -> {
                    System.out.print("Digite o número da conta para deletar: ");
                    String numero = sc.nextLine();
                    banco.removerConta(numero);
                }
                case 3 -> banco.listarContas();
                case 4 -> {
                    System.out.print("Digite o número da conta para entrar: ");
                    String numero = sc.nextLine();
                    Conta conta = banco.buscarConta(numero);

                    if (conta != null) {
                        menuConta(sc, banco, conta);
                    } else {
                        System.out.println("Conta não encontrada.");
                    }
                }
            }
        } while (escolha != 5);

        sc.close();
    }

    private static void menuConta(Scanner sc, Banco banco, Conta conta) {
        int escolhaConta;
        do {
            System.out.println("""
                    === Menu da Conta ===
                    1 - Depositar
                    2 - Sacar
                    3 - Transferir
                    4 - Aplicar rendimento (poupança)
                    5 - Usar cheque especial (corrente)
                    6 - Voltar
                    """);
            escolhaConta = sc.nextInt();
            sc.nextLine();

            switch (escolhaConta) {
                case 1 -> {
                    System.out.print("Digite o valor para depositar: ");
                    double valor = sc.nextDouble();
                    conta.depositar(valor);
                }
                case 2 -> {
                    System.out.print("Digite o valor para sacar: ");
                    double valor = sc.nextDouble();
                    conta.sacar(valor);
                }
                case 3 -> {
                    System.out.print("Digite o número da conta destino: ");
                    String numeroDestino = sc.nextLine();
                    Conta destino = banco.buscarConta(numeroDestino);
                    if (destino != null) {
                        System.out.print("Digite o valor para transferir: ");
                        double valor = sc.nextDouble();
                        conta.transferir(destino, valor);
                    } else {
                        System.out.println("Conta destino não encontrada.");
                    }
                }
                case 4 -> {
                    if (conta instanceof ContaPoupanca poupanca) {
                        poupanca.aplicarRendimento();
                    } else {
                        System.out.println("Esta não é uma conta poupança.");
                    }
                }
                case 5 -> {
                    if (conta instanceof ContaCorrente corrente) {
                        System.out.print("Digite o valor para usar do cheque especial: ");
                        double valor = sc.nextDouble();
                        corrente.usarChequeEspecial(valor);
                    } else {
                        System.out.println("Esta não é uma conta corrente.");
                    }
                }
            }
        } while (escolhaConta != 6);
    }
}
