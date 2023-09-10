import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = input.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = input.nextInt();
        input.close();

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException exception) {
            exception.printStackTrace();
        }

    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        }
        int contagem = parametroDois - parametroUm;
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}