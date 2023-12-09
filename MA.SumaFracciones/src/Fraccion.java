
public class Fraccion {
    private int numerador;
    private int denominador;

    public Fraccion(int numerador, int denominador) {
        if (denominador == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero");
        }
        if (numerador < 0 && denominador < 0) {
            throw new IllegalArgumentException("Both numerator and denominator cannot be negative");
        }
        if (numerador > 0 && denominador < 0) {
            throw new IllegalArgumentException("Numerator cannot be positive when denominator is negative");
        }
        this.numerador = numerador;
        this.denominador = denominador;
        simplify(); // Manda a llamar a simplificar
    }
    
  
    public Fraccion() {
        this.numerador = 0;
        this.denominador = 1;
    }

    private void simplify() {
        int gcd = calculateGCD(numerador, denominador);
        numerador /= gcd;
        denominador /= gcd;
    }

    private int calculateGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return calculateGCD(b, a % b);
    }


    public int getNumerador() {
        return numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public Fraccion sumar(Fraccion otraFraccion) {
        int nuevoDenominador = this.denominador * otraFraccion.getDenominador();
        int nuevoNumerador = (this.numerador * otraFraccion.getDenominador()) + (otraFraccion.getNumerador() * this.denominador);
        return new Fraccion(nuevoNumerador, nuevoDenominador);
    }



    @Override
    public String toString() {
        return numerador + "/" + denominador;
    }
}
