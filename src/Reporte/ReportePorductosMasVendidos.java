package Reporte;

import Item.Item;
import Formato.Formato;
import MetodoDeEnvio.Venta;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReportePorductosMasVendidos implements Reporte {
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private Map<String, Estadistica> estadisticas;

    public ReportePorductosMasVendidos(LocalDate fechaInicio, LocalDate fetchFin) {
        this.fechaInicio  = fechaInicio;
        this.fechaFin     = fetchFin;
        this.estadisticas = new HashMap<>();
    }

    @Override
    public void accept(Formato formato) {
        formato.visitar(this);
    }

    @Override
    public Reporte generarReporte(List<Venta> ventas) {
        ventas.stream()
                .filter(v -> v.ocurrioEntre(this.fechaInicio, this.fechaFin))
                .forEach(this::crearEstadisticas);
        return this;
    }

    private void crearEstadisticas(Venta venta) {
        venta.getItems().forEach(this::registrarItem);
    }

    private void registrarItem(Item item) {
        //calcula e inserta un valor para una clave específica
        Estadistica estadistica = estadisticas.computeIfAbsent(item.getNombre(), n -> new Estadistica());
        estadistica.acumular(item.getPrecioFinal());
    }

}
