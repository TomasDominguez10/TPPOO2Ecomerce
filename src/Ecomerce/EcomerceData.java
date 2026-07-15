package Ecomerce;

import MetodoDeEnvio.Venta;

import java.util.ArrayList;
import java.util.List;

public class EcomerceData   {
    private final List<Venta> ventas;
    private final List<NotaDeCredito> notasDeCredito;

    public EcommerceData(){
        this.notasDeCredito = new List<NotaDeCredito>();
        this.ventas = new ArrayList<>();
    }

    public void agregarNota(NotaDeCredito notaDeCredito){
        this.notasDeCredito.add(notaDeCredito);
    }

    public void agregarVenta(Venta venta) { this.ventas.add(venta);}

}
