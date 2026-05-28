package manager;

import java.util.ArrayList;
import model.Alarm;

public class AlarmManager {

    private ArrayList<Alarm> alarmas;

    public AlarmManager() {
        alarmas = new ArrayList<>();
    }

    public void crearAlarma(Alarm alarma) {
        alarmas.add(alarma);
    }

    public void eliminarAlarma(int id) {

        for (int i = 0; i < alarmas.size(); i++) {

            if (alarmas.get(i).getId() == id) {
                alarmas.remove(i);
                break;
            }
        }
    }

    public void mostrarAlarmas() {

        for (Alarm alarma : alarmas) {
            alarma.mostrarInformacion();
            System.out.println("------------------");
        }
    }

    public void mostrarAlarmasActivas() {

        for (Alarm alarma : alarmas) {

            if (alarma.isActiva()) {
                alarma.mostrarInformacion();
                System.out.println("------------------");
            }
        }
    }

    public void detectarConflictos() {

        for (int i = 0; i < alarmas.size(); i++) {

            for (int j = i + 1; j < alarmas.size(); j++) {

                Alarm alarma1 = alarmas.get(i);
                Alarm alarma2 = alarmas.get(j);

                if (alarma1.getHora() == alarma2.getHora()
                        && alarma1.getMinuto() == alarma2.getMinuto()) {

                    System.out.println("Conflicto detectado entre:");
                    System.out.println("- " + alarma1.getEtiqueta());
                    System.out.println("- " + alarma2.getEtiqueta());
                }
            }
        }
    }
}