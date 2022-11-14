/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad11;

/**
 *
 * @author jorgejarajuarez
 */
public class Shape {
    String nombre;
    double area;
    double perimetro;
    
    
    public Shape(String n){
        nombre=n;
    }
    public String getnombre(){
        return nombre;
    }
    
    public double getarea(){
        return area;
        
    }
    
    public double getperimetro(){
        return perimetro;
    }
    
    public void dibujar(){
        System.out.println("Nombre: " + this.getnombre());
        System.out.println("Perímetro: " + this.getperimetro());
        System.out.println("Area: " + this.getarea());
    }
    
}
