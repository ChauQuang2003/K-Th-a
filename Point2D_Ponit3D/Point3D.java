package Point2D_Ponit3D;

public class Point3D {
    public float z = 0.0f;
    public Point3D(float x, float y, float z) {
        this.z = z;
    }
    public Point3D() {

    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public float setXYZ(float x, float y, float z) {
        this.z = z;
        return x;

    }
    public  float getXYZ(float x, float y, float z) {
        return z;
    }
    @Override
    public String toString() {
        return "Point3D [z=" + z + "]";
    }
}
