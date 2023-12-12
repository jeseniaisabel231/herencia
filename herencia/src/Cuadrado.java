public class Cuadrado extends Poligono{
    public Cuadrado(String nombre, int lados) {
        super(nombre, lados);
    }
    @Override
    public void Perimetro() {
        System.out.println("El perímetro es: "+ getLado()*4);;
    }

    public void area(double Lado){
        System.out.println("El area es: "+Lado*Lado);
    }
    public void area(int Lado){
        System.out.println("El area es: "+Lado*Lado);
    }
}

