package Day3.com.shape;

public class Rectangle implements Polygon{
    float length;
    float breadth;
    
    public Rectangle(float length, float breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    public void calcArea(){
        System.out.println("area of rectangle"+length*breadth);
    }
    public void calcPeri(){
        System.out.println("Perimeter of the rectangle:"+2*(length+breadth));
    }
}