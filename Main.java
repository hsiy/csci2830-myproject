import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
		ArrayList<Course> courses = new ArrayList<Course>();
		Course c;

		c = new Course(0, "CSCI 2830", "OO Software Engineering Fundamentals");
		c.setName("OO SE Fundamentals");
        for(Integer i = 0; i < 10; i++) {
            Student s = new Student(i,"Student"+i.toString());
			c.addStudent(s);
        }
		
		for (Student s : c.getStudents()) {
			System.out.println(s.toString());
		}
		courses.add(c);
		
		c = new Course(0, "CSCI 3320", "Data Structures");
        for(Integer i = 10; i < 25; i++) {
            Student s = new Student(i,"Student"+i.toString());
			c.addStudent(s);
        }
		
		for (Student s : c.getStudents()) {
			System.out.println(s.toString());
		}
		courses.add(c);
		
		for (Course course : courses) {
			System.out.println("Students in " + course.getName() + ": " + course.getClassSize().toString());
		}
		
		System.out.println("Total number of students: " + Student.getNumStudents().toString());
    }
}