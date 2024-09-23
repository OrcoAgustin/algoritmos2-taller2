package aed;

public class Agenda {

    private ArregloRedimensionableDeRecordatorios recordatorios;
    private Fecha fecha;

    public Agenda(Fecha fechaActual) {
        this.recordatorios = new ArregloRedimensionableDeRecordatorios();
        this.fecha = fechaActual;
    }

    public void agregarRecordatorio(Recordatorio recordatorio) {
        recordatorios.agregarAtras(recordatorio);
    }

    @Override
    public String toString() {
        String msj = fechaActual() + "\n=====\n";
        for (int j = 0; j < this.recordatorios.longitud(); j++) {
            if (fechaActual().equals(this.recordatorios.obtener(j).fecha())) {
                msj += this.recordatorios.obtener(j).toString() + "\n";
            }
        }
        return msj;
    }

    public void incrementarDia() {
        this.fecha.incrementarDia();
    }

    public Fecha fechaActual() {
        Fecha fechaPedida = new Fecha(this.fecha);
        return fechaPedida;
    }

}
