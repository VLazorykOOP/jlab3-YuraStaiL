public class Person {
    private String country;
    private String name;
    private String education;
    private int age;
    private int height;

    public Person()
    {
        this("ukraine", "noname", "none", 18, 180);
    }

    public Person(String country, String name, String education, int age, int height) {
        this.country = country;
        this.name = name;
        this.education = education;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public String show() {
        return "\nname = " +
                name + ",\ncountry = " +
                country + ",\neducation = " +
                education + ",\nage = " +
                age + "\nheight = " + height;
    }

    public String getCountry() {
        return country;
    }

    public String getEducation() {
        return education;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }
}
