package cast;

public class MainClass {

	public static void main(String[] args) {
		Mammal m1 = new Cat();
		Mammal m2 = new Dog();
		Mammal m3 = new Mammal();
		System.out.println(m1.getClass().getName());
		System.out.println(m2.getClass().getName());
		//System.out.println(m3.getClass().getName());
		if ( m2 instanceof Cat) {
           Cat c = (Cat)m2;
		} else {
			System.out.println("m2 is not a Cat.");
		}
		if ( m1 instanceof Dog) {
			Dog d = (Dog)m1;
		} else {
			System.out.println("m1 is not a Dog.");
		}        
	}
}
