public class Student {

    private String name;
    private String age;
    private String sex;
    int degree;
    // Public constructor
    public Student() {
    }

    // default constructor
    Student(String name) {
        this.name = name;
    }

    Student(String age,String sex) {
        this.age = age;
        this.sex = sex;
        degree = 40;
    }

    // private constructor
    private Student(int age,int sex) {

    }

    static Student instance = null;
    static public Student getInstance()
    {
        if (instance == null) {
            instance = new Student(1,4);
        }
        return instance;
    }


}
