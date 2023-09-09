import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String nome = new String();
        String agencia = new String();
        int numero;
        double saldo;
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Digite seu nome: ");
            nome = input.nextLine();
            System.out.println("Digite a agência: ");
            agencia = input.nextLine();
            System.out.println("Digite o número da conta: ");
            numero = input.nextInt();
            System.out.println("Digite seu saldo: ");
            saldo = input.nextDouble();
            input.close();

            System.out.println("Olá, " + nome + ". Seu número de conta é " + numero + " e sua agência é " + agencia
                    + ". Seu saldo nessa conta é " + saldo);
        } catch (Exception e) {
            System.out.println(
                    e);
        }
    }
}
