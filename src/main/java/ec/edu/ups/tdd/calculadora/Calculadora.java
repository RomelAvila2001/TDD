package ec.edu.ups.tdd.calculadora;

public class Calculadora {
    private int ans;

    public int addition(int a, int b) {
        return a+b;
    }

    public int resta(int a, int b) {
        return a-b;
    }

    public int divicion(int a, int b) {
        return a/b;
    }

    public int multiplicacion(int a, int b) {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return a*b;
    }

    public int getAns() {
        return ans;
    }

    public void setAns(int ans) {
        this.ans = ans;
    }
}
