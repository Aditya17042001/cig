package Day1;
import java.util.*;
public class Sum_average {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> arr=new ArrayList<>();
       System.out.println("Enter the number of elements:");
       int n=sc.nextInt();
       while(n!=0){
        arr.add(sc.nextInt());
        n--;
       }
       int sum=0;
       for(Integer num:arr) //iterating arraylits using foreach loop
       sum+=num;
       float avg=sum/arr.size();
       System.out.println("Sum is :"+sum);
       System.out.println("Average is:"+avg);
       System.out.println("Following elements are greater than average:");
       Iterator itr=arr.iterator(); //iterating array using iterator of collection framework
       while(itr.hasNext()){
        int temp=(int)itr.next();
        if(temp>=avg)
        System.out.print(temp+" ");
       }

    }
}
