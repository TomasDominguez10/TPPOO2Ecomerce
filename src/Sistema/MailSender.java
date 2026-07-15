package Sistema;

public interface MailSender {
    void enviarMail(String direccionDestino, String titulo, String mensaje, String adjunto);
}
