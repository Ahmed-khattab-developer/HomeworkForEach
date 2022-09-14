public class Main {


    public static void main(String[] args) {

        Student st = new Student();
        Student st2 = new Student("ahmed");
        Student st3 = new Student("ahmed","male");
        Student st4 = new Student("ahmed","male");
        Student st5 = new Student("ahmed","male");

        System.out.println(st3.degree);
        System.out.println(st4.degree);
        System.out.println(st5.degree);


        Student a = Student.getInstance();
        Student b = Student.getInstance();
    }

}