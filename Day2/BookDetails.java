package Day2;
import java.util.Scanner;
class Book{
private int bookNo;
private String title;
private String author;
private float price;
private static  int bookCount=0;



public Book(int bookNo, String title, String author, float price) {
   
    if(title.length()>=4)   
    this.title = title;
    else {System.out.println("title must be atleast 4  characters!"+title.length());this.title = "";}
    this.bookNo = bookNo;
    this.title = title;
    this.author = author;
    if(price>=1&&price<=50)
      this.price = price;
    else {System.out.println("price must be between 1 and 50");this.price = 0;}
     bookCount++;
}
 
public static int getBookCount( ){
    return bookCount;
}
public String toString(){
    return "bookNo:"+this.bookNo+"  bootitle:"+this.title+"  bookauthor:"+this.author+"  price:"+this.price+"  Bookcount:"+getBookCount();
}
public void setBookNo(int bookNo) {
    this.bookNo = bookNo;
}
public int getBookNo() {
    return bookNo;
}
public String getTitle() {
    return title;
}
public void setTitle(String title) {
    this.title = title;
}
public String getAuthor() {
    return author;
}
public void setAuthor(String author) {
    this.author = author;
}
public float getPrice() {
    return price;
}
public void setPrice(float price) {
    this.price = price;
}


}
class EngineeringBook extends Book{
    private String category;
    public EngineeringBook(int bookNo, String title, String author, float price,String category){
        super(bookNo, title,  author,  price);
        this.category=category;

    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
}
public class BookDetails {
    public static void main(String args[]){
       // Book bk1=new Book(123,"hel","aditya",89.3f);
        
        Scanner sc=new Scanner(System.in);
        // System.out.println("Enter the book details:");
        // System.out.println("bookNo: ");
        // bk.setBookNo(sc.nextInt());
        //  System.out.println("booktitle: ");
        //  bk.setTitle(sc.next());
        //   System.out.println("bookPrice: ");
        //   bk.setPrice(sc.nextFloat());
        //    System.out.println("bookauthor: ");
        //    bk.setAuthor(sc.next());
        //   System.out.println( bk1.toString());
        // Book bk2=new Book(123,"hel","aditya",89.3f); 
        //   System.out.println( bk2.toString());
        // Book[] bkarr=new Book[3];
        // System.out.println("Enter the details for 3 books::");
        // for(int i=0;i<=2;i++){
        //     bkarr[i]=new Book();
        //     bkarr[i].setBookNo(sc.nextInt());
        //     bkarr[i].setTitle(sc.next());
        //     bkarr[i].setPrice(sc.nextFloat());
        //     bkarr[i].setAuthor(sc.next());
        // }
        // for(int i=0;i<=2;i++) bkarr[i].toString();
        EngineeringBook bk=new EngineeringBook(123, "c++", "aditya", 56.7f, "M1");
        System.out.println(bk.toString()+"Bookcategory:"+bk.getCategory());

    }
}
