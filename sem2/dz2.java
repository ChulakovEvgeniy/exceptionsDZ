package sem2;

public class dz2 {
    public static void main(String[] args) {
        try {
            Integer[] intArray = {1,2,34,5,4,6,7,8,8};
            int d = 0;
            double catchedRes1 = (double) intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }
}
