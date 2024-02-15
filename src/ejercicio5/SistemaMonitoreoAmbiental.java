package ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class SistemaMonitoreoAmbiental {

    class DispositivoIoT {
        String nombre;
        double temperatura;
        double humedad;
        int calidadAire;

        public DispositivoIoT(String nombre, double temperatura, double humedad, int calidadAire) {
            this.nombre = nombre;
            this.temperatura = temperatura;
            this.humedad = humedad;
            this.calidadAire = calidadAire;
        }
    }

    //Función para recuperar datos de los dispositivos IoT
    public static List<DispositivoIoT> recolectarDatos(List<DispositivoIoT> dispositivos) {
        //Se crean datos ficticios para los dispositivos
        List<DispositivoIoT> datos = new ArrayList<>();
        for (DispositivoIoT dispositivo : dispositivos) {
            //Simulación de datos aleatorios para temperatura, humedad y calidadAire
            dispositivo.temperatura = Math.random() * 30 + 10;
            dispositivo.humedad = Math.random() * 50 + 30;
            dispositivo.calidadAire = (int) (Math.random() * 100);
            datos.add(dispositivo);
        }
        return datos;
    }

    //Función para mostrar la interfaz del usuario con los datos recolectados
    public static void mostrarInterfazUsuario(List<DispositivoIoT> datos) {
        //Ejemplo imprimiendo la información en la consola
        for (DispositivoIoT dato : datos) {
            System.out.println("Dispositivo: " + dato.nombre);
            System.out.println("Temperatura: " + dato.temperatura + "ºC");
            System.out.println("Humedad: " + dato.humedad + "%");
            System.out.println("Calidad del aire: " + dato.calidadAire);
        }
    }

    //Función principal para monitorear el ambiente
    public static void monitorearAmbiente(List<DispositivoIoT> dispositivos) {
        List<DispositivoIoT> datos = recolectarDatos(dispositivos);
        mostrarInterfazUsuario(datos);
    }

    //Función para obtener dispositivos IoT
    public List<DispositivoIoT> obtenerDispositivosIoT() {
        List<DispositivoIoT> dispositivos = new ArrayList<>();
        dispositivos.add(new DispositivoIoT("Sensor1", 0, 0, 0));
        dispositivos.add(new DispositivoIoT("Sensor2", 0, 0, 0));
        dispositivos.add(new DispositivoIoT("Sensor3", 0, 0, 0));
        dispositivos.add(new DispositivoIoT("Sensor4", 0, 0, 0));

        return dispositivos;
    }

    public void main(String[] args) {
        List<DispositivoIoT> dispositivos = obtenerDispositivosIoT();
        monitorearAmbiente(dispositivos);
    }
}
