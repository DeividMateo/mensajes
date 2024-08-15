public class NotificacionFactory {
 

   public static void main(String []args ) throws NoSuchFieldException{
        NotificacionFactory notificacionFactory = new NotificacionFactory();
        Notificacion notificacion = notificacionFactory.obtenerNotificacion(TipoMensaje.MENSAJETEXTO);
        notificacion.crearNotificacion();
    
   }

    public Notificacion obtenerNotificacion(TipoMensaje tipoMensaje){

        return switch (tipoMensaje) {

        case MENSAJETEXTO -> new MensajeTexto();
        
        case EMAIL -> new Email();

    };

   
}

}