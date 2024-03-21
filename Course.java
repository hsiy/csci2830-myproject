import java.util.ArrayList;

public class Course {
    private Integer id;
    private String name;
    private String title;
	private ArrayList<Student> students; // information hiding
	private Integer classSize; 

	public Course(Integer id, String name, String title) {
        this.id = id;
        this.name = name;
        this.title = title;
		this.students = new ArrayList<Student>();
		this.classSize = 0;
    }
	

	public void addStudent(Student s) {
		students.add(s);
		classSize++;
	}
	
	public ArrayList<Student> getStudents() {
		return students;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Integer getClassSize() {
		return classSize;
	}

}

