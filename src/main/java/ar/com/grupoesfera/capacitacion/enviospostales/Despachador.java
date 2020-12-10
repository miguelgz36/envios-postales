package ar.com.grupoesfera.capacitacion.enviospostales;

import java.util.ArrayList;
import java.util.List;

public class Despachador {

    private List<Envio> envios;
    private Calculadora calculadora;
    private Asignador asignador;

    public Despachador(Calculadora calculadora, Asignador asignador) {
        envios = new ArrayList<>();
        this.calculadora = calculadora;
        this.asignador = asignador;
    }

    public Despachador(){
        envios = new ArrayList<>();
    }

    public List<Envio> getEnvios() {
        return envios;
    }

    public void setEnvios(List<Envio> envios) {
        this.envios = envios;
    }

    public Calculadora getCalculadora() {
        return calculadora;
    }

    public void setCalculadora(Calculadora calculadora) {
        this.calculadora = calculadora;
    }

    public Asignador getAsignador() {
        return asignador;
    }

    public void setAsignador(Asignador asignador) {
        this.asignador = asignador;
    }
}
