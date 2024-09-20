import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Scanner scanner = new Scanner(System.in);
        boolean sair = false;


        String nomeCliente = cliente.getCliente();
        String tipoConta = cliente.getConta();
        double saldoConta = cliente.getSaldo();
        System.out.println("******************************************");
        System.out.println("       Bem vindo   ");
        System.out.println("Aqui está as suas informações ");
        System.out.println("Nome: " + nomeCliente);
        System.out.println("Tipo da Conta: " + tipoConta);
        System.out.println("Saldo Inicial: " + saldoConta);
        System.out.println("******************************************");
        System.out.println();

        System.out.println("       Operações     ");

        while (!sair){
            System.out.println("1- Consultar saldos ");
            System.out.println("2- Receber valor ");
            System.out.println("3- Transferir valor ");
            System.out.println("4- Sair ");
            System.out.println("      Digite a opção desejada:   ");
            System.out.println();


            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao){
                case 1:
                    System.out.println("Seu saldo atual é de "+ saldoConta);
                    break;



                    case 2:
                        System.out.println("Informe o valor a receber ");
                        double valorReceber = scanner.nextDouble();
                        saldoConta += valorReceber;
                        System.out.println("Saldo atualizado R$ "+ saldoConta);
                        scanner.nextLine();
                        break;

                case 3:
                    System.out.println("Informe o valor que deseja trasferir ");
                    double valorTransferir = scanner.nextDouble();
                   if (valorTransferir <= saldoConta){
                       saldoConta -= valorTransferir;
                   }else {
                       System.out.println("Não há saldo suficiente para fazer essa transferência.");
                   }
                    System.out.println("Saldo atualizado R$ "+saldoConta);
                    scanner.nextLine();

                    break;

                case 4:
                    sair = true;
                    System.out.println("Saindo.... ");
                    break;
                default:
                    System.out.println("Opção invalida tente novamente  ");

            }
        }
        scanner.close();
    }
}