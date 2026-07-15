package MetodoDeEnvio;

import CriterioDeBusqueda.Item;

import java.time.LocalDate;
import java.util.List;

public class Venta {
    private final LocalDate fecha;
    private List<Item> items;

    public Venta(Pedido pedido) {
        this.fecha = pedido.getFecha();
        this.items = pedido.getItems();
    }

    public boolean ocurrioEntre(LocalDate fechaInicio, LocalDate fechaFin) {
        return !this.getFecha().isBefore(fechaInicio) && !this.getFecha().isAfter(fechaFin);
    }

}
