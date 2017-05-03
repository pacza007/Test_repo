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
public class Cuboid implements Shape, SolidShape {

  private int length;
  private int with;
  private int  height;
  
  
  
  @Override
  public double area() {
    return (2*((length*with)+(length*height)+(with*height)));
  }

  @Override
  public double volume() {
 return (length*height*with);
  }
  
}
