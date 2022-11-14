/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad11;

/**
 *
 * @author jorgejarajuarez
 */
public class Cuadrado extends Shape
{
  double lado;
  
  public Cuadrado (double l)
  {
      super("Cuadrado");
      lado=l;
      
  }
  
  public void setarea(){
      this.area=lado*lado;
  }
  
  public void setperimetro(){
      this.perimetro=lado*4;
  }
  
  /*public void dibujar(){
      super.dibujar();
      System.out.println("Dibujo: ");
      for (int i=0; i<lado;i++)
      {
          for(int j=0; j<lado; j++)
              System.out.println("*");
          System.out.println();
      }*/
  }
    
    

