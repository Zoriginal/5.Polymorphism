package A5Polymorphism.A1Lab.A2Shapes;

public class Rectangle extends Shape{

    private double height;
    private double width;

    public Rectangle(double perimeter, double area,double height,double width) {
        super(perimeter, area);
        setHeight(height);
        setWidth(width);
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    double calculatePerimeter() {
        return 2 * (height + width);
    }

    @Override
    double calculateArea() {
        return height * width;
    }
}
