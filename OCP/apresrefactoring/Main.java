public class Main {
    public static void main(String[] args) {
        AreaCalculator2 calc = new AreaCalculator2();
        Shape rect = new Rectangle(5, 4);
        Shape circle = new Circle(3);
        System.out.println("Rectangle : " + calc.calculateArea(rect));
        System.out.println("Cercle : " + calc.calculateArea(circle));
    }
}