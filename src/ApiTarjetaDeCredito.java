public interface ApiTarjetaDeCredito {


        void validarTarjeta() throws MedioDePagoException;
        void preautorizar();
        void transferir();

}
