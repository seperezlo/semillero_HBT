package com.hbt.semillero.interfaces;

import com.hbt.semillero.enums.TipoVehiculoEnum;
/**
 * 
 * <b>Descripción:<b>interfas que determina las acciones de un vehiculo determinado
 * <b>Caso de Uso:<b> SEMILLERO_2021
 * @author SEDIEL
 * @version
 */

public interface AccionesVehiculoInterface {
	/**
	 * 
	 * Metodo encargado de especificar la velocidad maxima de un vehiculo
	 * <b>Caso de Uso</b>SEMILLERO_2021
	 * @author SEDIEL
	 * 
	 * @return
	 */
	
	public int obtenerVelocidadMaxima();
	/**
	 * 
	 * Metodo encargado de obtener el peso maximo de un vehiculo 
	 * <b>Caso de Uso</b>SEMILLERO_2021
	 * @author SEDIEL
	 *  (abstracto) 
	 * @return
	 */
	
	public Long obternerPesoMaximoCarga();
	/**
	 * 
	 * Metodo encargado de especificar el tipo de vehiculo
	 * <b>Caso de Uso</b>SEMILLERO_2021
	 * @author SEDIEL
	 * 
	 * @param tipoVehiculoEmun
	 * @return
	 * @throws Exception
	 */
	
	public boolean determinarTipoVehiculo(TipoVehiculoEnum tipoVehiculoEmun) throws Exception;
	/**
	 * 
	 * Metodo encargado de escribir en pantalla que un vehiculo comenzo su marcha a acelerar 
	 * <b>Caso de Uso</b>SEMILLERO_2021
	 * @author SEDIEL
	 *
	 */
	
	public default void acelerar() {
		System.out.println("El vehiculo ha iniciado acelerar");
	}
}
