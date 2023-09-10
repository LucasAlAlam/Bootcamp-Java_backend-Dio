package View;
import java.util.Scanner;

import Controllers.*;

public class App {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        nomeController.createNome(input.nextLine());
        System.out.println("Digite sua agência:");
        agenciaController.createAgencia(input.nextInt());
        input.nextLine(); //Limpeza de buffer
        System.out.println("Digite o número da sua conta:");
        numeroController.createNumero(input.nextLine());
        System.out.println("Digite seu saldo:");
        saldoController.createSaldo(input.nextDouble());

        System.out.println("Olá, "+nomeController.showNome()+". Sua conta de número "+numeroController.showNumero()+" na agência "+agenciaController.showAgencia()+" tem um saldo equivalente a R$"+saldoController.showSaldo()+".");
        input.close();
    }
}