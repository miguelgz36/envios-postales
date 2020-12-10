package ar.com.grupoesfera.capacitacion.enviospostales;

public class Calculadora {

    public int calcularCostos(int numeroPaquetes){
        if(numeroPaquetes<5){
            return 50;
        }
        if(numeroPaquetes>=5 && numeroPaquetes<=10){
            return  80;
        }
        if(numeroPaquetes>10){
            return  80 +(15)*(numeroPaquetes-10);
        }
        return 0;
    }
}
