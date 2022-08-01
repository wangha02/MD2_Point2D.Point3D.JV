import java.util.Arrays;

public class Point3d extends Point2d {
    private float z;
    private float[] xyz = new float[3];

    public Point3d() {
    }

    public Point3d(float x, float y, float z) {
        super (x,y);
        this.z = z;
    }


    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXyz(float x, float y, float z) {
        float[] xyz = {super.getX(), super.getY(), this.z};
    }

    public float[] getXyz() {
        float[] xyz = new float[]{super.getX(), super.getY(), this.z};
        return xyz;
    }



    @Override
    public String toString() {
        return "Point3d{" +
                super.toString()+
                " z=" + z +
//                ", xyz=" + Arrays.toString(xyz) +
                '}';
    }
}
