public class poly {
    static int add(int a, int b)
    {
        return a+b;
    }
    static double add(double a, double b)
    {
        return a+b;
    }
}
class addition {
    public static void main(String[] args)
    {
        System.out.println(poly.add(2, 4));
        System.out.println(poly.add(5.5, 6.3));
    }
}
