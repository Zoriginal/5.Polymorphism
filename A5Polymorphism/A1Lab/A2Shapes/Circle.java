package A5Polymorphism.A1Lab.A2Shapes;

public class Circle extends Shape{
    private double radius;

    public Circle(double perimeter, double area,double radius) {
        super(perimeter, area);
        setRadius(radius);
    }

    public final double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    double calculatePerimeter() {
        return 2*Math.PI*this.radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * this.radius * this.radius;
    }
}
