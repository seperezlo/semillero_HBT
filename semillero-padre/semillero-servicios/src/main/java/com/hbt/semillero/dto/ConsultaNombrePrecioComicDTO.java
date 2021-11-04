package com.hbt.semillero.dto;

import java.math.BigDecimal;
/**
 * 
 * <b>Descripción:<b> Clase que implementa la creacion del servicio ConsultaNombrePrecioComicDTO
 * <b>Caso de Uso:<b>semillero 2021 
 * @author SEDIEL
 * @version
 */

public class ConsultaNombrePrecioComicDTO extends ResultadoDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// atributo llamado nombre 
	private String nombre;
	//atributo llamado precio 
	private BigDecimal precio;
	
	public ConsultaNombrePrecioComicDTO() {
		//Constructor vacio
	}
	// contructor de la clase ConsultaNombrePrecioComicDTO con los parametros 
	public ConsultaNombrePrecioComicDTO(String nombre, BigDecimal precio) {
		this.nombre = nombre;
		this.precio = precio;
	}
	// se crean los metodos  get  y los set para los atributos anteriores 
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public BigDecimal getPrecio() {
		return precio;
	}
	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}
}
