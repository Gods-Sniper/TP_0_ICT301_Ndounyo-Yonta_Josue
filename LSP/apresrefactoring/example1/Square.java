public class Square {
    private Rectangle rectangle = new Rectangle();

    public void setSize(int size) {
        rectangle.setWidth(size);
        rectangle.setHeight(size);
    }

    public int getArea() {
        return rectangle.getArea();
    }
}