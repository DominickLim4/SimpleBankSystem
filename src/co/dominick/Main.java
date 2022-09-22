package co.dominick;
import java.util.Locale;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // Criar uma conta
        User dominick = new User();

        System.out.println("Qual seu nome? ");
        dominick.setName(scanner.nextLine());

        System.out.println("Qual o seu banco? ");
        String banco = scanner.nextLine();

        if(banco.equals("Banco do Brasil") || banco.equals("BB")) { dominick.setAgencia("001"); }
        else if (banco.equals("Nubank") || banco.equals("NU")) { dominick.setAgencia("002"); }
        else { dominick.setAgencia("000"); }

        System.out.println("Qual a sua idade? ");
        dominick.setIdade(scanner.nextInt());

        // Checar informações
        dominick.getInfo();
        System.out.println(" ");

        // Fazer deposito e retirada
        for (int i = 0; i < 5; i++) {
            System.out.println("\n1- Fazer depósito.\n2- Fazer retirada.\n3- Verificar informação.\n ");
            int resposta = scanner.nextInt();

            if(resposta == 1){
                System.out.println("Qual valor a ser adicionado? ");
                double valor =  scanner.nextDouble();
                dominick.setTotalValor(valor);
                System.out.println("\n" + dominick.getTotalValor() + " Foi adicionado com sucesso!");
                System.out.println("Valor total: $" + dominick.getTotalValor());
            }

            else if (resposta == 2) {
                System.out.println("\nEscolha valor para ser retirado. ");
                double retirada = scanner.nextDouble();

                // Verificar se a pessoa tem dinheiro para fazer retirada
                if (dominick.getTotalValor() < retirada){ System.out.println("Saldo insuficiente. "); }
                else {
                    double valorRetirado = dominick.getTotalValor() - retirada;
                    dominick.setTotalValor(valorRetirado);
                    System.out.println("\nValor " + retirada + " foi removido com sucesso.\n Saldo atual: $" + dominick.getTotalValor());
                }

            }
            else { dominick.getInfo(); }
        }

    }
}
