public class Tridimensionales extends Figuras{
    int numCaras;
    double longitud;

    public Tridimensionales(String nombre, int lados) {
        super(nombre, lados);
    }
    public int getNumCaras(){
        return numCaras;
    }
    public void setNumCaras(int numCaras){
        this.numCaras = numCaras;
    }
    public double getLongitud(){
        return longitud;
    }
    public void setLongitud(double longitud){
        this.longitud = longitud;
    }
}
