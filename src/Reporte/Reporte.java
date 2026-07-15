package Reporte;

import Formato.Formato;
import MetodoDeEnvio.Venta;

import java.util.List;

public interface Reporte  {
    Reporte generarReporte(List<Venta> ventas);
    void accept(Formato formato);

}
