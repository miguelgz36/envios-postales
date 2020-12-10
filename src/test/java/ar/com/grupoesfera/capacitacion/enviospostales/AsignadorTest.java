package ar.com.grupoesfera.capacitacion.enviospostales;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;


public class AsignadorTest {

    private Asignador asignador;

    @Before
    public void init(){
        asignador = new Asignador();
    }

    @Test
    public void dadoUnEnvioConUnPesoTotalDe3KGDebeAsignarleBicicleta(){
        Envio envio = new Envio(new ArrayList<>(),"");
        Paquete paquete = Mockito.mock(Paquete.class);
        Mockito.when(paquete.getPeso()).thenReturn(3.0);
        envio.getPaquetes().add(paquete);

        try {
            asignador.asignarTransporte(envio);
        } catch (Exception e) {
            e.printStackTrace();
        }

        Assert.assertEquals(Transporte.BICICLETA, envio.getTransporte());
    }

}
