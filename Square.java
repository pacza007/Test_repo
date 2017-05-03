/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.braininghub.soliddemo;

/**
 *
 * @author pacza
 */
public class Square implements SolidShape {
  
  private int length;

  public Square (int lenght) {
    this.length = lenght;
   }

  public int getLength() {
    return length;
  }

  @Override
  public double area() {
    return Math.pow(length, 2);
    
  }

  
  
  
}
