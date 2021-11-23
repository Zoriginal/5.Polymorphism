package A5Polymorphism.A1Lab.A2Shapes;

public abstract class Shape {
    private double perimeter;
    private double area;

    public Shape(double perimeter, double area) {
        this.perimeter = perimeter;
        this.area = area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public double getArea() {
        return area;
    }

    abstract double calculatePerimeter();
    abstract double calculateArea();

}
