package com.myspace.gestcredito.modelo;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class persona implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("primer nombre")
	private java.lang.String primerNombre;
	@org.kie.api.definition.type.Label("segundo nombre")
	private java.lang.String segundoNombre;
	@org.kie.api.definition.type.Label("primer apellido")
	private java.lang.String primerApellido;
	@org.kie.api.definition.type.Label("segundo apellido")
	private java.lang.String segundoApellido;
	@org.kie.api.definition.type.Label("tipo documento")
	private java.lang.String tipoDocumento;
	@org.kie.api.definition.type.Label("numero documento")
	private java.lang.String numDocumenteo;
	@org.kie.api.definition.type.Label("fecha nacimiento")
	private java.util.Date fechaNacimiento;

	@org.kie.api.definition.type.Label(value = "edad")
	private int edad;

	public persona() {
	}

	public java.lang.String getPrimerNombre() {
		return this.primerNombre;
	}

	public void setPrimerNombre(java.lang.String primerNombre) {
		this.primerNombre = primerNombre;
	}

	public java.lang.String getSegundoNombre() {
		return this.segundoNombre;
	}

	public void setSegundoNombre(java.lang.String segundoNombre) {
		this.segundoNombre = segundoNombre;
	}

	public java.lang.String getPrimerApellido() {
		return this.primerApellido;
	}

	public void setPrimerApellido(java.lang.String primerApellido) {
		this.primerApellido = primerApellido;
	}

	public java.lang.String getSegundoApellido() {
		return this.segundoApellido;
	}

	public void setSegundoApellido(java.lang.String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	public java.lang.String getTipoDocumento() {
		return this.tipoDocumento;
	}

	public void setTipoDocumento(java.lang.String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public java.lang.String getNumDocumenteo() {
		return this.numDocumenteo;
	}

	public void setNumDocumenteo(java.lang.String numDocumenteo) {
		this.numDocumenteo = numDocumenteo;
	}

	public java.util.Date getFechaNacimiento() {
		return this.fechaNacimiento;
	}

	public void setFechaNacimiento(java.util.Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public int getEdad() {
		return this.edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public persona(java.lang.String primerNombre,
			java.lang.String segundoNombre, java.lang.String primerApellido,
			java.lang.String segundoApellido, java.lang.String tipoDocumento,
			java.lang.String numDocumenteo, java.util.Date fechaNacimiento,
			int edad) {
		this.primerNombre = primerNombre;
		this.segundoNombre = segundoNombre;
		this.primerApellido = primerApellido;
		this.segundoApellido = segundoApellido;
		this.tipoDocumento = tipoDocumento;
		this.numDocumenteo = numDocumenteo;
		this.fechaNacimiento = fechaNacimiento;
		this.edad = edad;
	}

}