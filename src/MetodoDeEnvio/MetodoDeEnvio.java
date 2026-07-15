package MetodoDeEnvio;

public interface MetodoDeEnvio {
    public double costoDeEnvio(Pedido pedido);
    public int estimacionDeDias(Pedido pedido);

}
