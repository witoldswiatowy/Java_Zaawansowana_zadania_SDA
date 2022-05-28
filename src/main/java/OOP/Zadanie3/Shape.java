package OOP.Zadanie3;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Shape {
//    Color color;
    String color;
    boolean ColorFillsFigure;

    public Shape() {
//        color = Color.UNKNOWN;
        color = "uknown";
        ColorFillsFigure = false;
    }

    public Shape(String color, boolean colorFillsFigure) {
        this.color = color;
        ColorFillsFigure = colorFillsFigure;
    }

    @Override
    public String toString() {
        String filled = "";
        if(ColorFillsFigure){
            filled = "filled";
        } else {
            filled = "NotFilled";
        }
        return "Shape with color of " + color + " and " + filled;
    }
}
