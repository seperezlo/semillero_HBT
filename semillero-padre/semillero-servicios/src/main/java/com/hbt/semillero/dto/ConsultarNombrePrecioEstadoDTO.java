package com.hbt.semillero.dto;

import java.math.BigDecimal;

import com.hbt.semillero.enums.EstadoEnum;

/**
 * 
 * <b>Descripción:<b> Clase que implemneta un servicio para consultar nombre, precio y el estado de un comic
 * <b>Caso de Uso:<b> semillero 2021
 * @author SEDIEL
 * @version
 */
public class ConsultarNombrePrecioEstadoDTO extends ResultadoDTO {

	/**
	 * Atributo que determina  
	 */
	private static final long serialVersionUID = 1L;
	
	private String nombre;
	private BigDecimal precio;
	private EstadoEnum estadoEnum;
	
	
	public ConsultarNombrePrecioEstadoDTO() {
		//constructor vacio
	}
	
	/**
	 * 
	 * Constructor de la clase ConsultarNombrePrecioEstadoDTO
	 * @param exitoso
	 * @param mensajeEjecucion
	 * @param nombre
	 * @param precio
	 * @param estadoEnum
	 */
	public ConsultarNombrePrecioEstadoDTO( String nombre, BigDecimal precio, EstadoEnum estadoEnum) {
		this.nombre = nombre;
		this.precio = precio;
		this.estadoEnum = estadoEnum;
	}

	/**
	 * Metodo encargado de retornar el valor del atributo nombre
	 * @return El nombre asociado a la clase
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Metodo encargado de modificar el valor del atributo nombre
	 * @param nombre El nuevo nombre a modificar.
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Metodo encargado de retornar el valor del atributo precio
	 * @return El precio asociado a la clase
	 */
	public BigDecimal getPrecio() {
		return precio;
	}

	/**
	 * Metodo encargado de modificar el valor del atributo precio
	 * @param precio El nuevo precio a modificar.
	 */
	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	/**
	 * Metodo encargado de retornar el valor del atributo estadoEnum
	 * @return El estadoEnum asociado a la clase
	 */
	public EstadoEnum getEstadoEnum() {
		return estadoEnum;
	}

	/**
	 * Metodo encargado de modificar el valor del atributo estadoEnum
	 * @param estadoEnum El nuevo estadoEnum a modificar.
	 */
	public void setEstadoEnum(EstadoEnum estadoEnum) {
		this.estadoEnum = estadoEnum;
	}
	
	

}
