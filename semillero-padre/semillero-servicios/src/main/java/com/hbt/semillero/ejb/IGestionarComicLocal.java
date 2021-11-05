package com.hbt.semillero.ejb;

import java.util.List;

import javax.ejb.Local;

import com.hbt.semillero.dto.ComicDTO;
import com.hbt.semillero.dto.ConsultaNombrePrecioComicDTO;
import com.hbt.semillero.dto.ConsultarNombrePrecioEstadoDTO;
import com.hbt.semillero.dto.ResultadoDTO;
import com.hbt.semillero.dto.consultarComicTamanioNombreDTO;

/**
 * 
 * <b>Descripción:<b> interfaz para crear que gestina los diferentes servicios a implementar 
 * <b>Caso de Uso:<b> 
 * @author SEDIEL
 * @version
 */
@Local
public interface IGestionarComicLocal {
	
	//implemta el servicio para consultar nombre y precio del comic
	public ConsultaNombrePrecioComicDTO consultarNombrePrecioComic(Long idComic);
	// implemta el servicio para crear un comic
	public ComicDTO crearComic(ComicDTO comicDTO) throws Exception;
	//implemta el servicio para crear un comic
	public ResultadoDTO actualizarComic(Long idComic);
	// implemta el servicio para eliminar un comic
	public ResultadoDTO eliminarComic(Long idComic);
	// implemta el servicio para consultar todos los comics disponibles en la base de datos
	public List<ComicDTO> consultarComics();
	// implemta el servicio para consultar nombre de los comics 
	public  consultarComicTamanioNombreDTO consultarComicTamanioNombre(Short lengthComic);
	// implementa el servicio para consultar nombre, precio y estado de un comic
	public ConsultarNombrePrecioEstadoDTO consultarNombrePrecioEstado(Long idComic);
	
}
