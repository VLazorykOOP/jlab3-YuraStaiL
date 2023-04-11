import java.util.Date;
import java.util.GregorianCalendar;
import java.text.DecimalFormat;
import java.math.RoundingMode;

public class Employee extends Person{
    private final String country;
    private final String name;
    private final String education;
    private final int age;
    private final int height;
    private final double salary;
    private final Date hiredate;

    private static final DecimalFormat df = new DecimalFormat("0.00");

    public Employee() {
        this("ukraine", "noname", 18, 180, 1000.345, new GregorianCalendar().getTime());
    }

    public Employee(String country, String name, int age, int height, double salary, Date hiredate) {
        this.country = country;
        this.name = name;
        this.education = "higher education";
        this.age = age;
        this.height = height;
        this.salary = salary;
        this.hiredate = hiredate;
    }

    @Override
    public String show() {
        df.setRoundingMode(RoundingMode.DOWN);
        return super.show() +
                "\nsalary = " + df.format(salary) +
                "\nhiredate = " + hiredate;
    }
}
