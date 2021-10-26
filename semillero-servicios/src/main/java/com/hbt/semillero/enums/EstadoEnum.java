package com.hbt.semillero.enums;

public enum EstadoEnum {
	ACTIVO("enum.estado.activo"), 
	INACTIVO("enum.estado.inactivo");
	
	
	private String codigoEstado;

	/**
	 * Constructor que recibe como parametro el codigo del mensaje
	 * 
	 * @param codigoMensaje, Clave del mensaje para para internacionalizacion
	 */
	EstadoEnum(String codigoEstado) {
		this.codigoEstado = codigoEstado;
	}

	/**
	 * Metodo que retorna el valor del atributo
	 * 
	 * @return cadena con el codigo del mensaje
	 */
	public String getCodigoEstado() {
		return codigoEstado;
	}

	/**
	 * Metodo que establece el valor del atributo
	 *
	 * @param codigoMensaje
	 */
	public void setCodigoEstado(String codigoEstado) {
		this.codigoEstado = codigoEstado;
	}
}
