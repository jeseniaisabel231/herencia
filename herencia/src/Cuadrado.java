public class Cuadrado extends Poligono{
    public Cuadrado(String nombre, int lados) {
        super(nombre, lados);
    }
    public void area()
    {
        double area=Math.pow(this.lados, 2);
        System.out.printf("El area del cuadrado es: %.2f\n", area);
    }
    public void perimetro()
    {
        double perimetro=this.lados*4;
        System.out.printf("El perimetro del cuadrado es: %.2f\n", perimetro);
    }
}
