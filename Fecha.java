
public class Fecha
{
    private int dia, mes, anyo;
    
    public Fecha(int dia, int mes, int anyo) {
        this.dia = dia;
        this.mes = mes;
        this.anyo = anyo;
    }
    public int dia() {
        return this.dia;
    }
    public int mes() {
        return this.mes;
    }
    public int anyo() {
        return this.anyo;
    }
    public int comparar(Fecha otra) {
        if (this.anyo < otra.anyo)
            return -1;
        if (this.anyo > otra.anyo)
            return 1;
        if (this.mes < otra.mes)
            return -1;
        if (this.mes > otra.mes)
            return 1;
        if (this.dia < otra.dia)
            return -1;
        if (this.dia > otra.dia)
            return 1;

        return 0;
    }

    public String toString() {
        String msj ="fecha: " + dia  + mes + anyo;
        return msj;
    }
}
