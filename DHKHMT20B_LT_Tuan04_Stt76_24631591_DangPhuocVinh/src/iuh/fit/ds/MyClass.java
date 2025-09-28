package iuh.fit.ds;

public class MyClass {
    public float foo(int a, int b, int c, int d) {
        float e;
        if (a == 0)
            return 0;
        int x = 0;
        if ((a == b) || (c == d))
            x = 1;
        e = 1 / x;   
        return e;
    }
}
