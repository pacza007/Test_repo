/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.braininghub.soliddemo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pacza
 */
public class AreaCalculator { 
  
  private List<Shape> shapeContainer = new ArrayList<>(); // diamond <> operátor

  public AreaCalculator(Shape ... shapes){ // shape típusokat várok
    for (Shape shape: shapes) {
      shapeContainer.add(shape);
      
    }
  }
    
  public double sumArea(){ //páldányszintű metódus
    
    double sumArea =0.0d;
    Double ret=null;
    for (Shape shape : shapeContainer) {
      
     
     sumArea += shape.area();
     

    }
      return sumArea;
  }
  
 
}
