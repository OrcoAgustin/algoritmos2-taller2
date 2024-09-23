package aed;

public class Fecha {
    private int dia;
    private int mes;

    public Fecha(int dia, int mes) {
        this.dia = dia;
        this.mes = mes;
    }

    public Fecha(Fecha fecha) {
        this.dia = fecha.dia;
        this.mes = fecha.mes;
    }

    public Integer dia() {
        return this.dia;
    }

    public Integer mes() {
        return this.mes;
    }

    @Override
    public String toString() {
        return String.valueOf(this.dia) + "/" + String.valueOf(this.mes);
    }

    @Override
    public boolean equals(Object otra) {
        Fecha otraFecha = Fecha (otra);
        if(get.class(fecha)==get.class(otraFecha)){
            return this.dia==otraFecha.dia && this.mes==otraFecha.mes;
        } else{
            return false;
        }
    }

    public void incrementarDia() {
        if(this.dia==diasEnMes(this.mes)){
            if(this.mes==12){
                this.mes=1;
            }
            this.dia=1
        } else{
            this.dia++;
        }
    }

    private int diasEnMes(int mes) {
        int dias[] = {
                // ene, feb, mar, abr, may, jun
                31, 28, 31, 30, 31, 30,
                // jul, ago, sep, oct, nov, dic
                31, 31, 30, 31, 30, 31
        };
        return dias[mes - 1];
    }

}
