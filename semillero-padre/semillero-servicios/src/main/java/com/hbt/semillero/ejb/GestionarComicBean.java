package com.hbt.semillero.ejb;

import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.hbt.semillero.dto.ComicDTO;
import com.hbt.semillero.dto.ConsultaNombrePrecioComicDTO;
import com.hbt.semillero.dto.ConsultarNombrePrecioEstadoDTO;
import com.hbt.semillero.dto.ResultadoDTO;
import com.hbt.semillero.dto.consultarComicTamanioNombreDTO;
import com.hbt.semillero.entidad.Comic;
import com.hbt.semillero.enums.EstadoEnum;
/**
 * 
 * <b>Descripción:<b> Clase que contiene los servicios a ejecutarse dicha clase implementa la la interfaz para gestionar los comics de manera local
 * <b>Caso de Uso:<b> semillero 2021
 * @author SEDIEL
 * @version
 */
@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
public class GestionarComicBean  implements IGestionarComicLocal {

	@PersistenceContext
	public EntityManager em;
	// servicio para consultar el nombre y precio de un comic referenciado por su SCId 
	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	@Override
	public ConsultaNombrePrecioComicDTO consultarNombrePrecioComic(Long idComic) {
		String consulta = "SELECT new com.hbt.semillero.dto.ConsultaNombrePrecioComicDTO(c.nombre, c.precio)  "
						+ " FROM Comic c WHERE c.id = :idComic";
		ConsultaNombrePrecioComicDTO consultaNombrePrecioDTO = new ConsultaNombrePrecioComicDTO();
		try {
			Query consultaNativa = em.createQuery(consulta);
			consultaNativa.setParameter("idComic", idComic);
			consultaNombrePrecioDTO = (ConsultaNombrePrecioComicDTO) consultaNativa.getSingleResult();
			consultaNombrePrecioDTO.setExitoso(true);
			consultaNombrePrecioDTO.setMensajeEjecucion("Se ejecuto exitosamente la consulta");	
		} catch (Exception e) {
			consultaNombrePrecioDTO.setExitoso(false);
			consultaNombrePrecioDTO.setMensajeEjecucion("Se ha presentado un error tecnico al consultar el comic");
		}

		return consultaNombrePrecioDTO;
	}
	// servicio para crear un comic 
	@Override
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public ComicDTO crearComic(ComicDTO comicDTO) throws Exception {
		
		if(comicDTO.getNombre() == null) {
			throw new Exception("El campo nombre es requerido");
		}
		ComicDTO comicDTOResult = null;
		Comic comic = this.convertirComicDTOToComic(comicDTO);
		em.persist(comic);
		comicDTOResult = this.convertirComicToComicDTO(comic);
		comicDTOResult.setExitoso(true);
		comicDTOResult.setMensajeEjecucion("El comic ha sido creado exitosamente");
		return comicDTOResult;
	}
	// servicio para actualizar un comic referenciado por su SCId
	@Override
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public ResultadoDTO actualizarComic(Long idComic) {
		ResultadoDTO update =new  ResultadoDTO();
		try {
			String actualizarComic = " UPDATE Comic c SET c.estadoEnum = :estado WHERE c.id = :idComic";
			Query queryActualizar = em.createQuery(actualizarComic);
			queryActualizar.setParameter("estado", EstadoEnum.INACTIVO);
			queryActualizar.setParameter("idComic", idComic);
			queryActualizar.executeUpdate();
			update.setExitoso(true);
			update.setMensajeEjecucion("el comic se actualizo exitosamente");
		}catch (Exception e) {
			update.setExitoso(false);
			update.setMensajeEjecucion("la actualizacion no se realizo, se presentaron errores tecnicos");	
		}
		return update;
	}
    // servicio para eliminar un comic referenciado por su SCId 
	@Override
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public ResultadoDTO eliminarComic(Long idComic) {
		String eliminarComic = " DELETE FROM Comic dc WHERE dc.id = :idComic";
		ResultadoDTO eliminado =  new ResultadoDTO();
		try {
			Query queryEliminar = em.createQuery(eliminarComic);
			queryEliminar.setParameter("idComic", idComic);
			queryEliminar.executeUpdate();
			eliminado.setExitoso(true);
			eliminado.setMensajeEjecucion("se realizo la eliminacion exitosamente");
		}catch (Exception e) {
			eliminado.setExitoso(false);
			eliminado.setMensajeEjecucion("la eliminacion no se realizo, se presentaron errores tecnicos");	
		}
		return eliminado;
	}
	// servicio para consultar la lista de comics 
	@SuppressWarnings("unchecked")
	@Override
	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	public List<ComicDTO> consultarComics() {
		String findAllComic = " SELECT cm FROM Comic cm ";
		Query queryFindAllComic = em.createQuery(findAllComic);
		List<ComicDTO> listaComics = queryFindAllComic.getResultList();
		
		return listaComics;
	}
	
	
	/**
	 * 
	 * Metodo encargado de transformar un comic a un comicDTO
	 * 
	 * @param comic
	 * @return
	 */
	private ComicDTO convertirComicToComicDTO(Comic comic) {
		ComicDTO comicDTO = new ComicDTO();
		comicDTO.setId(comicDTO.getId());
		comicDTO.setNombre(comic.getNombre());
		comicDTO.setEditorial(comic.getEditorial());
		comicDTO.setTematicaEnum(comic.getTematicaEnum());
		comicDTO.setColeccion(comic.getColeccion());
		comicDTO.setNumeroPaginas(comic.getNumeroPaginas());
		comicDTO.setPrecio(comic.getPrecio());
		comicDTO.setAutores(comic.getAutores());
		comicDTO.setColor(comic.getColor());
		comicDTO.setFechaVenta(comic.getFechaVenta());
		comicDTO.setEstadoEnum(comic.getEstadoEnum());
		comicDTO.setCantidad(comic.getCantidad());
		return comicDTO;
	}

