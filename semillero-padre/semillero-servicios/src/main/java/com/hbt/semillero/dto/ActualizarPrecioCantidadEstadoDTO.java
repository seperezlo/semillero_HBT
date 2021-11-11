package com.hbt.semillero.dto;

import java.math.BigDecimal;

import com.hbt.semillero.enums.EstadoEnum;
/**
 * 
 * <b>Descripción:<b> Clase que determina los atributos para implementar un servicio DTO los atirbutos a actualizar son 
 * precio estado cantidad 
 * <b>Caso de Uso:<b> 
 * @author SEDIEL
 * @version
 */

public class ActualizarPrecioCantidadEstadoDTO extends ResultadoDTO{
	
	/**
	 * Atributo que determina  
	 */
	private static final long serialVersionUID = 1L;
	private BigDecimal precio;
	private EstadoEnum estadoEnum;
	private Long cantidad;
	
	public ActualizarPrecioCantidadEstadoDTO() {
		//constructor vacio
	}
	/**
	 * Constructor de la clase.
	 * @param precio
	 * @param estadoEnum
	 * @param cantidad
	 */
	public ActualizarPrecioCantidadEstadoDTO( BigDecimal precio,EstadoEnum estadoEnum, Long cantidad) {
		this.precio = precio;
		this.estadoEnum = estadoEnum;
		this.cantidad = cantidad;
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
	/**
	 * Metodo encargado de retornar el valor del atributo cantidad
	 * @return El cantidad asociado a la clase
	 */
	public Long getCantidad() {
		return cantidad;
	}
	/**
	 * Metodo encargado de modificar el valor del atributo cantidad
	 * @param cantidad El nuevo cantidad a modificar.
	 */
	public void setCantidad(Long cantidad) {
		this.cantidad = cantidad;
	}
	
	

}
