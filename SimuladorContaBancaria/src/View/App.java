package View;
import java.util.Scanner;

import Controllers.*;

public class App {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        nomeController.createNome(input.nextLine());
        agenciaController.createAgencia(input.nextInt());
        input.nextLine(); //Limpeza de buffer
        numeroController.createNumero(input.nextLine());
        saldoController.createSaldo(input.nextDouble());
        input.close();
    }
}