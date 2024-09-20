import javax.crypto.spec.OAEPParameterSpec;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String nome = "Spike";
        String tipoDaConta = "Corrente";
        double saldoInicial = 2500.00;
        Scanner leitura = new Scanner(System.in);
        int operações = 0;
        String menu = """
        
        Operações

        1- Consultar saldos
        2- Receber valor
        3- Transferir valor
        4- Sair

        Digite a opção desejada:
        """;

        // Mensagem Inicial
        System.out.println("********************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo da conta: " + tipoDaConta);
        System.out.println("Saldo atual: " + saldoInicial);
        System.out.println("\n********************");
        System.out.println(menu);

        operações = leitura.nextInt();

        // Loop de consulta
        while (operações != 4) {

            // Consultar Saldo
            if (operações == 1) {
                double saldoNaConta = saldoInicial;
                System.out.println("Saldo na conta atual: " + saldoNaConta +

                        """
                        
                        
                        Operações
                        
                        1- Consultar saldos
                        2- Receber valor
                        3- Transferir valor
                        4- Sair
                        
                        Digite a opção desejada:
                        """);
                operações = leitura.nextInt();
            }

            // Receber valor
            else if (operações == 2) {
                System.out.println("Insira o valor desejado:");
                double valorRecebido = leitura.nextDouble();
                saldoInicial += valorRecebido;
                System.out.println("Você inseriu: " + valorRecebido);
                System.out.println("\nSaldo atual: " + saldoInicial);
                System.out.println(menu);
                operações = leitura.nextInt();
            }
            // Transferir Saldo
            else if (operações == 3) {
                System.out.println("Insira o valor a ser transferido:");
                double valorTransferido = leitura.nextDouble();

                // Inpedindo a transferencia maior que o saldo
                if (valorTransferido > saldoInicial){
                    System.out.println("\nImpossivel realizar a transferencia, insira um valor até: " + saldoInicial);
                } else{

                saldoInicial -= valorTransferido;
                System.out.println("\nVocê transferiu: " + valorTransferido);
                System.out.println("\nSaldo atual: " + saldoInicial);
                System.out.println(menu);
                operações = leitura.nextInt();
                }
            }

            // Se digitar a operação errado
            else {
                System.out.println("""
                        Perdão não pude compreender este valor
                        
                        Por favor insira um valor válido
                        """);
                System.out.println(menu);
                operações = leitura.nextInt();
            }
        }
    }
}