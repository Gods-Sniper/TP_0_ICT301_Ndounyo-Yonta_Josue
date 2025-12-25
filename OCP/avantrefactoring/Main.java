public class Main {
    public static void main(String[] args) {
        AreaCalculator calc = new AreaCalculator();
        Rectangle rect = new Rectangle(5, 4);
        Circle circle = new Circle(3);
        System.out.println("Rectangle : " + calc.calculateArea(rect));
        System.out.println("Cercle : " + calc.calculateArea(circle));
    }
}