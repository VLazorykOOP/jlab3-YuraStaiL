import java.util.Date;
import java.util.GregorianCalendar;


public class Engineer extends Employee {
    public Engineer() {
        super("ukraine", "noname", 18, 180, 2000.345, new GregorianCalendar().getTime());
    }

    public Engineer(String country, String name, int age, int height, double salary, Date hiredate) {
        super(country, name, age, height, salary, hiredate);
    }

    @Override
    public String show() {
        return super.show();
    }
}
