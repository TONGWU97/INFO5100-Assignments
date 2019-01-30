package homework0302;

public class Test {
	public static void main(String[] args) {
		PsychiatristObject p = new PsychiatristObject();
		MoodyObject happyObject = new HappyObject();
		MoodyObject sadObject = new SadObject();
		
		p.examine(happyObject);
		p.observe(happyObject);
		p.examine(sadObject);
		p.observe(sadObject);
	}
}
