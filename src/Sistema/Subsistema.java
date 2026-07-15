package Sistema;

import Pedido.Pedido;

public interface Subsistema {

    void cambioAEntregado(Pedido pedido);

    void cambioAEnviado(Pedido pedido);

    void cambioACancelado(Pedido pedido);

    void cambioAConfirmado(Pedido pedido);
}