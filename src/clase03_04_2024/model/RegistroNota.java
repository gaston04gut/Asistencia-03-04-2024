package clase03_04_2024.model;

public class RegistroNota {
	private String codigo;
	private Alumno alumno;
	private Materia materia;
	private Float notaFinal;
	
	public RegistroNota() {
		// TODO Auto-generated constructor stub
	}

	public RegistroNota(String codigo, Alumno alumno, Materia materia, Float notaFinal) {
		super();
		this.codigo = codigo;
		this.alumno = alumno;
		this.materia = materia;
		this.notaFinal = notaFinal;
	}

	
	
	@Override
	public String toString() {
		return "Registro de Nota:\nCodigo Del Registro de la Nota: " + codigo + "\nAlumno: " + alumno + "\nMateria: " + materia + ", NotaFinal: "+ notaFinal + "\n";
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Alumno getAlumno() {
		return alumno;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}

	public Materia getMateria() {
		return materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}

	public Float getNotaFinal() {
		return notaFinal;
	}

	public void setNotaFinal(Float notaFinal) {
		this.notaFinal = notaFinal;
	}
	
	
	
	
}
