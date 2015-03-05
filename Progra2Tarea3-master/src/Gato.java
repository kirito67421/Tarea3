
// aqui le heredo de gato
public class Gato extends Animal {

	// aqui en constructor de Gato
	Gato(String nombre, int edad)
	{
		super(nombre,edad);
	}
	
	//con este envio el Maullido
	void maullar(){
		System.out.println("miauuuu");
	}

}