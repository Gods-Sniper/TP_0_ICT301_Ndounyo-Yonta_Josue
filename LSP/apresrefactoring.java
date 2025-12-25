// Square utilise Rectangle par composition, pas d'héritage
class Rectangle {
    private int width;
    private int height;

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getArea() {
        return width * height;
    }
}

class Square {
    private Rectangle rectangle = new Rectangle();

    public void setSize(int size) {
        rectangle.setWidth(size);
        rectangle.setHeight(size);
    }

    public int getArea() {
        return rectangle.getArea();
    }
}