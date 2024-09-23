package aed;

class ArregloRedimensionableDeRecordatorios {

    private Recordatorio[] array;
    private int largo;

    public ArregloRedimensionableDeRecordatorios() {
        this.largo = 0;
        this.array = new Recordatorio[0];
    }

    public int longitud() {
        return this.largo;
    }

    public void agregarAtras(Recordatorio i) {
        this.largo = this.largo + 1;
        Recordatorio[] nuevoArray = new Recordatorio[this.largo];
        //se puede usar system copy array?
        for (int j = 0; j < this.largo; j++) {
            nuevoArray[j] = this.array[j];
        }
        nuevoArray[this.largo - 1] = i;
        this.array = nuevoArray;
    }

    public Recordatorio obtener(int i) {
        return this.array[i];
    }

    public void quitarAtras() {
        this.largo = this.largo - 1;
        Recordatorio[] nuevoArray = new Recordatorio[this.largo];
        for (int j = 0; j < this.largo; j++) {
            nuevoArray[j] = this.array[j];
        }
        this.array = nuevoArray;
    }

    public void modificarPosicion(int indice, Recordatorio valor) {
        this.array[indice] = valor;
    }

    public ArregloRedimensionableDeRecordatorios(ArregloRedimensionableDeRecordatorios vector) {
        this.largo = vector.largo;
        this.array = new Recordatorio[vector.largo];
        for (int n = 0; n < vector.largo; n++) {
            this.array[n] = vector.obtener(n);
        }
        this.largo = vector.longitud();
    }

    public ArregloRedimensionableDeRecordatorios copiar() {
        ArregloRedimensionableDeRecordatorios arrayNuevo = new ArregloRedimensionableDeRecordatorios();
        for (int j = 0; j < this.largo; j++) {
            arrayNuevo.agregarAtras(this.array[j]);
        }
        return arrayNuevo;
    }
}
