public class Rectangulo extends Irregulares{
    public Rectangulo(String nombre, int lados) {
        super(nombre, lados);
    }
    public void perimetroRec(){
        System.out.println("El perimetro es: " + (this.getAltura()*2)+(2*this.getBase()));
    }
    public void areaRec(){
        System.out.println("El area es: " + this.getBase()*this.getArea());
    }
}
