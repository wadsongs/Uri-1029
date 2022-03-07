public class Fibo {
    int n;
    int x = -1;

    public int fibonacci (int n) {
        x++;
        if (n < 2) {

            return n;
        } else {

            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
