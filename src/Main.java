import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {

    public static void main(String[] args) {
        System.out.println(" Lab 3");

        System.out.println("Task 1");
        Person person = new Person("USA", "John", "Higner", 22, 182);
        Worker worker = new Worker("Italy", "Alex", 32, 160, 1700, new GregorianCalendar(2022, Calendar.MAY, 11).getTime());
        Employee employee = new Employee();
        Engineer engineer = new Engineer();

        Person[] people = {person, worker, employee, engineer};

        for (int i = 0; i < 4; i++) {
            System.out.println(people[i].show());
        }

        System.out.println("\nTask 2");
        Complex c1 = new Complex(1, 2);
        Complex c2 = new Complex(3, 4);
        Complex c3 = c1.add(c2); // (1 + 2i) + (3 + 4i) = 4 + 6i
        Complex c4 = c1.subtract(c2); // (1 + 2i) - (3 + 4i) = -2 - 2i
        Complex c5 = c1.multiply(c2); // (1 + 2i) * (3 + 4i) = -5 + 10i
        System.out.println(c3); // виведе: (4.0,6.0)
        System.out.println(c4); // виведе: (-2.0,-2.0)
        System.out.println(c5); // виведе: (-5.0,10.0)

        // Тести для раціональних дробів
        Rational r1 = new Rational(1, 2);
        Rational r2 = new Rational(3, 4);
        Rational r3 = r1.add(r2); // 1/2 + 3/4 = 10/8
        Rational r4 = r1.subtract(r2); // 1/2 - 3/4 = -2/8
        Rational r5 = r1.multiply(r2); // 1/2 * 3/4 = 3/8
        System.out.println(r3);
        System.out.println(r4);
        System.out.println(r5);

        System.out.println("\nTask 3");
        PairInterface ci1 = new ComplexInter(1, 2);
        PairInterface ci2 = new ComplexInter(3, 4);
        PairInterface ci3 = ci1.add(ci2); // (1 + 2i) + (3 + 4i) = 4 + 6i
        PairInterface ci4 = ci1.subtract(ci2); // (1 + 2i) - (3 + 4i) = -2 - 2i
        PairInterface ci5 = ci1.multiply(ci2); // (1 + 2i) * (3 + 4i) = -5 + 10i
        System.out.println(ci3); // виведе: (4.0,6.0)
        System.out.println(ci4); // виведе: (-2.0,-2.0)
        System.out.println(ci5); // виведе: (-5.0,10.0)

        // Тести для раціональних дробів
        PairInterface ri1 = new RationalInter(1, 2);
        PairInterface ri2 = new RationalInter(3, 4);
        PairInterface ri3 = ri1.add(ri2); // 1/2 + 3/4 = 10/8
        PairInterface ri4 = ri1.subtract(ri2); // 1/2 - 3/4 = -2/8
        PairInterface ri5 = ri1.multiply(ri2); // 1/2 * 3/4 = 3/8
        System.out.println(ri3);
        System.out.println(ri4);
        System.out.println(ri5);
    }
}
