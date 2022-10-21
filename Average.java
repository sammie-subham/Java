import java.util.*;

class Average{
    int fn,sn,tn;
    public void calculate(){

        int avg = (fn+sn+tn)/3;
        System.out.println("Average is "+avg);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        Average avg = new Average();
        avg.fn = sc.nextInt();
        avg.sn = sc.nextInt();
        avg.tn = sc.nextInt();
        avg.calculate();
    }
}