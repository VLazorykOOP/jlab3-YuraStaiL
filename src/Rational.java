public class Rational extends Pair {
    private int numerator; // Чисельник
    private int denominator; // Знаменник

    // Конструктор
    public Rational(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    // Реалізація арифметичних операцій для раціональних дробів
    @Override
    public Rational add(Pair other) {
        Rational r = (Rational) other;
        int numerator = this.numerator * r.denominator + r.numerator * this.denominator;
        int denominator = this.denominator * r.denominator;
        return new Rational(numerator, denominator);
    }

    @Override
    public Rational subtract(Pair other) {
        Rational r = (Rational) other;
        int numerator = this.numerator * r.denominator - r.numerator * this.denominator;
        int denominator = this.denominator * r.denominator;
        return new Rational(numerator, denominator);
    }

    @Override
    public Rational multiply(Pair other) {
        Rational r = (Rational) other;
        int numerator = this.numerator * r.numerator;
        int denominator = this.denominator * r.denominator;
        return new Rational(numerator, denominator);
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}