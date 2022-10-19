public class Main {

    public static void main(String[] args) {
//        About Vector2D
        Vector2D vector2D = new Vector2D();
        Vector2D vectorFirst = new Vector2D(3.15, 4.16);
        Vector2D vectorSecond = new Vector2D(4.06, 5.15);
        vector2D.info();
        System.out.println(vector2D.vectorLength(vectorFirst));
        System.out.println(vector2D.vectorScalarMultiplication(vectorFirst, vectorSecond));
        Vector2D sumVector2D = vector2D.vectorSum(vectorFirst, vectorSecond);
        System.out.println(sumVector2D.getX() + sumVector2D.getY());
        Vector2D diffVector2D = vector2D.vectorDiff(vectorFirst, vectorSecond);
        System.out.println(diffVector2D.getX() + diffVector2D.getY());

        Vector2D[] arrayOfRandomVectors2 = Vector2D.randomVectors(2);
        for (Vector2D vector : arrayOfRandomVectors2) {
            System.out.println("Random vector = " + vector.getX() + "; " + vector.getY());
        }
        System.out.println();

//        About Vector3D
        Vector3D vector3D = new Vector3D();
        Vector3D vectorThird = new Vector3D(3.15, 12.16, 15.22);
        Vector3D vectorFourth = new Vector3D(5.06, 14.15, 16.34);
        vector3D.info();
        System.out.println(vector3D.vectorLength(vectorThird));
        System.out.println(vector3D.vectorScalarMultiplication(vectorThird, vectorFourth));
        Vector3D sumVector3D = vector3D.vectorSum(vectorThird, vectorFourth);
        System.out.println(sumVector3D.getX() + sumVector3D.getY());
        Vector3D diffVector3D = vector3D.vectorDiff(vectorThird, vectorFourth);
        System.out.println(diffVector3D.getX() + diffVector3D.getY());

        Vector3D[] arrayOfRandomVectors3 = Vector3D.randomVectors(3);
        for (Vector3D vector : arrayOfRandomVectors3) {
            System.out.println("Random vector = " + vector.getX() + "; " + vector.getY() + "; " + vector.getZ());
        }
    }
}