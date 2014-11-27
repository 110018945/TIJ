public class Burrito {
	Spiciness degree;

	public Burrito(Spiciness degree) {
		this.degree = degree;
	}

	public void describe(){
		System.out.println("this Burrito is: ");
		switch (degree){
			case NOT: 	System.out.println("Im not hot");
						break;
			case MILD: 	System.out.println("Im mild");
						break;
			case HOT: 	System.out.println("Im  hot");
						break;
			case FLAMING:System.out.println("Im  flaming");
						break;
			case MEDIUM: System.out.println("Im  medium");
						break;
			default:
						break;
		}
	}
	
	public static void main(String[] args){
		Burrito b1 = new Burrito(Spiciness.HOT);
		b1.describe();
	}
}


