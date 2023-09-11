package Day3.com.shape.test;
import Day3.com.shape.Square;
import Day3.com.shape.Polygon;
import Day3.com.shape.Rectangle;
public class Test {
    public static void main(String arg[]){
        Polygon s=new Square(5.5f);
        Polygon r=new Rectangle(4.0f,3.0f);
        s.calcArea();
        r.calcArea();
        s.calcPeri();
        r.calcPeri();

    }
}
