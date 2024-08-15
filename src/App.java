public class App { 

    public static void main(String[] args) throws NoSuchFieldException {
        NotificacionFactory notificacionFactory = new NotificacionFactory();
        Notificacion notificacion = notificacionFactory.obtenerNotificacion(TipoMensaje.MENSAJETEXTO);
        notificacion.crearNotificacion();
        
    }

 
} 