import java.util.Locale;
import java.util.Scanner;

public class contaTerminal {
    public static void main(String[] args) {
        // Projeto terminal em java
        Scanner leitura = new Scanner(System.in);
        leitura.useLocale(Locale.US);

        System.out.print("Por favor insira sua Agência\n");
        String agencia = leitura.nextLine();

        System.out.println("\nPor favor insira o número da sua Conta");
        int numero = leitura.nextInt();
        leitura.nextLine();

        System.out.println("\nPor favor insira seu Nome");
        String nomeCliente = leitura.nextLine();

        System.out.println("\nPor favor insira seu Saldo");
        double saldo = leitura.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar um conta em nosso banco, sua agência é "
                + agencia + " conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        leitura.close();

    }
}
