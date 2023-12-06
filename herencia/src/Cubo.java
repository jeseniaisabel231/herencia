public class Cubo extends Poligono {
    public Cubo(String nombre, int lados) {
        super(nombre, lados);
    }
    public void area(){
        System.out.println("El area de un cubo es: " + (this.lados*this.lados)*6);
    }

    public void perimetro(){
        System.out.println("El perimetro de un cubo es: " + this.lados*12);
    }
}
