
import com.sun.jdi.Value;


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

public abstract class GeometricObject implements Comparable {
  private String color = "white";
  private boolean filled;
  private java.util.Date dateCreated;

  /** Construct a default geometric object */
  protected GeometricObject() {
    dateCreated = new java.util.Date();
  }

  /** Construct a geometric object with color and filled value */
  protected GeometricObject(String color, boolean filled) {
    dateCreated = new java.util.Date();
    this.color = color;
    this.filled = filled;
  }

  /** Return color */
  public String getColor() {
    return color;
  }

  /** Set a new color */
  public void setColor(String color) {
    this.color = color;
  }

  /** Return filled. Since filled is boolean,
   *  the get method is named isFilled */
  public boolean isFilled() {
    return filled;
  }

  /** Set a new filled */
  public void setFilled(boolean filled) {
    this.filled = filled;
  }

  /** Get dateCreated */
  public java.util.Date getDateCreated() {
    return dateCreated;
  }

  @Override
  public String toString() {
    return "created on " + dateCreated + "\ncolor: " + color +
      " and filled: " + filled;
  }

  /** Abstract method getArea */
  public abstract double getArea();

  /** Abstract method getPerimeter */
  public abstract double getPerimeter();

  public abstract Object max(Object, Object);

}



// Circle.java: The circle class that extends GeometricObject
class Circle1 extends GeometricObject { 
  private double radius = 0;

  public Circle1() {}

  public Circle1(double radius){
    this.radius = radius;
  }

  public void setRadius(double radius){
    this.radius = radius;
  }

  public double getRadius(){
    return this.radius;
  }

  public double getDiameter(){
    return this.radius * 2;
  }

  @Override
  public double getArea(){
    return Math.pow(this.radius, 2) * Math.PI;
  }

  @Override
  public double getPerimeter(){
    return this.radius* 2 * Math.PI;
  }

  @Override
  public Circle1 max(Circle1 one, Circle1 two){
    if (one.getRadius() > two.getRadius()){
      return one;
    } else {
      return two;
    }
  }

}


