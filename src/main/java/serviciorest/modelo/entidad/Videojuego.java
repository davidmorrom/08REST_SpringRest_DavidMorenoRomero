package serviciorest.modelo.entidad;

public class Videojuego {
	private int id;
	private String nombre;
	private String compania;
	private double nota;
	
	//Constructores
	public Videojuego() {
		super();
	}

	public Videojuego(int id, String nombre, String compania, double nota) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.compania = compania;
		this.nota = nota;
	}
	
	//Getters y Setters
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getCompania() {
		return compania;
	}
	
	public void setCompania(String compania) {
		this.compania = compania;
	}
	
	public double getNota() {
		return nota;
	}
	
	public void setNota(double nota) {
		this.nota = nota;
	}
	
	//Metodo toString
	@Override
	public String toString() {
		return "Videojuego [id=" + id + ", nombre=" + nombre + ", compania=" + compania + ", nota=" + nota + "]";
	}
}
