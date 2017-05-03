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
public class App {
  
  public static void main(String[] args) {
    
   
    Circle kor1 = new Circle(15);
    Square negyzet = new Square(12);
    AreaCalculator c= new AreaCalculator(kor1, negyzet);
    SumAreaOutputter out = new SumAreaOutputter(c);
    System.out.println(out.showResultAsHTML());
    System.out.println(out.showResultAsJSON());
  }
}
