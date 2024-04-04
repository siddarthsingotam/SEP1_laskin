package laskin;

public class Laskin {

    private double result;

    public void setZero() {
        result = 0;
    }

    public double returnResult() {
        return result;
    }

    public void add(double n) {
        result = result + n;
    }

    public void subtract(double n) {
        result = result - n;
    }

    public void product(double n) {
        result = result * n;
    }

    public void divide(double n) {
        if (n == 0) {
            throw new IllegalArgumentException("not possible to divide to zero ");
        }
        result = result / n;
    }

    public void quadrilateral(double n) {
        result = n * n;
    }

    public void squareroot(double n) {
        if (n < 0) {
            throw new IllegalArgumentException("Negative value!");
        }
        result = Math.sqrt(n);
    }

    public void currentON() {
        // Tähän voisi laittaa alkutoimet
        result = 0;
    }

    public void currentOFF() {
        // Tähän voisi laittaa lopputoimet
    }
}