	/**
	 * 
	 * Metodo encargado de transformar un comicDTO a un comic
	 * 
	 * @param comic
	 * @return
	 */
	private Comic convertirComicDTOToComic(ComicDTO comicDTO) {
		Comic comic = new Comic();
		comic.setId(comicDTO.getId());
		comic.setNombre(comicDTO.getNombre());
		comic.setEditorial(comicDTO.getEditorial());
		comic.setTematicaEnum(comicDTO.getTematicaEnum());
		comic.setColeccion(comicDTO.getColeccion());
		comic.setNumeroPaginas(comicDTO.getNumeroPaginas());
		comic.setPrecio(comicDTO.getPrecio());
		comic.setAutores(comicDTO.getAutores());
		comic.setColor(comicDTO.getColor());
		comic.setFechaVenta(comicDTO.getFechaVenta());
		comic.setEstadoEnum(comicDTO.getEstadoEnum());
		comic.setCantidad(comicDTO.getCantidad());
		return comic;
	}
	// servicio para consultar y clasificar los diferentes nombres de los comics
	@SuppressWarnings( "unchecked" )
	
	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	public consultarComicTamanioNombreDTO consultarComicTamanioNombre(Short lengthPalabra) {
		String consulta = "SELECT s.nombre FROM Comic s";
		consultarComicTamanioNombreDTO consultarComicTamanioNombre = new consultarComicTamanioNombreDTO();
		try {
			if (lengthPalabra > 150) {
				throw new Exception("la longitud maxima permitida es de 150 caracteres");	
			}
			Query consultaQuery = em.createQuery(consulta);
			List<String> nombresComisc = consultaQuery.getResultList();
			for (String nombre : nombresComisc ) {
				if (nombre.length() >= lengthPalabra) {
					consultarComicTamanioNombre.getComicsSuperanTamanio().add(nombre);
				}else {
					consultarComicTamanioNombre.getComicsNoSuperanTamanio().add(nombre);	
				}
			}
			consultarComicTamanioNombre.setExitoso(true);
			consultarComicTamanioNombre.setMensajeEjecucion("se realizo la consulta exitosamente");
		}catch (Exception e) {
			consultarComicTamanioNombre.setExitoso(false);
			consultarComicTamanioNombre.setMensajeEjecucion("la consulta no se realizo, se presentaron errores tecnicos");	
		}
		return consultarComicTamanioNombre;
	}
	// Servicio para consultar el nombre, precio,estado de un comic
	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	@Override
	public ConsultarNombrePrecioEstadoDTO consultarNombrePrecioEstado(Long idComic) {
		String consultaJpql = "SELECT new com.hbt.semillero.dto.ConsultarNombrePrecioEstadoDTO(c.nombre, c.precio, c.estadoEnum)  "
				+ " FROM Comic c WHERE c.id = :idComic";
		ConsultarNombrePrecioEstadoDTO ConsultarNombrePrecioEstadoDTO = new ConsultarNombrePrecioEstadoDTO();
		try {
				Query consultaNativa = em.createQuery(consultaJpql);
				consultaNativa.setParameter("idComic", idComic);
				ConsultarNombrePrecioEstadoDTO = (ConsultarNombrePrecioEstadoDTO) consultaNativa.getSingleResult();
				ConsultarNombrePrecioEstadoDTO.setExitoso(true);
				ConsultarNombrePrecioEstadoDTO.setMensajeEjecucion("Se ejecuto exitosamente la consulta");	
		} catch (Exception e) {
			ConsultarNombrePrecioEstadoDTO.setExitoso(false);
			ConsultarNombrePrecioEstadoDTO.setMensajeEjecucion("Se ha presentado un error tecnico al consultar el comic");
		}
		return ConsultarNombrePrecioEstadoDTO;
	}
}

	
	

	
	
