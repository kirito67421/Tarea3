
// aqui le heredo de animal
public class Perro extends Animal {

	// aqui en constructor de perro
	Perro(String nombre, int edad)
	{
		super(nombre,edad);
	}
	
	//con este envio el ladrido
	void ladrar(){
		System.out.println("guao guao guao");
	}

}