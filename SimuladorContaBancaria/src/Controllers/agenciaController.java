package Controllers;

import Model.infoModel;

public class agenciaController {
    static Model.infoModel data = new infoModel();

    public static void createAgencia (String agencia) {

    }

    public static int showAgencia () {
        return data.getAgencia();
    }
}
