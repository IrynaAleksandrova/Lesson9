public class Vector3D extends Vector {

    private static final String TEXT_VECTOR3D = "This is Vector is 3D system";

    public Vector3D(double x, double y, double z) {
        super(x, y, z);
    }

    public Vector3D() {
    }

    public double getVectorLength() {
        System.out.print("Vector length: ");
        return Math.sqrt(this.getX() * this.getX() + this.getY() * this.getY() + this.getZ() * this.getZ());
    }

    public double calculateScalarMultiplication(Vector3D vector1, Vector3D vector2) {
        System.out.print("Scalar multiplication of vectors: ");
        return vector1.getX() * vector2.getX() + vector1.getY() * vector2.getY() + vector1.getZ() * vector2.getZ();
    }

    public Vector3D calculateSum(Vector3D vector1, Vector3D vector2) {
        System.out.print("Sum of vectors: ");
        return new Vector3D(vector1.getX() + vector2.getX(), vector1.getY() + vector2.getY(),
                vector1.getZ() * vector2.getZ());
    }

    public Vector3D calculateDiff(Vector3D vector1, Vector3D vector2) {
        System.out.print("Difference of vectors: ");
        return new Vector3D(vector1.getX() - vector2.getX(), vector1.getY() - vector2.getY(),
                vector1.getZ() * vector2.getZ());
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
