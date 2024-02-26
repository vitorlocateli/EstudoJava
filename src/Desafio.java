import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        String nome = "Jaqueline";
        String tipoDeConta = "Corrente";
        double saldoInicial = 2500.00;
        String mensagem ="""
                ***************************
                Dados iniciais do cliente:
                
                Nome: %s
                Tipo de conta: %s
                Saldo inicial: R$%.2f
                ***************************
                """.formatted(nome,tipoDeConta, saldoInicial );
        String menu = """
                Operações
                
                1- Consultar saldos
                2- Transferir valor
                3- Receber valor
                4- Sair
                
                Digite a opção desejada:
                """;
        System.out.println(mensagem);
        int consulta = 0;

        while ( consulta != 4){
            System.out.println(menu);
             consulta = leitura.nextInt();

             if(consulta == 1){
                 System.out.println("O saldo atualizado é " + saldoInicial);
             } else if (consulta == 2) {
                 System.out.println("Qual o valor que deseja transferir");
                 double valor = leitura.nextDouble();
                 if (valor > saldoInicial) {
                     System.out.println("Não há saldo para realzar a transferência");
                 } else {
                     saldoInicial -= valor;
                     System.out.println("Novo saldo: " + saldoInicial);
                 }
             }else if (consulta == 3){
                 System.out.println("Valor recebido: ");
                 double valor = leitura.nextDouble();
                 saldoInicial += valor;
                 System.out.println("Novo saldo: " + saldoInicial);
             } else if (consulta != 4) {
                 System.out.println("Opção inválida");
             }


        }

    }
}
