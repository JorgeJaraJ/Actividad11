
package Actividad11;

/**
 *
 * @author jorgejarajuarez
 */
import java.util.Scanner;
public class Actividad11 {

    public static void main(String[] args) {
        
        //Creación del Scanner
        Scanner entrada = new Scanner(System.in);
        double wlado, walt, wbas, walturat, wbaset, wladot;
        
        // Lado del Cuadrado
        System.out.println("Lado del cuadrado: ......");
        wlado=entrada.nextDouble();
        
        // Creación del Rectángulo
        System.out.println("Base del rectángulo: .......");
        wbas=entrada.nextDouble();
        System.out.println("Altura del rectángulo: ........");
        walt=entrada.nextDouble();
        

        // Creación del Triángulo
        System.out.println("Base del triángulo: .......");
        wbaset=entrada.nextDouble();
        System.out.println("Altura del triángulo: ........");
        walturat=entrada.nextDouble();
        System.out.println("Lado del triángulo: ......");
        wladot=entrada.nextDouble();
        
        // Se hace su instancia
        Cuadrado objCuadrado = new Cuadrado(wlado);
        Rectangulo objRectangulo = new Rectangulo(wbas, walt);
        Triangulo objTriangulo = new Triangulo(walturat,wbaset,wladot);

        
        
        
        
        objCuadrado.setarea();
        objCuadrado.setperimetro();
        objCuadrado.dibujar();
        objRectangulo.setarea();
        objRectangulo.setperimetro();
        objRectangulo.dibujar();
        objTriangulo.setarea();
        objTriangulo.setperimetro();
        objTriangulo.dibujar();
        
    }
}
