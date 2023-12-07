public class Cuadrado extends Poligono{
    public Cuadrado(String nombre, int lados) {
        super(nombre, lados);
    }

    public void area(){
        System.out.println(" El area del cuadrado es: " + getLado()*getLado());
    }
}
}
