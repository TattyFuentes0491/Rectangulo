/*
 1. Crear una clase Rectángulo, con atributos longitud y ancho. Crear también el constructor de la clase 
y los métodos necesarios para calcular el área y el perímetro. Crear otra clase (JFrame Form) Prueba_Rectangulo 
que pruebe varios rectángulos y muestre por pantalla sus áreas y perímetros (utilizando JTable, 
utilice con JPoPMenu las opciones de modificar y eliminar, además utilice archivo de texto en Java para 
almacenar y cargar la información).
 */
package rectangulo;

public class Rectangulo {
    //atributos
    double longt;
    double ancho;
    
//creando metodo constructor
    public Rectangulo() {
        
    }
    //creamos los metodos getter y setter
    public double getLongt() {
        return this.longt;
    }

    public void setLongt(double longt) {
        this.longt = longt;
    }

    public double getAncho() {
        return this.ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }
    
    //metodo calcular area
    public double Area(double lg, double anc){
        double area = 0;
        area= lg*anc;
        return area;
    }
    
    //metodo calcular perimetro
    public double Perimetro(double lg, double anc){
        double perimetro = 0;
        perimetro= ((2*lg)+(2*anc));
        return perimetro;
    }
    
    
   public static void main(String[] args) {
        // Mostar area y perimetro 
    }
    
}
