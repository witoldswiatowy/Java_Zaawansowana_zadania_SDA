package OOP.Zadanie1;

public class Point3D extends Point2D{
    private float z;

    public Point3D(){
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public float[] getXYZ() {
        float[] arrayOfFloats = new float[3];
        arrayOfFloats[0] = getX();
        arrayOfFloats[1] = getY();
        arrayOfFloats[2] = getZ();
        return arrayOfFloats;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public String toString() {
        return "(" + x +
                ", " + y +
                ", " + z +
                ')';
    }
}
