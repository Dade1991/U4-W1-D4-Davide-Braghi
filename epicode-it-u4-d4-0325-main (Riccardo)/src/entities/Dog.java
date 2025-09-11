package entities;

import interfaces.Runner;

public class Dog extends Animal implements Runner {

	// Dog è FIGLIA di Animal
	// Significa che eredita tutti gli attributi ed i metodi dal padre
	// Però possiamo scegliere di aggiungere anche ulteriori attributi e metodi SPECIFICI DEI CANI
	// Quindi saranno di proprietà esclusiva della classe Dog

	// Lista attributi esclusivi del Dog
	private boolean isACop;

	// Lista costruttori
	public Dog(String name, int age) {
		super(name, age); // Richiamiamo il costruttore del padre
		this.isACop = false;
	}

	public Dog(String name, int age, boolean isACop) { // OVERLOAD DI COSTRUTTORE
		super(name, age); // Richiamiamo il costruttore del padre
		this.isACop = isACop;
	}

	@Override
	public void getInfo() {
		System.out.println("Ciao sono un cane");
		System.out.println("Il mio nome é: " + this.name);
		System.out.println("La mia età è: " + this.age);
		System.out.println("Sono un cane poliziotto? " + this.isACop);
	}

	// Lista metodi esclusivi dei Dog
	public void bark() {
		System.out.println("BAU!");
	}

	public boolean isACop() {
		return isACop;
	}

	public void setACop(boolean ACop) {
		isACop = ACop;
	}

	@Override
	public String toString() {
		return "Dog{" +
				"isACop=" + isACop +
				", name=" + super.getName() +
				", age=" + super.getAge() +
				"} ";
	}

	@Override
	public void run(int km) {
		System.out.println("Ciao sono un cane e correrò per " + km + " km");
	}
}
