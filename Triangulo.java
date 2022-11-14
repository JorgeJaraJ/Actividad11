/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad11;

/**
 *
 * @author jorgejarajuarez
 */
public class Triangulo extends Shape{

    
    private double baset;
    private double alturat;
    private double ladot;
    
    public Triangulo(double bt, double at, double lt){
        super("Triangulo");
        baset=bt;
        alturat=at;
        ladot=lt;
    }
    
    public void setarea(){
        this.area=(baset*alturat)/2;
        
    }
    
    public void setperimetro(){
        this.perimetro=((baset)+(ladot)+(ladot));
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
  
    


    

