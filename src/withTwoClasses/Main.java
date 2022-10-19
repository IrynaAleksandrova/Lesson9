package withTwoClasses;

public class Main {

    public static void main(String[] args) {
//        About withTwoClasses.Vector2D
        Vector2D vectorFirst = new Vector2D(8.3, 12.2);
        Vector2D vectorSecond = new Vector2D(4.4, 6.7);
        vectorFirst.getInfo();
        System.out.println(vectorFirst.getVectorLength());
        System.out.println(vectorFirst.calculateScalarMultiplication(vectorSecond));
        Vector2D sumVector2D = vectorFirst.calculateSum(vectorSecond);
        System.out.println(sumVector2D.getX() + "; " + sumVector2D.getY());
        Vector2D diffVector2D = vectorFirst.calculateDiff(vectorSecond);
        System.out.println(diffVector2D.getX() + "; " + diffVector2D.getY());

        Vector2D[] arrayOfRandomVectors2 = Vector2D.randomVectors(2);
        for (Vector2D vector : arrayOfRandomVectors2) {
            System.out.println("Random vector = " + vector.getX() + "; " + vector.getY());
        }
        System.out.println();

//        About withTwoClasses.Vector3D
        Vector3D vectorThird = new Vector3D(9.2, 13.5, 19.4);
        Vector3D vectorFourth = new Vector3D(6.1, 11.7, 17.8);
        vectorThird.getInfo();
        System.out.println(vectorThird.getVectorLength());
        System.out.println(vectorThird.calculateScalarMultiplication(vectorFourth));
        Vector3D sumVector3D = vectorThird.calculateSum(vectorFourth);
        System.out.println(sumVector3D.getX() + "; " + sumVector3D.getY() + "; " + sumVector3D.getZ());
        Vector3D diffVector3D = vectorThird.calculateDiff(vectorFourth);
        System.out.println(diffVector3D.getX() + "; " + diffVector3D.getY() + "; " + diffVector3D.getZ());

        Vector3D[] arrayOfRandomVectors3 = Vector3D.randomVectors(3);
        for (Vector3D vector : arrayOfRandomVectors3) {
            System.out.println("Random vector = " + vector.getX() + "; " + vector.getY() + "; " + vector.getZ());
        }
    }
}