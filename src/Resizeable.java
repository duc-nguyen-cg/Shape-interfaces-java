import com.sun.xml.internal.ws.addressing.WsaActionUtil;

public interface Resizeable {
    public void resize(double percent);
}

class ResizeableTest{
    public static void main (String[] args){
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(2);
        shapes[1] = new Rectangle(2, 4);
        shapes[2] = new Square(3);

        System.out.println("Pre-resized: ");
        for (Shape shape: shapes){
            System.out.println(shape.getArea());
        }

        for (Shape shape: shapes){
            double percent = Math.floor(Math.random() * 100);
            shape.resize(percent);
            System.out.println("Increase size by " + percent + "%");
        }

        System.out.println("Post-resized: ");
        for (Shape shape: shapes){
            System.out.println(shape.getArea());
        }






    }


}
