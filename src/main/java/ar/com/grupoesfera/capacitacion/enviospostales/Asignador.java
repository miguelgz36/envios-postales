package ar.com.grupoesfera.capacitacion.enviospostales;

public class Asignador {

    public void asignarTransporte(Envio envio) throws Exception {
        Double pesoTotal = envio.getPaquetes().stream()
                .map(paquete -> paquete.getPeso())
                .reduce((double) 0,(a, b) -> a + b );
        if(pesoTotal < 5){
            envio.setTransporte(Transporte.BICICLETA);
        }else if(pesoTotal < 50){
            envio.setTransporte(Transporte.AUTO);
        }else if(pesoTotal < 150){
            envio.setTransporte(Transporte.CAMIONETA);
        }else{
            throw new Exception("Debe ser envios con peso total menor a 150");
        }
    }
}
