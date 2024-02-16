package ejercicio7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class GeneradorCitasInspiradoras {

    public static void main(String[] args) {
        List<String> citas = new ArrayList<>(Arrays.asList(
           "La vida es una aventura, atrévete - Teresa de Calcuta",
           " Si te caíste ayer, levántate hoy - H.G. Wells",
           "No cuentes los días, haz que los días cuenten - Muhammad Ali",
           "Transforma tus heridas en sabiduría - Oprah Winfrey",
           "Si puedes soñarlo, puedes hacerlo - Walt Disney"
        ));

        while (true) {
            generarCita(citas);
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
