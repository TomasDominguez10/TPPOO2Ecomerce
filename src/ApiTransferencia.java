public interface ApiTransferencia {

    void validarCuenta() throws MedioDePagoException;
    void transferir();

}
