package Pedido.EstadoPedido;

import CriterioDeBusqueda.Item;
import Pedido.Pedido;

public class Borrador extends EstadoPedido {

    @Override
    public void cargarItem(Item item, Pedido pedido){
        pedido.addItem(item);
    }

    @Override
    public void quitarItem(Item item, Pedido pedido){
        pedido.deleteItem(item);
    }

    @Override
    public void cancelarPedido(Pedido pedido){
        pedido.setEstado(new Cancelado());
    }

    @Override
    public void confirmarPedido(Pedido pedido){
        pedido.setEstado(new Confirmado());
        pedido.decrementarStock();
    }


}
