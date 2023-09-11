package Day1;
public class Bingo {
   public static void main(String args[]){
    int n=Integer.parseInt(args[0]);
    if(n>50||n<1){
    System.out.println("Enter in between 1 and 50!!"); return;}
    int[] arr={23,13,4,6,46};
    for(int i:arr)
    if(n==i) System.out.println("BINGO!!!");
   } 
}
