import java.util.*;
public class fibonacii{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int[] b = new int[a+1];
        System.out.println(fibo(a,b));
    }
    static int fibo(int n,int[] qb){
        if(n==0||n==1){
            return n;
        }
        if(qb[n]!=0){
            return qb[n];
        }
        int fib1 = fibo(n-1,qb);
        int fib2 = fibo(n-2, qb);
        int fibnn = fib1 + fib2;

        qb[n] = fibnn;
        return fibnn;
    }
}