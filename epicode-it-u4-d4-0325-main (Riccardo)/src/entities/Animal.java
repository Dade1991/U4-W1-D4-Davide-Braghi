package entities;

public abstract class Animal {
	// La classe Animal sarà la SUPERCLASSE
	// In questa classe andremo ad inserire tutte le caratteristiche comuni a tutti gli animali
	// Se dichiaro la classe come ABSTRACT, essa continuerà a fungere da padre per i figli
	// però non potrò creare oggetti di tipo Animal (il che può essere una scelta sensata in quanto Animal
	// è un concetto troppo generico)

	protected int age; // Protected significa che i figli hanno accesso diretto a questo attributo
	// Lista attributi
	String name; // Package-Friendly. Se non metto nè public nè private nè protected, tutti quelli che sono nello stesso
	// package possono accedere a questo attributo

	// Lista costruttori
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// Lista metodi
	// Le classi ASTRATTE possono avere sia METODI CONCRETI che ASTRATTI

	// Metodi astratti
	// Un metodo astratto è un metodo "vuoto", cioè non ha un body
	// Un metodo astratto serve per obbligare i figli ad avere quel metodo
	// senza dire ai figli però come quel metodo debba comportarsi
	// Ogni figlio avrà la libertà di scegliere come implementare questo metodo
	// Serve per avere certezza al 100% che i figli possiedano questo metodo senza obbligarli
	// però ad avere un comportamento specifico, ognuno lo deciderà autonomamente
	public abstract void getInfo();

	// Metodi concreti
	public void sayYourName() {
		System.out.println("Ciao sono un animale e mi chiamo " + this.name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Animal{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}
}
