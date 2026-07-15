package Pedido.EstadoPedido;

import Pedido.EstadoPedido.EstadoPedido;
import Pedido.Pedido;

public class Cancelado extends EstadoPedido {

    public Cancelado() {
        super();
    }

    @Override
    public void notificar(Pedido pedido, Subsistema subsistema) {
        subsistema.cambioACancelado(pedido);
    }
}