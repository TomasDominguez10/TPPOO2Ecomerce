import Pedido.Pedido;

public class TransferenciaBancaria  extends extends MedioDePago {

    private String cbu, alias;
    private APITransferencia api;
    private ComprobanteCBU comprobanteCBU;

    public TransferenciaBancaria(String cbu, String alias, APiTransferencia api){
        this.cbu = cbu;
        this.alias = alias;
        this.api = api;
    }

    @Override
    public void validarDatos() throws MedioDePagoException {
        this.api.validarCuenta();
    }

    @Override
    public void reservarFondos() {
    }

    @Override
    public void ejecutarTransaccion() {
        this.api.transferir();
    }

    @Override
    public void notificarResultado(Pedido pedido) {
        super.notificarResultado(pedido);
        this.comprobanteCBU = new ComprobanteCBU(this.getCodigoTransaccion(), this.cbu);
    }
}{
}
