public interface Colorable {
    public void howToColor();
}

class ColorableTest {
    public static void main (String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(2);
        shapes[1] = new Square(3);
        shapes[2] = new Rectangle(2, 4);


        for (Shape shape: shapes){
            System.out.println("Area = " + shape.getArea());
            if (shape instanceof Square){
                ((Square) shape).howToColor();
            }
        }
    }
}
