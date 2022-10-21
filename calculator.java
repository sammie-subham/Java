import java.util.*;

public class calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int f_num = sc.nextInt();
        System.out.println("Enter second number");
        int s_num = sc.nextInt();

        int add = f_num+s_num;
        int mul = f_num*s_num;
        int sub = f_num-s_num;
        int div = f_num/s_num;
        int rem = f_num%s_num;

        System.out.println("Addition "+add+", Multiplication "+mul+", Subtraction "+sub+", Division "+div+", Remainder "+rem);
        sc.close();
    }
}
