public class Vector2D extends Vector {

    private static final String TEXT_VECTOR2D = "This is Vector is 2D system";

    public Vector2D(double x, double y) {
        super(x, y);
    }

    public Vector2D() {
    }

    public double vectorLength(Vector2D vector) {
        System.out.print("Vector length: ");
        return Math.sqrt(vector.getX() * vector.getX() + vector.getY() * vector.getY());
    }

    public double vectorScalarMultiplication(Vector2D vector1, Vector2D vector2) {
        System.out.print("Scalar multiplication of vectors: ");
        return vector1.getX() * vector2.getX() + vector1.getY() * vector2.getY();
    }

    public Vector2D vectorSum(Vector2D vector1, Vector2D vector2) {
        System.out.print("Sum of vectors: ");
        return new Vector2D(vector1.getX() + vector2.getX(), vector1.getY() + vector2.getY());
    }

    public Vector2D vectorDiff(Vector2D vector1, Vector2D vector2) {
        System.out.print("Difference of vectors: ");
        return new Vector2D(vector1.getX() - vector2.getX(), vector1.getY() - vector2.getY());
    }

    public static Vector2D[] randomVectors(int n) {
        Vector2D[] arrayOfRandomVectors2 = new Vector2D[n];
        for (int i = 0; i < arrayOfRandomVectors2.length; i++) {
            arrayOfRandomVectors2[i] = new Vector2D(Math.random() * 100 + 1, Math.random() * 100 + 1);
        }
        return arrayOfRandomVectors2;
    }

    public void info() {
        System.out.println(TEXT_VECTOR2D);
    }

}