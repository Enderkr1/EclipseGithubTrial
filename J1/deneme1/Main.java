package deneme1;

public class Main {

	public static void main(String[] args) {
		Person person1 = new Person("Ender",21);
		Person person2 = new Person("Arda",15);
		System.out.println(person1.getName() + " is " + person1.getAge() + " years old.");
		System.out.println(person2.getName() + " is " + person2.getAge() + " years old.");
	}

}
