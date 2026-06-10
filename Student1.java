public class Student1 {
    // Field Declarations
    String name;
    int age;
    double marks;
    static int count = 0;

    // Method to set details
    public void setDetails(String n, int a, double m) {
        name = n;
        age = a;
        marks = m;
        count++;
    }

    // Getter method
    public String getName() {
        return name;
    }

    // Display method
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age + ", Marks: " + marks);
    }
}