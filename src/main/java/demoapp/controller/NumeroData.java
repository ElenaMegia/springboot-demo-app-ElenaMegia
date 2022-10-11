package demoapp.controller;
import javax.validation.constraints.Digits;

public class NumeroData {
    @Digits (message = "Debe ser un numero.", integer = 100000, fraction = 10000)
     Integer numero;

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }
}
