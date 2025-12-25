public class Mainlsp {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.setWidth(5);
        rect.setHeight(4);
        System.out.println("Aire Rectangle = " + rect.getArea()); // 20

        Rectangle square = new Square();
        square.setWidth(5);
        square.setHeight(4);
        System.out.println("Aire Carré = " + square.getArea()); // 16 → violation !
    }
}