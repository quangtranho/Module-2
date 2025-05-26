package ss5_Access_modifier;

public class Student {
    private String name;
    private String classes;
    public Student() {
        this.name = "John";
        this.classes = "CO2";
    }
    public String getName() {
        return name;
    }
    public String getClasses() {
        return classes;
    }
    public String setName(String name) {
        return this.name = name;
    }
    public String setClasses(String classes) {
        return this.classes = classes;
    }

    public static void main(String[] args) {
        Student student1 = new Student();
        System.out.println(student1.getName());
        System.out.println(student1.getClasses());
        Student student2 = new Student();
        System.out.println(student2.setName("Quang"));
        System.out.println(student2.setClasses("C0225L1"));
    }
}
