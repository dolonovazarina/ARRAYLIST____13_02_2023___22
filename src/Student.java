public class Student {
    private String name;
    private double age;


    public Student(String name, double age) throws Exception {
        this.name = name;
        if (age < 0) {
            throw new Exception(" Jash noldon kichine san bolboit ");
        } else {
            this.age = age;
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }
}

