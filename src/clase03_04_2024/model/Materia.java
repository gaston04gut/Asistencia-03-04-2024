package clase03_04_2024.model;

public class Materia {
	private String codigo;
	private String nombreMateria;
	
	public Materia() {
		// TODO Auto-generated constructor stub
	}

	public Materia(String codigo, String nombreMateria) {
		super();
		this.codigo = codigo;
		this.nombreMateria = nombreMateria;
	}
	
	

	@Override
	public String toString() {
		return "codigo: " + codigo + ", Nombre de Materia: " + nombreMateria;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombreMateria() {
		return nombreMateria;
	}

	public void setNombreMateria(String nombreMateria) {
		this.nombreMateria = nombreMateria;
	}
	
	
	
}
