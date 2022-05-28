package OOP.Zadanie1;

public class Point2D {
    float x;
    float y;

    public Point2D() {
        this.x = 0;
        this.y = 0;
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float[] getXY() {
        float[] arrayOfFloats = new float[2];
        arrayOfFloats[0] = getX();
        arrayOfFloats[1] = getY();
        return arrayOfFloats;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x +
                ", " + y +
                ')';
    }
}
