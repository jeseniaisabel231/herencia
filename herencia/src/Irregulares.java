public class Irregulares extends Bidimensional{
    double base; //float
    double altura;
    public Irregulares(String nombre, int lados) {
        super(nombre, lados);
    }
    public double getBase(){
        return base;
    }
    public void setBase(double base){
        this.base = base;
    }
    public double getAltura(){
        return altura;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }
}
