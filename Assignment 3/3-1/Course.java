package homework0301;

import java.util.ArrayList;

public class Course {
	private String name;
	private int numberOfStudent = 0;
	
	ArrayList<Student> list = new ArrayList<Student>();
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getNumberOfStudent() {
		return numberOfStudent;
	}
	
	Course(String name){
		this.name = name;
	}
	
	public void registerStudent(Student student){
		if(!isFull()){
			numberOfStudent++;
		    list.add(student);
		    System.out.println(student.getName()+" registered in the "+this.getName()+" course successfully");
		}else{
			System.out.println("The class "+this.getName()+" is full, "+student.getName()+" failed to register");
		}
			
	}
	
	public void getStudent(){
		System.out.println("The students that are registered in this course:");
		for(int i=0; i<list.size();i++){
			Student s = list.get(i);
			System.out.println("name:"+s.getName()+"...id:"+s.getId());
		}
	}
	
	public boolean isFull(){
		if(this.numberOfStudent == 10){
			return true;
		}else{
			return false;
		}
	}

}
