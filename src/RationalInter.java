public class RationalInter implements PairInterface {
    private int numerator; // Чисельник
    private int denominator; // Знаменник

    // Конструктор
    public RationalInter(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    // Реалізація арифметичних операцій для раціональних дробів

    public PairInterface add(PairInterface other) {
        RationalInter r = (RationalInter) other;
        int numerator = this.numerator * r.denominator + r.numerator * this.denominator;
        int denominator = this.denominator * r.denominator;
        return new RationalInter(numerator, denominator);
    }

    public PairInterface subtract(PairInterface other) {
        RationalInter r = (RationalInter) other;
        int numerator = this.numerator * r.denominator - r.numerator * this.denominator;
        int denominator = this.denominator * r.denominator;
        return new RationalInter(numerator, denominator);
    }

    public PairInterface multiply(PairInterface other) {
        RationalInter r = (RationalInter) other;
        int numerator = this.numerator * r.numerator;
        int denominator = this.denominator * r.denominator;
        return new RationalInter(numerator, denominator);
    }

    public String toString() {
        return numerator + "/" + denominator;
    }
}