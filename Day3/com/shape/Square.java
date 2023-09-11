package Day3.com.shape;

public class Square implements Polygon{
    float side;
    public Square(float side) {
        this.side = side;
    }
    public void calcArea(){
        System.out.println("area of square"+side*side);
    }
    public void calcPeri(){
        System.out.println("Perimeter of the square:"+4*side);
    }
}
