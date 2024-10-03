package aed;

public class Horario {

    private int minutos;
    private int hora;

    public Horario(int hora, int minutos) {
        this.minutos = minutos;
        this.hora = hora;
    }

    public int hora() {
        return this.hora;
    }

    public int minutos() {
        return this.minutos;
    }

    @Override
    public String toString() {
        return String.valueOf(hora) + ":" + String.valueOf(minutos);
    }

    @Override
    public boolean equals(Object otro) {
        if (otro==null || this.getClass() != otro.getClass() ) {
            return false;
        } else {
            Horario otroHorario = (Horario) otro;
            return otroHorario.hora == this.hora && otroHorario.minutos == this.minutos;
        }
    }

}
