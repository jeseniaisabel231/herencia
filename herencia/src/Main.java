import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int opcion, opcion1, opcion2, opcion3, numLados;
        double LongLados, base, altura, arista, LongLado;
        System.out.println("-----MENU-----");
        System.out.println("1. Bidimensonal");
        System.out.println("2. Tridimensional");

        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingrese la opción: ");
        opcion= entrada.nextInt();

        if (opcion==1){
            System.out.println("Submenu:");
            System.out.println("1. Regulares");
            System.out.println("2. Irregulares");
            System.out.println("Ingrese una opción: ");
            opcion2= entrada.nextInt();
            if (opcion2==1){
                System.out.println("1.Poligono");
                System.out.println("2.Cuadrado");
                opcion3= entrada.nextInt();

                if (opcion3==1){
                    System.out.println("Ingrese la cantidad de lados: ");
                    numLados= entrada.nextInt();
                    System.out.println("Ingrese la longitud del lado: ");
                    LongLado= entrada.nextDouble();
                    Poligono poligono1= new Poligono("Poligono", numLados);
                    poligono1.setLado(LongLado);
                    poligono1.perimetroRegulares();
                }else{
                    System.out.println("Ingrese la longitud del lado: ");
                    LongLados= entrada.nextDouble();

                    Cuadrado cuadrado1= new Cuadrado("Cuadrado", 4);
                    cuadrado1.setLado(LongLados);
                    cuadrado1.area(LongLados);
                    cuadrado1.Perimetro();
                }
            } else if (opcion2==2) {
                System.out.println("1.Rectangulos ");
                System.out.println("Ingrese la base: ");
                base= entrada.nextDouble();
                System.out.println("Ingrese la altura: ");
                altura= entrada.nextDouble();
                Rectangulo rectangulo1= new Rectangulo("Poligono", 4);
                rectangulo1.setBase(base);
                rectangulo1.setAltura(altura);
                rectangulo1.areaRec(base,altura);
                //Sobreescribir metodo
                rectangulo1.Perimetro();
            }
        } else if (opcion==2) {
            System.out.println("1. Cubo ");
            System.out.println("Ingrese la longitud del lado: ");
            arista= entrada.nextFloat();
            Cubo cubo1= new Cubo("Cubo", 12);

            cubo1.setNumCaras(6);
            cubo1.setLongitud(arista);
            cubo1.areaCubo();
            cubo1.volumenCubo();
        }

    }
}
