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
public class Circle implements SolidShape {
  private int radius;

  public Circle(int radius) {
    this.radius = radius;
   }

  public int getRadius() {
    return radius;
  }

  @Override
  public double area() {
  
    return Math.PI*Math.pow(radius, 2);  
    
    
  }

  
  
  
  
}
