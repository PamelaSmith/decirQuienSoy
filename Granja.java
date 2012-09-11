public class Granja {
	public static void main(String[] args) {
	perro p = new perro ();
	System.out.println("Saludando"+ p.DecirQuienSoy());//perro
	Gato g = new Gato ();
	System.out.println("Saludando"+ g.DecirQuienSoy());// gato
	Gallina n = new Gallina ();
	System.out.println("Saludando"+ n.DecirQuienSoy());
	}
}