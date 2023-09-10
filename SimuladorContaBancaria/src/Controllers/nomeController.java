package Controllers;
import Exceptions.*;
import Model.infoModel;

public class nomeController {
    static Model.infoModel data = new infoModel();
    
    public static void createNome (String nome) {
        try {
            validacaoNome(nome);
            data.setNome(nome);
        } catch (FormatoNomeException e) {
            e.printStackTrace();
        }
    }

    public static String showNome () {
        return data.getNome();
    }

private static void validacaoNome(String nome) throws FormatoNomeException {
        if (nome.length() <= 2) {
            throw new FormatoNomeException("Insira um nome válido");
        }
        if (!nome.matches("^[a-zA-Z]*$")) {
            throw new FormatoNomeException("O nome deve conter apenas letras");
        }
    }
}
