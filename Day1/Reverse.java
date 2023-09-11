package Day1;
import java.util.Arrays;
public class Reverse {
    public static String reverse(String word){
        int n=word.length();
       String s="";
        int j=0;
       for(int i=n-1;i>=0;i--){
         s+=word.charAt(i);
       }
       return s;
    }
    public static void main(String[] args){
        String[] words=new String[args.length];
        String[] reversedwords=new String[args.length];
        int i=0;
        for(String word:args){
            words[i]=word;
            i++;
        }
        i=0;
        for(String word:words){
          reversedwords[i]= new String(reverse(word));
          i++;}
         for(String word:reversedwords)
         System.out.println(word);
        
         // arranging alphabetically
        //  int size=reversedwords.length;
        //  for(int k=0;k<size-1;k++){
        //     for(int j=0;j<size-i-1;j++){
        //         if(reversedwords[j].compareTo(reversedwords[j+1])>0)
        //         {
        //             String temp= reversedwords[j+1];
        //             reversedwords[j+1]=reversedwords[j];
        //             reversedwords[j]=temp;
        //         }
        //     }
        //  }
         Arrays.sort(reversedwords);
         System.out.println("------------");
         for(String word:reversedwords)
         System.out.println(word);

    }
}
