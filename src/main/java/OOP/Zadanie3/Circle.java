package OOP.Zadanie3;

public class Circle extends Shape{
    double radius;

    public Circle (){
        color = "uknown";
        ColorFillsFigure = false;
        radius = 1;
    }

    public Circle(String color, boolean colorFillsFigure, double radius) {
        super(color, colorFillsFigure);
        this.radius = radius;
    }
}
