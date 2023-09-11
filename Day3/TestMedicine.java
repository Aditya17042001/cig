package Day3;

import java.util.Date;

 abstract class Medicine {
    public float price;
    public Date date;
    public String getDetails(){
        return "price: "+this.price+"expiry date:"+this.date;
    }
    public abstract void displayLabel();
    
}
 class Tablet extends Medicine{
  public void displayLabel(){
    System.out.println("Store in a cool and dry place");
  }
}
class Ointments extends Medicine{

  public void displayLabel(){
    System.out.println("for external use only");
  }
}
class Syrup extends Medicine{
      public void displayLabel(){
    System.out.println("Use under physicians prescription only");
  }
}
public class TestMedicine{
  public static void main(String args[]){
    Medicine t=new Tablet();
    t.displayLabel();
    Medicine s=new Syrup();
    s.displayLabel();
   Medicine o=new Ointments();
   o.displayLabel();
  }
}

