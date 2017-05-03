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
public class SumAreaOutputter {
  
  private AreaCalculator calculator; //példányosítunk, hogy elérjük példányszintű metódust (sumArea)

  public SumAreaOutputter(AreaCalculator calc) {
    this.calculator = calc;
  }
  
  
  
  public String showResultAsHTML(){
    StringBuilder b= new  StringBuilder();
    
    b.append("<h1>")
    .append("Sum of area of provided shapes: ")
    .append(calculator.sumArea())
    .append("</h1>");
        
   return b.toString();
            
  }
  
  public String showResultAsJSON (){
    
    StringBuilder b= new  StringBuilder();
    
    b.append("{\"sum\": ")
    .append(calculator.sumArea())
    .append("}");
    return b.toString();
  } 
  
  
  
}
