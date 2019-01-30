package homework0301;

public class Test {
	public static void main(String[] args) {
		Course c1 = new Course("Java");
		Course c2 = new Course("Web Design");
		Course c3 = new Course("Co-op");
		Course c4 = new Course("Language & Speaking");
		
		Student s1 = new Student("Phoenix","NEU0001");
		Student s2 = new Student("Jason","NEU0002");
		Student s3 = new Student("Alex","NEU0003");
		Student s4 = new Student("Lee","NEU0004");
		Student s5 = new Student("Steven","NEU0005");
		Student s6 = new Student("Jeremy","NEU0006");
		Student s7 = new Student("Kitty","NEU0007");
		Student s8 = new Student("Kelsey","NEU0008");
		Student s9 = new Student("April","NEU0009");
		Student s10 = new Student("Siva","NEU0010");
		Student s11 = new Student("Megan","NEU0011");
		
		System.out.println("==============================================================");
		
		c1.registerStudent(s1);
		c1.registerStudent(s2);
		c1.registerStudent(s3);
		c1.registerStudent(s4);
		c1.registerStudent(s5);
		c1.registerStudent(s6);
		c1.registerStudent(s7);
		c1.registerStudent(s8);
		c1.registerStudent(s9);
		c1.registerStudent(s10);
		c1.registerStudent(s11);
		
		System.out.println("==============================================================");
		
		c1.getStudent();
		
		System.out.println("==============================================================");
		
		
	}
}
