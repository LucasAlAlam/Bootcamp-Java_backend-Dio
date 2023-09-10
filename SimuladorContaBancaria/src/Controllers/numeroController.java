package Controllers;
import Exceptions.*;
import Model.infoModel;

public class numeroController {
    static Model.infoModel data = new infoModel();

    public static void createNumero (String numero) {
        try {
            validacaoNumero(numero);
            data.setNumero(numero);
        } catch (FormatoNumeroException e) {
            e.printStackTrace();
        }
    }

    public static String showNumero () {
        return data.getNumero();
    }

    private static void validacaoNumero(String numero) throws FormatoNumeroException{
        System.out.println(numero);
        if (numero.length() != 10 ) {
            throw new FormatoNumeroException("Confira se algum número não está faltando");
        }

        if (!numero.matches("\\d{8}-\\d")) {
            throw new FormatoNumeroException("Número de conta inválido");
        }
    }
}
