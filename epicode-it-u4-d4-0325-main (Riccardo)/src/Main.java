import entities.*;
import interfaces.Jumper;
import interfaces.Runner;

public class Main {
	public static void main(String[] args) {
//		Animal animal = new Animal("Giorgio", 22);
//		animal.sayYourName();

		Dog d = new Dog("Rex", 2, true);
		d.bark(); // Il cane può ovviamente utilizzare metodi propri
		d.sayYourName(); // ma anche i metodi ereditati dal padre

		Cat c = new Cat("Felix", 1, true);
		c.meow(); // Il gatto può ovviamente utilizzare metodi propri
		c.sayYourName(); // ma anche i metodi ereditati dal padre


		System.out.println(d);
		System.out.println(c);

		c.sayYourName("CIAO");

		c.getInfo();
		d.getInfo();

		// ---------------------------------------------- POLIMORFISMO ------------------------------------------------------------------
		Animal[] animals = {d, c, new Cat("Tom", 1, false), new Dog("Lassie", 2, true)};
		// Array POLIMORFICO, ovvero un array misto di cani e gatti...lo posso fare perché entrambi sono ANIMAL

		for (int i = 0; i < animals.length; i++) {
			animals[i].sayYourName(); // Qua posso usare i metodi in comune tra cani e gatti (quelli definiti in Animal)
			animals[i].getInfo(); // getInfo è astratto in Animal però posso usarlo perché sono sicuro che sia cani che gatti l'hanno implmementato

			// Se volessi utilizzare invece dei metodi SPECIFICI di cane o gatto, posso farlo usando il CASTING ESPLICITO
			if (animals[i] instanceof Dog) { // Fondamentale PRIMA di usare un CAST ESPLICITO, controllare il tipo dell'elemento altrimenti potrei avere brutti errori
				Dog dog = (Dog) animals[i]; // Non posso convertire un Gatto in un Cane, mi dà un errore
				dog.bark();
			} else {
				Cat cat = (Cat) animals[i];
				cat.meow();
			}
		}

		// Altro esempio di array polimorfico
		Runner[] runners = {d, new Student("Aldo", "Baglio", true, StudentType.BACKEND)};
		for (Runner runner : runners) {
			runner.run(10);
		}

		Jumper[] jumpers = {c, new Student("Giovanni", "Storti", false, StudentType.ALTRO)};
		for (Jumper jumper : jumpers) {
			jumper.jump(100);
		}

		printAnimal(d);
		printAnimal(c);
	}

	public static void printAnimal(Animal animal) { // Mettendo Animal come tipo di parametro, potrò passare sia cani che gatti grazie al polimorfismo
		// Posso quindi creare dei metodi più versatili grazie al polimorfismo
		animal.getInfo();
	}

//	public static void printAnimal(Dog dog) { // Questo mi permette di passare cani, no gatti. Quindi è un metodo poco versatile e meno riutilizzabile
//		dog.getInfo();
//	}
}
