package Day1;
public class TwoNumOp {
    public static void main(String args[]){
        int num1=Integer.parseInt(args[0]);
        int num2=Integer.parseInt(args[1]);
        String s=args[2];
       // System.out.println(args[2].getClass());
        switch(s){
            case "+":System.out.println(num1+num2); break;
            case "-":System.out.println(num1-num2); break;
            case "%":System.out.println(num1%num2); break;
            case "/":System.out.println(num1/num2); break;
            case "^":System.out.println(num1*num2); break;
            default:System.out.println("Invalid operator");
        }
    }
}
