public class Lesson9 {

    public static void main(String[] args) {
    int x = 9;
    double a = 2.5;
    int y = 3;
    int z = 25;

    System.out.println(a);

    //Math.max
    System.out.println(Math.max(x, Math.max(y, z)));

    //Math.Min
    System.out.println(String.valueOf(Math.min(x, Math.min(y, z))));

    //Math.sqrt
    System.out.println(Math.sqrt(y));

    //Math.abs
    System.out.println(Math.abs(x));

    //Math.pow
    System.out.println(Math.pow(9, 2));

    //Math.round
    System.out.println(Math.round(3.7));

    //Math.ceil
    System.out.println(Math.ceil(3.7));

    //Math.floor
    java.lang.System.out.println(java.lang.Math.floor(3.7));
    }
}