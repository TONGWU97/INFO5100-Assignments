package homework0302;

public class PsychiatristObject {
	//ask a moody object about its mood
	public void examine(MoodyObject moodyObject){
		System.out.println("How are you feeling today?");
		moodyObject.queryMood();
		System.out.println();
	}
	
	//a moodyObject is observed to either laugh or cry
	public void observe(MoodyObject moodyObject){
		moodyObject.expressFeelings();
		System.out.println("Observation: "+ moodyObject);
		System.out.println();
	}
}
