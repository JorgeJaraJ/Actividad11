/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad11;

/**
 *
 * @author jorgejarajuarez
 */
public class Rectangulo extends Shape {
    
    private double base;
    private double altura;
    
    public Rectangulo(double b, double a){
        super("Rectangulo");
        base=b;
        altura=a;
    }
    
    public void setarea(){
        this.area=base*altura;
        
    }
    
    public void setperimetro(){
        this.perimetro=((base*2)+(altura*2));
    }
    
     /* public void dibujar(){
      super.dibujar();
      System.out.println("Dibujo: ");
      for (int i=0; i<altura;i++)
      {
          for(int j=0; j<base; j++)
              System.out.println("*");
          System.out.println();*/
      }
  
    

