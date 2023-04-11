public class ComplexInter implements PairInterface {
    private double real; // Реальна частина
    private double imaginary; // Уявна частина

    // Конструктор
    public ComplexInter(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Реалізація арифметичних операцій для комплексних чисел
    @Override
    public PairInterface add(PairInterface other) {
        ComplexInter c = (ComplexInter) other;
        return new ComplexInter(this.real + c.real, this.imaginary + c.imaginary);
    }

    @Override
    public PairInterface subtract(PairInterface other) {
        ComplexInter c = (ComplexInter) other;
        return new ComplexInter(this.real - c.real, this.imaginary - c.imaginary);
    }

    @Override
    public PairInterface multiply(PairInterface other) {
        ComplexInter c = (ComplexInter) other;
        double real = this.real * c.real - this.imaginary * c.imaginary;
        double imaginary = this.real * c.imaginary + this.imaginary * c.real;
        return new ComplexInter(real, imaginary);
    }

    @Override
    public String toString() {
        return "(" + real + "," + imaginary + ")";
    }
}