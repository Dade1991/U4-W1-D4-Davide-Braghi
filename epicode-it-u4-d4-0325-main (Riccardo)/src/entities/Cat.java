package entities;

import interfaces.Jumper;

public class Cat extends Animal implements Jumper {
	// Cat è FIGLIA di Animal
	// Significa che eredita tutti gli attributi ed i metodi dal padre
	// Però possiamo scegliere di aggiungere anche ulteriori attributi e metodi SPECIFICI DEI GATTI
	// Quindi saranno di proprietà esclusiva della classe Cat

	// Lista attributi esclusiva di Cat
	private boolean hasBoots;

	// Lista costruttori
	public Cat(String name, int age, boolean hasBoots) {
		super(name, age);
		this.hasBoots = hasBoots;
	}

	@Override
	public void getInfo() {
		System.out.println("Ciao sono un gatto");
		System.out.println("Il mio nome é: " + this.name);
		System.out.println("La mia età è: " + this.age);
		System.out.println("Ho gli stivali? " + this.hasBoots);
	}

	@Override // Non obbligatorio usare l'annotazione @Override ma straconsigliata
	public void sayYourName() {
		super.sayYourName();
		System.out.println("Per essere più precisi sono un gatto");
	}

	public void sayYourName(String saluto) { // OVERLOAD DI METODO
		this.sayYourName();
		System.out.println(saluto);
	}

	// Lista metodi esclusivi dei Cat
	public void meow() {
		System.out.println("MIAO!");
	}

	public boolean isHasBoots() {
		return hasBoots;
	}

	public void setHasBoots(boolean hasBoots) {
		this.hasBoots = hasBoots;
	}

	@Override
	public String toString() {
		return "Cat{" +
				"hasBoots=" + hasBoots +
				", name=" + name +
				", age=" + age +
				"} ";
	}

	@Override
	public void jump(int cm) {
		System.out.println("Ciao sono un gatto e ora salterò " + cm + " cm");
	}
}
