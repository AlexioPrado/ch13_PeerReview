
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
    System.out.println(circle.toString());
  }
}

abstract class GeometricObject1 implements Comparable {
  /** Abstract method getArea */
  public abstract double getArea();

  /** Abstract method getPerimeter */
  public abstract double getPerimeter();

  //Go back to circle class and check which object is bigger
  //Return the object which is greater
  public static Comparable max (Comparable o1, Comparable o2) {
    if (o1.compareTo(o2) > 0){
      return o1;
    } else {
      return o2;
    }
  }
}


// Circle.java: The circle class that extends GeometricObject
class Circle1 extends GeometricObject1 { 
  private double radius = 0;

  //Constructors
  public Circle1() {}
  public Circle1(double radius){
    this.radius = radius;
  }

  //Set radius
  public void setRadius(double radius){
    this.radius = radius;
  }
  //Get radius
  public double getRadius(){
    return this.radius;
  }
  //Get diameter
  public double getDiameter(){
    return this.radius * 2;
  }

  //String
  @Override
  public String toString(){
    return "[Circle] radius = " + this.radius;
  }

  //Get Area
  @Override
  public double getArea(){
    return Math.pow(this.radius, 2) * Math.PI;
  }

  //Get Perimeter
  @Override
  public double getPerimeter(){
    return this.radius* 2 * Math.PI;
  }

  // Compare to: Check if radius is greater than second circle's radius
  // Return a value to geometricObject1
  @Override
  public int compareTo(Object o) {
    if (getRadius() > ((Circle1)o).getRadius()){
      return 1;
    } else if (getRadius() > ((Circle1)o).getRadius()) {
      return -1;
    } else {
      return 0;
    }    
  }
  
}



