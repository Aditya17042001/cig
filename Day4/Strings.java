package Day4;

public class Strings {
    public static void main(String args[]){
        String s1="hello";
        String s2=new String("hello");
        StringBuilder s3=new StringBuilder("hello");
        System.out.println("s3.equals(s2) "+s3.equals(s2));
        System.out.println("s1:"+s1);
        System.out.println("s2:"+s2);
        System.out.println("s1.equals(s2) "+s1.equals(s2));
        System.out.println("s1==s2?"+ (s1==s2));
        s1="hiii";
        System.out.println(s1);
    }
}
