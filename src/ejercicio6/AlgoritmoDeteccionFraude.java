package ejercicio6;

import java.util.ArrayList;
import java.util.Collection;

public class AlgoritmoDeteccionFraude {

    public static void main(String[] args) {
        Transacciones ts = GeneradorTransaccionesAleatorias.generarColeccionTransacciones();
    }
}

class DetectorTransaccionesFraudulentas{
    private Transacciones ts = GeneradorTransaccionesAleatorias.generarColeccionTransacciones();

    public DetectorTransaccionesFraudulentas() {
        this.ts = GeneradorTransaccionesAleatorias.generarColeccionTransacciones();
    }

    public void detectarFraude() {
        ArrayList<Transacciones> arTs = (ArrayList<Transacciones> this.ts);
        for (Transaccion t : this.ts) {
            if (t.getFraudu()) {
                t.marcarComoFraudulenta();
            }
        }
    }
}

class GeneradorTransaccionesAleatorias{
    public static Transacciones generarColeccionTransacciones() {
        Transacciones ts = new Transacciones();
        for (int i = 0; i < 10; i++) {
            boolean esFraudulenta = Math.random() < 0.5;
            ts.addTransaccion(esFraudulenta, i, (double) Math.random()*1000, "concepto" + i, i, 100+i);
        }
        return ts;
    }
}

class Transaccion {
    private boolean fraudu;
    private int id;
    private double importe;
    private String concepto;
    private int idOd;
    private int idBe;

    public Transaccion(boolean fraudu, int id, double importe, String concepto, int idOd, int idBe) {
        this.fraudu = fraudu;
        this.id = id;
        this.importe = importe;
        this.concepto = concepto;
        this.idOd = idOd;
        this.idBe = idBe;
    }

    public void marcarComoFraudulenta() {
        this.fraudu = true;
    }

    private boolean isFraudu() {
        return fraudu;
    }

    private void setFraudu(boolean fraudu) {
        this.fraudu = fraudu;
    }

    public boolean getFraudu() {
        return isFraudu();
    }

    private int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }

    private double getImporte() {
        return importe;
    }

    private void setImporte(double importe) {
        this.importe = importe;
    }

    private String getConcepto() {
        return concepto;
    }

    private void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    private int getIdOd() {
        return idOd;
    }

    private void setIdOd(int idOd) {
        this.idOd = idOd;
    }

    private int getIdBe() {
        return idBe;
    }

    private void setIdBe(int idBe) {
        this.idBe = idBe;
    }
}

class Transacciones {
    private ArrayList<Transaccion> transacciones;

    public Transacciones() {
        this.transacciones = new ArrayList<>();
    }

    public void addTransaccion(Transaccion t) {
        this.transacciones.add(t); //añade una transaccion ya hecha
    }

    public void addTransaccion(boolean fraudu, int id, double importe, String concepto, int idOd, int idBe){
        this.transacciones.add(new Transaccion( fraudu, id, importe, concepto, idOd, idBe)); //crea una nueva
    }

    public ArrayList<Transaccion> getTransacciones() {
        return transacciones;
    }
}