/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lingkaran;

/**
 *
 * @author Lenovo
 */
public class Lingkaran {
    
    void hitungLuas(double r){
      double luas = 3.141592 * r * r;
      System.out.println("Luas (pecahan):" + luas);
      System.out.println("Luas (type-casting ke int):" + (int)luas);
      System.out.println("Luas (dibulatkan):" + Math.round(luas));
  }
}