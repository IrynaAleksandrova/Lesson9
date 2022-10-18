public class Main {

    public static void main(String[] args) {
//        About 2D vector
        Vector2D vector2d = new Vector2D();
        Vector2D vector1 = new Vector2D(3.15, 4.16);
        Vector2D vector2 = new Vector2D(4.06, 5.15);
        vector2d.info();
        System.out.println(vector2d.vectorLength(vector1));
        System.out.println(vector2d.vectorScalarMultiplication(vector1, vector2));
        Vector2D sumVector2d = vector2d.vectorSum(vector1, vector2);
        System.out.println(sumVector2d.getX() + sumVector2d.getY());
        Vector2D diffVector2d = vector2d.vectorDiff(vector1, vector2);
        System.out.println(diffVector2d.getX() + diffVector2d.getY());

        Vector2D[] arrayOfRandomVectors2 = Vector2D.randomVectors(2);
        for (Vector2D vector : arrayOfRandomVectors2) {
            System.out.println("Random vector = " + vector.getX() + "; " + vector.getY());
        }
        System.out.println();

//        About 3D vector
        Vector3D vector3d = new Vector3D();
        Vector3D vector3 = new Vector3D(3.15, 12.16, 15.22);
        Vector3D vector4 = new Vector3D(5.06, 14.15, 16.34);
        vector3d.info();
        System.out.println(vector3d.vectorLength(vector3));
        System.out.println(vector3d.vectorScalarMultiplication(vector3, vector4));
        Vector3D sumVector3d = vector3d.vectorSum(vector3, vector4);
        System.out.println(sumVector3d.getX() + sumVector3d.getY());
        Vector3D diffVector3d = vector3d.vectorDiff(vector3, vector4);
        System.out.println(diffVector3d.getX() + diffVector3d.getY());

        Vector3D[] arrayOfRandomVectors3 = Vector3D.randomVectors(3);
        for (Vector3D vector : arrayOfRandomVectors3) {
            System.out.println("Random vector = " + vector.getX() + "; " + vector.getY() + "; " + vector.getZ());
        }
    }
}