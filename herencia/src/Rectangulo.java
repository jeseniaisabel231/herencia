public class Rectangulo extends Irregulares{
    public Rectangulo(String nombre, int lados) {
        super(nombre, lados);
    }
    public void areaRec(){
        System.out.println("El area es: " + this.base*this.altura);
    }
    @Override
    public void Perimetro() {
        double perimetro=((this.altura*2)+(this.base*2));
        System.out.printf("El perimetro del rectangulo es: %.2f", perimetro);
    }
    public void areaRec(int altura, int base){
        System.out.println("El area del rectangulo es:" + base*altura);
    }
    public void areaRec(double altura, double base){
        System.out.println("El area del rectangulo es:" + base*altura);
    }

}
