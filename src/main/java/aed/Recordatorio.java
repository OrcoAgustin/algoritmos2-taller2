package aed;

public class Recordatorio {
    private String mensaje;
    private Horario horario;
    private Fecha fecha;

    public Recordatorio(String mensaje, Fecha fecha, Horario horario) {
        this.mensaje = mensaje;
        this.fecha = new Fecha(fecha);
        this.horario = horario;
    }

    public Horario horario() {
        return this.horario;
    }

    public Fecha fecha() {
        return this.fecha;
    }

    public String mensaje() {
        return this.mensaje;
    }

    @Override
    public String toString() {
    
        return this.mensaje +" @ " + this.fecha + " " + this.horario;
    }

    @Override
    public boolean equals(Object otro) {
        if(this.getclass()== otro.getClass()){
            Recordatorio otroRecordatorio = new (Recordatorio) otro;
            return this.mensaje.equals(otroRecordatorio.mensaje()) && this.fecha.equals(otroRecordatorio.fecha()) && this.horario.equals(otroRecordatorio.horario())
        }else{
            return false;
        }
    }

}
