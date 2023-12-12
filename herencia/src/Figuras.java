public class Figuras {
    String nombre;
    int lados;

    //siempre debe ir el constructor
    public Figuras(String nombre, int lados) {
        this.nombre = nombre;
        this.lados = lados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getLados() {
        return lados;
    }

    public void setLados(int lados) {
        this.lados = lados;
    }
    //metodo personalizado
    public void tipoFigura(){
        System.out.println(" Esto es un " + this.getNombre());
    }

    public void Perimetro(){
        System.out.println("El perimetro es:");
    }
}