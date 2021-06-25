package com.cursoee.vuelos.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name="vuelos")
public class Vuelo {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@JsonProperty(value="idVuelo)				// ",defaultValue = "0")
	private int idvuelo;
	private String company;
	private String fecha;
	private double precio;
	private int plazas;
	public Vuelo() {
		super();
	}
	public Vuelo(int idVuelo, String company, String fecha, double precio, int plazas) {
		super();
		this.idvuelo = idvuelo;
		this.company = company;
		this.fecha = fecha;
		this.precio = precio;
		this.plazas = plazas;
	}
	public int getIdVuelo() {
		return idvuelo;
	}
	public void setIdVuelo(int idVuelo) {
		this.idvuelo = idVuelo;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getPlazas() {
		return plazas;
	}
	public void setPlazas(int plazas) {
		this.plazas = plazas;
	}

}
