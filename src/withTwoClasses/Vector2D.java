package withTwoClasses;

public class Vector2D {
    private double x;
    private double y;
    private static final String TEXT_VECTOR2D = "This is Vector is 2D system";

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public Vector2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getVectorLength() {
        System.out.print("Vector length: ");
        return Math.sqrt(this.getX() * this.getX() + this.getY() * this.getY());
    }

    public double calculateScalarMultiplication(Vector2D vector) {
        System.out.print("Scalar multiplication of vectors: ");
        return this.getX() * vector.getX() + this.getY() * vector.getY();
    }

    public Vector2D calculateSum(Vector2D vector) {
        System.out.print("Sum of vectors: ");
        return new Vector2D(this.getX() + vector.getX(), this.getY() + vector.getY());
    }

    public Vector2D calculateDiff(Vector2D vector) {
        System.out.print("Difference of vectors: ");
        return new Vector2D(this.getX() - vector.getX(), this.getY() - vector.getY());
    }

    public static Vector2D[] randomVectors(int n) {
        Vector2D[] arrayOfRandomVectors2 = new Vector2D[n];
        for (int i = 0; i < arrayOfRandomVectors2.length; i++) {
            arrayOfRandomVectors2[i] = new Vector2D(Math.random() * 100 + 1, Math.random() * 100 + 1);
        }
        return arrayOfRandomVectors2;
    }

    public void getInfo() {
        System.out.println(TEXT_VECTOR2D);
    }

}