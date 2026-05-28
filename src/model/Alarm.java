package model;

public class Alarm {

    private int id;
    private String etiqueta;
    private int hora;
    private int minuto;
    private boolean activa;
    private int volumen;

    public Alarm(int id, String etiqueta, int hora, int minuto, int volumen) {
        this.id = id;
        this.etiqueta = etiqueta;
        this.hora = hora;
        this.minuto = minuto;
        this.volumen = volumen;
        this.activa = true;
    }

    public void activar() {
        activa = true;
    }

    public void desactivar() {
        activa = false;
    }

    public void posponer() {
        minuto += 5;

        if (minuto >= 60) {
            minuto -= 60;
            hora++;

            if (hora >= 24) {
                hora = 0;
            }
        }
    }

    public void detener() {
        System.out.println("Alarma detenida.");
    }

    public void mostrarInformacion() {
        System.out.println("Alarma: " + etiqueta);
        System.out.println("Hora: " + hora + ":" + minuto);
        System.out.println("Volumen: " + volumen);
        System.out.println("Activa: " + activa);
    }

    public int getId() {
        return id;
    }

    public String getEtiqueta() {
        return etiqueta;
    }

    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public boolean isActiva() {
        return activa;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }
}
```
