package withTwoClasses;

public class Vector3D extends Vector2D {
    private double z;
    private static final String TEXT_VECTOR3D = "This is Vector is 3D system";

    public double getZ() {
        return z;
    }

    public Vector3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public double getVectorLength() {
        System.out.print("Vector length: ");
        return Math.sqrt(this.getX() * this.getX() + this.getY() * this.getY() + this.getZ() * this.getZ());
    }

    public double calculateScalarMultiplication(Vector3D vector) {
        System.out.print("Scalar multiplication of vectors: ");
        return this.getX() * vector.getX() + this.getY() * vector.getY() + this.getZ() * vector.getZ();
    }

    public Vector3D calculateSum(Vector3D vector) {
        System.out.print("Sum of vectors: ");
        return new Vector3D(this.getX() + vector.getX(), this.getY() + vector.getY(),
                this.getZ() * vector.getZ());
    }

    public Vector3D calculateDiff(Vector3D vector) {
        System.out.print("Difference of vectors: ");
        return new Vector3D(this.getX() - vector.getX(), this.getY() - vector.getY(),
                this.getZ() * vector.getZ());
    }

    public static Vector3D[] randomVectors(int n) {
        Vector3D[] arrayOfRandomVectors3 = new Vector3D[n];
        for (int i = 0; i < arrayOfRandomVectors3.length; i++) {
            arrayOfRandomVectors3[i] = new Vector3D(Math.random() * 100 + 1, Math.random() * 100 + 1,
                    Math.random() * 100 + 1);
        }
        return arrayOfRandomVectors3;
    }

    public void getInfo() {
        System.out.println(TEXT_VECTOR3D);
    }
}
