package com.hbt.semillero.dto;

import java.util.ArrayList;

import java.util.List;
/**
 * 
 * <b>Descripción:<b> Clase que determina la consulta para determinar los nombres de los comics y los clasifica segun su tamaño
 * <b>Caso de Uso:<b> 
 * @author SEDIEL
 * @version
 */

public class consultarComicTamanioNombreDTO extends ResultadoDTO {

	/**
	 * Atributo que determina  
	 */
	private static final long serialVersionUID = 1L;
	private List<String> comicsSuperanTamanio;
	private List<String> comicsNoSuperanTamanio;
	
	public consultarComicTamanioNombreDTO() {
		this.comicsSuperanTamanio = new ArrayList<>();
		this.comicsNoSuperanTamanio = new ArrayList<>();
	}

	/**
	 * Metodo encargado de retornar el valor del atributo comicsSuperanTamanio
	 * @return El comicsSuperanTamanio asociado a la clase
	 */
	public List<String> getComicsSuperanTamanio() {
		return comicsSuperanTamanio;
	}

	/**
	 * Metodo encargado de modificar el valor del atributo comicsSuperanTamanio
	 * @param comicsSuperanTamanio El nuevo comicsSuperanTamanio a modificar.
	 */
	public void setComicsSuperanTamanio(List<String> comicsSuperanTamanio) {
		this.comicsSuperanTamanio = comicsSuperanTamanio;
	}

	/**
	 * Metodo encargado de retornar el valor del atributo comicsNoSuperanTamanio
	 * @return El comicsNoSuperanTamanio asociado a la clase
	 */
	public List<String> getComicsNoSuperanTamanio() {
		return comicsNoSuperanTamanio;
	}

	/**
	 * Metodo encargado de modificar el valor del atributo comicsNoSuperanTamanio
	 * @param comicsNoSuperanTamanio El nuevo comicsNoSuperanTamanio a modificar.
	 */
	public void setComicsNoSuperanTamanio(List<String> comicsNoSuperanTamanio) {
		this.comicsNoSuperanTamanio = comicsNoSuperanTamanio;
	}
	
	
	
	

}
