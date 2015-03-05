
// aqui le heredo de animal
public class Loro extends Animal {

	// aqui en constructor del loro
	Loro(String nombre, int edad)
	{
		super(nombre, edad);
	}
	
	//con este envio el habra
	void hablar(){
		System.out.println("Soy un loro, y me gusta hablar");
	}

}