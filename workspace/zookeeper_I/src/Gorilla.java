
public class Gorilla extends Mammal {
	public Gorilla() {
		
	}
	public void throwSomething() {
		this.energy -=10;
		System.out.println("Throwing somethings ");
	}
	public void eatBananas() {
		this.energy +=5;
		System.out.println("Eat Banana ");
	}
	public void climb() {
		this.energy -=10;
		System.out.println("Climbing treess");
	}
}

