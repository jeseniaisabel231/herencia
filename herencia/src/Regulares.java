public class Regulares extends Bidimensional {
    public Regulares(String nombre, int lados) {
        super(nombre, lados);
    }
    public void perimetroRegulares(){
        System.out.println("El perímetro es: "+getLado()*getLados());
    }

}
