package Pedido.EstadoPedido;

import Pedido.Pedido;
import Sistema.Subsistema;

public class Entregado  extends EstadoPedido{
    public Entregado(){
        super();
    }

    @Override
    public void notificar(Pedido pedido, Subsistema subsistema) {
        subsistema.cambioAEntregado(pedido);
    }
}
