package View;
import java.util.Scanner;

import Controllers.*;

public class App {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        nomeController.createNome(input.nextLine());
        
        input.close();
    }
}