import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

public class AsistenteVirtual {

    private static List<Recordatorio> listaRecordatorios = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            interactuarConUsuario();
        }
    }

    public static void interactuarConUsuario() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Usuario: ");
        String solicitud = scanner.nextLine();
        String respuesta = procesarSolicitud(solicitud);
        System.out.println("Asistente: " + respuesta);
    }

    public static String procesarSolicitud(String solicitud) {
        //Ejemplo para pedir al asistente que establezca un recordatorio
        if (solicitud.contains("hola")) {
            return "¡Hola! ¿En qué puedo ayudarte?";
        } else if (solicitud.contains("recordatorio")) {
            return establecerRecordatorio(solicitud);
        } else {
            return "Lo siento, no entendí tu solicitud. ¿Puedes ser más específico?";
        }
    }

    public static String establecerRecordatorio(String solicitud) {
        String[] partes = solicitud.split(" ");

        if (partes.length >= 4 && partes[1].equalsIgnoreCase("a") && partes[3].equalsIgnoreCase("comprar")) {
            String hora = partes[2];
            String tarea = solicitud.substring(solicitud.indexOf(partes[3]));

            //Obtener la hora y minutos del recordatorio
            String [] horaMinutos = hora.split(":");
            int horas = Integer.parseInt(horaMinutos[0]);
            int minutos = Integer.parseInt(horaMinutos[1]);

            //Crear objeto Recordatorio
            Calendar calendar = Calendar.getInstance();
            calendar.set(Calendar.HOUR_OF_DAY, horas);
            calendar.set(Calendar.MINUTE, minutos);

            Recordatorio recordatorio = new Recordatorio(calendar, tarea);

            //Agregar recordatorio a la lista

            listaRecordatorios.add(recordatorio);

            //Devolvemos mensaje de confirmación
            return "Recordatorio establecido: " + tarea + " a las " + hora;
        } else {
            return "Formato de recordatorio incorrecto. Por favor, utiliza: 'recordatorio a las 00:00 [tarea]";
        }
    }

    //Clase para representar un recordatorio
    static class Recordatorio {
        private Calendar hora;
        private String tarea;

        public Recordatorio(Calendar hora, String tarea) {
            this.hora = hora;
            this.tarea = tarea;
        }

        public Calendar getHora() {
            return hora;
        }

        public String getTarea() {
            return tarea;
        }
    }
}
