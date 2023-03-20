
package ejercicio1;
public class auto {
 private String marca;
 private String modelo;
 private int año;
 private double kilometraje;
 
 //SETTERS
 public void setMarca(String marca ){
  this.marca=marca;
 }
 public void setModelo(String modelo){
  this.modelo=modelo;
 }
 public void setAño(int año){
  this.año=año;   
 }
 public void setkilometraje(double kilometraje){
  this.kilometraje=kilometraje;   
 }
 //GETTERS
 
 public String getMarca(){
 return marca;
 }
 public String modelo(){
 return modelo;
 }
 public int año(){
 return año;
 }
 public double kilometraje(){
 return kilometraje;
 }
}

