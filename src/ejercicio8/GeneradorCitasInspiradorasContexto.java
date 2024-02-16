package ejercicio8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

public class GeneradorCitasInspiradorasContexto {

    public static void main(String[] args) {
        List<String> citasMotivadoras = new ArrayList<>(Arrays.asList(
           "La vida es una aventura, atrévete - Teresa de Calcuta",
           "Si te caíste ayer, levántate hoy - H.G. Wells",
           "No cuentes los días, haz que los días cuenten - Muhammad Ali",
           "Transforma tus heridas en sabiduría - Oprah Winfrey",
           "Si puedes soñarlo, puedes hacerlo - Walt Disney"
        ));

        List<String> citasAnimadas = new ArrayList<>(Arrays.asList(
           "La alegría no está en las cosas, está en nosotros - Richard Wagner",
           "La vida es corta, sonríe mientras aún tienes dientes - Proverbio desconocido",
           "La felicidad es una mariposa que, cuando se persigue, siempre está más allá de tu alcance - Nathaniel Hawthorne"
        ));

        while (true) {
            System.out.println("Selecciona el estado de ánimo o contexto para la cita (motivadora/animada): ");
            Scanner scanner = new Scanner(System.in);
            String estadoAnimo = scanner.nextLine().toLowerCase();

            switch (estadoAnimo) {
                case "motivadora":
                    generarCita(citasMotivadoras);
                    break;
                case "animada":
                    generarCita(citasAnimadas);
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
            esperarSolicitudNuevaCita();
        }
    }

    private static void generarCita(List<String> citas) {
        Random random = new Random();
        int indiceCita = random.nextInt(citas.size());
        String cita = citas.get(indiceCita);
        System.out.println("Cita inspiradora: " + cita);
    }

    private static void esperarSolicitudNuevaCita() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Quieres otra cita? (si/no): ");
        String respuesta = scanner.nextLine().toUpperCase();
        if (!respuesta.equals("si")) {
            System.out.println("¡Hasta luego!");
            System.exit(0);
        }
    }
}
