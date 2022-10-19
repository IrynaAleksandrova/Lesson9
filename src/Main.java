public class Main {

    public static void main(String[] args) {
//        About Vector2D
        Vector2D vector2D = new Vector2D();
        Vector2D vectorFirst = new Vector2D(8.3, 12.2);
        Vector2D vectorSecond = new Vector2D(4.4, 6.7);
        vector2D.getInfo();
        System.out.println(vectorFirst.getVectorLength());
        System.out.println(vector2D.calculateScalarMultiplication(vectorFirst, vectorSecond));
        Vector2D sumVector2D = vector2D.calculateSum(vectorFirst, vectorSecond);
        System.out.println(sumVector2D.getX() + "; " + sumVector2D.getY());
        Vector2D diffVector2D = vector2D.calculateDiff(vectorFirst, vectorSecond);
        System.out.println(diffVector2D.getX() + "; " + diffVector2D.getY());

        Vector2D[] arrayOfRandomVectors2 = Vector2D.randomVectors(2);
        for (Vector2D vector : arrayOfRandomVectors2) {
            System.out.println("Random vector = " + vector.getX() + "; " + vector.getY());
        }
        System.out.println();

//        About Vector3D
        Vector3D vector3D = new Vector3D();
        Vector3D vectorThird = new Vector3D(9.2, 13.5, 19.4);
        Vector3D vectorFourth = new Vector3D(6.1, 11.7, 17.8);
        vector3D.getInfo();
        System.out.println(vectorThird.getVectorLength());
        System.out.println(vector3D.calculateScalarMultiplication(vectorThird, vectorFourth));
        Vector3D sumVector3D = vector3D.calculateSum(vectorThird, vectorFourth);
        System.out.println(sumVector3D.getX() + "; " + sumVector3D.getY() + "; " + sumVector3D.getZ());
        Vector3D diffVector3D = vector3D.calculateDiff(vectorThird, vectorFourth);
        System.out.println(diffVector3D.getX() + "; " + diffVector3D.getY() + "; " + diffVector3D.getZ());

        Vector3D[] arrayOfRandomVectors3 = Vector3D.randomVectors(3);
        for (Vector3D vector : arrayOfRandomVectors3) {
            System.out.println("Random vector = " + vector.getX() + "; " + vector.getY() + "; " + vector.getZ());
        }
    }
}