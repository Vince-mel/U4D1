public class Main3 {
    public static void main(String[] args) {
        System.out.println(perimrett(12.4 , 14.5));
        System.out.println(areaTriangolo(12.3, 14.4));
    }
    public static double perimrett(double lat1, double lat2) {
        return (lat1 + lat2) * 2;
    }
    public static int pardisp(int num1) {
        if (num1 % 2 == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static double areaTriangolo(double b, double h) {
        return (b * h)/2;

    }
}
