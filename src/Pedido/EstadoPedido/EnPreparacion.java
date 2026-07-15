package Pedido.EstadoPedido;

import Pedido.Pedido;

public class EnPreparacion   extends EstadoPedido {

    @Override
    public void cancelarPedido(Pedido pedido){
        pedido.setEstado(new Cancelado());
        pedido.reponerStock();
        pedido.reembolsar(new NotaDeCredito(pedido.costoTotal(), pedido));
    }

    @Override
    public void enviarPedido(Pedido pedido){
        pedido.setEstado(new Enviado());
    }

}
