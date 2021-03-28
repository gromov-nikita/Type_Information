package shapes;

import java.util.Arrays;
import java.util.List;

public class Shapes {
    public static void main(String[] args) {
        List<Shape> shapeList = Arrays.asList(
                new Circle(), new Square(), new Triangle(), new Rhomboid()
        );
        for(Shape shape : shapeList)
            shape.draw();

        Rhomboid rhomboid = new Rhomboid();
        System.out.println();
        System.out.println(rhomboid.toString());
        Shape shape = rhomboid;
        System.out.println(shape.toString());
        System.out.println(shape instanceof Rhomboid);
        Shape rhomboid2 = shape;
        System.out.println(rhomboid2.toString());
        //Circle circle = (Circle) rhomboid2; Мы не можем двигаться горизонтльно в дереве наслежований. Только вверх и вниз
        //System.out.println(circle.toString());

    }
}
