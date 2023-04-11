public class Student {
	private static Integer numStudents = 0;
    private int id;
    private String name;

    public Student(Integer id, String name) {
        this.id = id;
        this.name = name;
		numStudents++;
    }
	
	public String toString() {
		return name;
	}
	
	public static Integer getNumStudents() {
		return numStudents;
	}
}

