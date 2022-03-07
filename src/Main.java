import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Fibo f = new Fibo();
        Scanner p = new Scanner(System.in);

        int count;
        count = p.nextInt();

        for(int i = 0; i < count; i++) {
            f.n = p.nextInt();
            f.x = -1;
            f.fibonacci(f.n);

            System.out.println("fib(" + f.n + ") = " + f.x + " calls = " + f.fibonacci(f.n));
        }
    }
}
