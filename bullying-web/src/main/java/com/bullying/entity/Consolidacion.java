package com.bullying.entity;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@javax.persistence.Entity
public class Consolidacion implements Entity
{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long id;
	
	@Basic(optional = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecha;

	@Column(length = 200, nullable = false)
	private String nombre;
	
	@Column(length = 200, nullable = false)
	private String apellidos;
	
	@Column(length = 200)
	private String telefono;
	
	@Column(length = 500)
	private String direccion;
	
	@Column(length = 200)
	private String ciudad;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaCumpleanhos;
	
	@Column(length = 1, nullable = false)
	private String sexo;
	
	@Column(length = 150)
	private String email;
	
	@Column(length = 400)
	private String invitadoPor;



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public Date getFecha() {
		return fecha;
	}



	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getApellidos() {
		return apellidos;
	}



	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}



	public String getDireccion() {
		return direccion;
	}



	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}



	public String getCiudad() {
		return ciudad;
	}



	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}



	public Date getFechaCumpleanhos() {
		return fechaCumpleanhos;
	}



	public void setFechaCumpleanhos(Date fechaCumpleanhos) {
		this.fechaCumpleanhos = fechaCumpleanhos;
	}



	public String getSexo() {
		return sexo;
	}



	public void setSexo(String sexo) {
		this.sexo = sexo;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getInvitadoPor() {
		return invitadoPor;
	}



	public void setInvitadoPor(String invitadoPor) {
		this.invitadoPor = invitadoPor;
	}



	public String getTelefono() {
		return telefono;
	}



	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}



	

}