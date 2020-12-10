package ar.com.grupoesfera.capacitacion.enviospostales;

import java.util.List;

public class Envio {

    private List<Paquete> paquetes;
    private Double costo;
    private String direccion;
    private Transporte transporte;

    public Envio(List<Paquete> paquetes, String direccion) {
        this.paquetes = paquetes;
        this.direccion = direccion;
    }

    public List<Paquete> getPaquetes() {
        return paquetes;
    }

    public void setPaquetes(List<Paquete> paquetes) {
        this.paquetes = paquetes;
    }

    public Double getCosto() {
        return costo;
    }

    public void setCosto(Double costo) {
        this.costo = costo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Transporte getTransporte() {
        return transporte;
    }

    public void setTransporte(Transporte transporte) {
        this.transporte = transporte;
    }
}
