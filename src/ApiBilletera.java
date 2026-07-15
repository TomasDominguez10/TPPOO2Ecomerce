import Pedido.Pedido;

public interface ApiBilletera {
    public interface APIBilletera {

        void validarSaldo() throws MedioDePagoException;
        void bloquearSaldo();
        void acreditar();
        void notificar(Pedido pedido);
    }
}
