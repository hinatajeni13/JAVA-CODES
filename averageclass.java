class Student {
    int rollNo;
    String name;
    String department;
    double mark1, mark2, mark3;

    // Constructor
    Student(int rollNo, String name, String department,
            double mark1, double mark2, double mark3) {
        this.rollNo = rollNo;
        this.name = name;
        this.department = department;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    // Calculate Total
    double calculateTotal() {
        return mark1 + mark2 + mark3;
    }

    // Calculate Average
    double calculateAverage() {
        return calculateTotal() / 3;
    }

    // Find Grade
    String findGrade() {
        double avg = calculateAverage();

        if (avg >= 90)
            return "A+";
        else if (avg >= 80)
            return "A";
        else if (avg >= 70)
            return "B";
        else if (avg >= 60)
            return "C";
        else if (avg >= 50)
            return "D";
        else
            return "Fail";
    }

    // Display Student Details
    void displayDetails() {
        System.out.println("----------- Student Details -----------");
        System.out.println("Roll Number : " + rollNo);
        System.out.println("Name        : " + name);
        System.out.println("Department  : " + department);
        System.out.println("Mark 1      : " + mark1);
        System.out.println("Mark 2      : " + mark2);
        System.out.println("Mark 3      : " + mark3);
        System.out.println("Total Marks : " + calculateTotal());
        System.out.println("Average     : " + calculateAverage());
        System.out.println("Grade       : " + findGrade());
    }
}

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student(101, "Arun", "Computer Science",
                                 85, 90, 88);

        Student s2 = new Student(102, "Kumar", "Information Technology",
                                 78, 82, 80);

        s1.displayDetails();
        System.out.println();

        s2.displayDetails();
    }
}
