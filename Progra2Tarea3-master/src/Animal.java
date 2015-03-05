
public class Animal {
String nombre;
int edad;

// aqui el constructor
Animal (String nombre, int edad){
	this.nombre= nombre;
	this.edad= edad;
	
}

//el get del nombre
String getNombre(){
	return nombre;
}

// el get de la edad
int getEdad(){
	return edad;
}

//el set del nombre
void setNombre(String nombre){
	this.nombre=nombre;
}

//el set de la edad
void setEdad(int edad){
	this.edad=edad;
}

}

