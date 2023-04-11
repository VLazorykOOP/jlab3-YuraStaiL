public class Complex extends Pair {
    private double real; // Реальна частина
    private double imaginary; // Уявна частина

    // Конструктор
    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Реалізація арифметичних операцій для комплексних чисел
    @Override
    public Complex add(Pair other) {
        Complex c = (Complex) other;
        return new Complex(this.real + c.real, this.imaginary + c.imaginary);
    }

    @Override
    public Complex subtract(Pair other) {
        Complex c = (Complex) other;
        return new Complex(this.real - c.real, this.imaginary - c.imaginary);
    }

    @Override
    public Complex multiply(Pair other) {
        Complex c = (Complex) other;
        double real = this.real * c.real - this.imaginary * c.imaginary;
        double imaginary = this.real * c.imaginary + this.imaginary * c.real;
        return new Complex(real, imaginary);
    }

    @Override
    public String toString() {
        return "(" + real + "," + imaginary + ")";
    }
}