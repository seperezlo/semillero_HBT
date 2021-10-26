package com.hbt.semillero.interfaces;

import com.hbt.semillero.enums.TipoVehiculoEnum;
/**
 * 
 * <b>Descripción:<b> Clase abstracta que determina las aciones de un vehiculo
 * <b>Caso de Uso:<b> SEMILLERO_2021
 * @author SEDIEL
 * @version 1.0
 */

public abstract class AccionesVehiculo {
	/**
	 * 
	 * Metodo encargado de 
	 * <b>Caso de Uso</b>
	 * @author SEDIEL
	 * 
	 * @return
	 */
	public abstract int obtenerVelocidadMaxima();
	
	public abstract Long obternerPesoMaximoCarga();
	
	public abstract boolean determinarTipoVehiculo(TipoVehiculoEnum tipoVehiculoEmun) throws Exception;
	
	public void acelerar() {
		System.out.println("El vehiculo ha iniciado acelerar");
	}
}
