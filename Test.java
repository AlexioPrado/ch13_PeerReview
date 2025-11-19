
public class Test {
  // Main method
  public static void main(String[] args) {
    // Create two comparable circles
    Circle1 circle1 = new Circle1(5);
    Circle1 circle2 = new Circle1(4);

    // Display the max circle
    Circle1 circle = (Circle1)GeometricObject1.max(circle1, circle2);
    System.out.println("The max circle's radius is " +
      circle.getRadius());
    System.out.println(circle);
  }
}

abstract class GeometricObject1 implements Comparable {
  
}


// Circle.java: The circle class that extends GeometricObject
class Circle1 extends GeometricObject1 { 
  private double radius = 0;

  public Circle1() {}

  public Circle1(double radius){
    this.radius = radius;
  }

  public void setRadius(double radius){
    this.radius = radius;
  }

  public double getArea(){
    return Math.pow(this.radius, 2) * Math.PI;
  }

  public double getRadius(){
    return this.radius;
  }

  public double getDiameter(){
    return this.radius * 2;
  }
}


