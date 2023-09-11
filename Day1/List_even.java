package Day1;

public class List_even{
    public static void main(String args[]){
        int n=Integer.parseInt(args[0]);
        for(int i=2;i<=n;i++){
            if(i%2==0)
            System.out.println(i);
        }
    }
}