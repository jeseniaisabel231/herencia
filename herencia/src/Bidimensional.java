public class Bidimensional extends Figuras{
    //atributos
    float area;
    double lado;
    float perimetro;

    public Bidimensional(String nombre, int lados) {
        super(nombre, lados);
    }
    public float getArea(){
        return area;
    }
    public void setArea(){
        this.area = area;
    }
    public double getLado(){
        return lado;
    }
    public void setLado(double lado){
        this.lado = lado;
    }
    public float getPerimetro(){
        return perimetro;
    }
    public void setPerimetro(float perimetro){
        this.perimetro =perimetro;
    }
}
