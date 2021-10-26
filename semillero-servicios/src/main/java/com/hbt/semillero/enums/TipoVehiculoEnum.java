package com.hbt.semillero.enums;
/**
 * 
 * <b>Descripción:<b> Clase que determina los enums para no quemar codigo
 * <b>Caso de Uso:<b> SEMILLERO_2021
 * @author SEDIEL
 * @version
 */

public enum TipoVehiculoEnum {
	TERRESTRE("Terrestre",1),
	ACUATICO("Acuatico",2),
	AEREO("aereo",3);
	
	private String tipo;
	private int identificador;
	
	TipoVehiculoEnum(String tipo, int identificador) {
		this.tipo =tipo;
		this.identificador =identificador;
	}

	/**
	 * Metodo encargado de retornar el valor del atributo identificador
	 * @return El identificador asociado a la clase
	 */
	public int getIdentificador() {
		return identificador;
	}
	/**
	 * 
	 * Metodo encargado de retonar el tipo de vehiculo
	 * <b>Caso de Uso</b> semillero 2021
	 * @author SEDIEL
	 * 
	 * @return
	 */
	public String getTipo() {
		return tipo;
	}
}
