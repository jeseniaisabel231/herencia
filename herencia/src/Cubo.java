public class Cubo extends Tridimensionales {
    double area;
    public Cubo(String nombre, int lados) {
        super(nombre, lados);
    }

    public void volumenCubo(){
        System.out.println("El volumen es " + Math.pow(getLongitud(),3));
    }
    public void areaCubo(){
        area = (getLongitud()*getLongitud())*getNumCaras();
        System.out.println("El area es " + area);
    }
}
