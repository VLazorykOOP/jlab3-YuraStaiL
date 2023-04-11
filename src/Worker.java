import java.util.Date;
import java.util.GregorianCalendar;
import java.text.DecimalFormat;

public class Worker extends Person{
    private String country;
    private String name;
    private String education;
    private int age;
    private int height;
    private double salary;
    private Date hiredate;
    private static final DecimalFormat df = new DecimalFormat("0.00");

    public Worker() {
        this("ukraine", "noname", 18, 180, 1000.345, new GregorianCalendar().getTime());
    }

    public Worker(String country, String name, int age, int height, double salary, Date hiredate) {
        this.country = country;
        this.name = name;
        this.education = "secondary special education";
        this.age = age;
        this.height = height;
        this.country = country;
        this.salary = salary;
        this.hiredate = hiredate;
    }

    @Override
    public String show() {
        return super.show() +
                "\nsalary = " + df.format(salary) +
                "\nhiredate = " + hiredate;
    }
}
