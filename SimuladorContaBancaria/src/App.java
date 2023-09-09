import java.util.Scanner;

class FormatoNomeException extends Exception {
    public FormatoNomeException(String msg) {
        super(msg);
    }
}

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome = new String();
        int agencia;
        int numero;
        double saldo;

        System.out.println("Digite seu nome: ");
        try {
            nome = input.nextLine();
            validacaoNome(nome);
        } catch (FormatoNomeException e) {
                e.printStackTrace();
        }

        System.out.println("Digite a agência: ");
        agencia = input.nextInt();
        System.out.println("Digite o número da conta: ");
        numero = input.nextInt();
        System.out.println("Digite seu saldo: ");
        saldo = input.nextDouble();
        input.close();

        System.out.println("Olá, " + nome + ". Seu número de conta é " + numero + " e sua agência é " + agencia
                + ". Seu saldo nessa conta é " + saldo);
    }

    static void validacaoNome(String nome) throws FormatoNomeException {
    System.out.println(nome.length());
        if (nome.length() <= 2) {
            throw new FormatoNomeException("Insira um nome válido");
        }
        if (!nome.matches("^[a-zA-Z]*$")) {
            throw new FormatoNomeException("O nome deve conter apenas letras");
        }
    }
}
