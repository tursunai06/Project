package Model;

public class Student {
    private String fullName;
    private int age;
    private Gender gender;

    private int id;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Student(String fullName, int age, Gender gender, int id) {
        this.fullName = fullName;
        this.age = age;
        this.gender = gender;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", id=" + id +
                '}';
    }
}