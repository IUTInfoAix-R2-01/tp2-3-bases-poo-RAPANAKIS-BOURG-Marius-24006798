package ex3;

public class CircleBis {  
	   private double radius;
	   
	   
	  
	   public CircleBis() {  
	      radius = 1.0;
	   }
	   
	   public CircleBis(double r) {  
	      radius = r;
	   }
	   
	   public double getRadius() {
	     return radius; 
	   }
	   
	   public void setRadius(double r) {
		   radius = r;
	   }
	   
	   public double getArea() {
	      return radius*radius*Math.PI;
	   }
	   
	   public double getCircumference() {
		   return 2*radius*Math.PI ;
	   }
	   
	   public String toString() {
		   return "Circle[radius="+ getRadius() + "]";
	   }
	}

