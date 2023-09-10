package Controllers;

import Exceptions.ValorSaldoException;
import Model.infoModel;

public class saldoController {
    static Model.infoModel data = new infoModel();

    public static void createSaldo (double saldo) {
        try {
            validacaoSaldo(saldo);
            data.setSaldo(saldo);
        } catch (ValorSaldoException e) {
            e.printStackTrace();
        }
    }

    public static double showNumero () {
        return data.getSaldo();
    }

    private static void validacaoSaldo(double saldo) throws ValorSaldoException {
        if (saldo<0) {
            throw new ValorSaldoException ("valor inválido para o saldo");
        }
    }
}
