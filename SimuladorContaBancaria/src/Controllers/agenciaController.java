package Controllers;

import Model.infoModel;
import Exceptions.*;

public class agenciaController {
    static Model.infoModel data = new infoModel();

    public static void createAgencia (int agencia) {
        try {
            validacaoAgencia(agencia);
            data.setAgencia(agencia);
        } catch (FormatoAgenciaException e) {
            e.printStackTrace();
        }
    }

    private static void validacaoAgencia(int agencia) throws FormatoAgenciaException {
        if (agencia<1000 && agencia>9999) {
            throw new FormatoAgenciaException("Número de agência inválido");
        }
    }

    public static int showAgencia () {
        return data.getAgencia();
    }
}
