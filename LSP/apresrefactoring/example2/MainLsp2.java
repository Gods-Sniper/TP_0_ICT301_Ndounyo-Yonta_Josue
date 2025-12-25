public class MainLsp2 {
    public static void main(String[] args) {
        Shape rect = new Rectangle(5, 4);
        Shape square = new Square(5);
        System.out.println("Rectangle : " + rect.getArea());
        System.out.println("Carré : " + square.getArea());
    }
}