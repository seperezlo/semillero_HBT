package com.hbt.semillero.ejb;

import javax.ejb.Local;

import com.hbt.semillero.dto.ComicDTO;

/**
 * 
 * <b>Descripción:<b> Interfaz que para implementar el servicio comprarComic
 * <b>Caso de Uso:<b> 2021 semillero
 * @author SEDIEL
 * @version
 */
// el @local lo utilizamos para decirle que vamos a administrar el servicio localmente
@Local
public interface IGestionarCompraComic {
	//  servicio para gestionar la compra de un comic los parametros de entrada que se van a utilizar son el nombre y la cantidad
	public ComicDTO  comprarComic( Long idComic, Long cantidad)throws Exception;

}
