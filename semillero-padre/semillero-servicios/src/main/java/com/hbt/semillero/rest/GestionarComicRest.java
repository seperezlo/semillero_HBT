package com.hbt.semillero.rest;


import java.math.BigDecimal;
import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;



import com.hbt.semillero.dto.ActualizarPrecioCantidadEstadoDTO;
import com.hbt.semillero.dto.ComicDTO;
import com.hbt.semillero.dto.ConsultaNombrePrecioComicDTO;
import com.hbt.semillero.dto.ConsultarNombrePrecioEstadoDTO;
import com.hbt.semillero.dto.ResultadoDTO;
import com.hbt.semillero.dto.consultarComicTamanioNombreDTO;
import com.hbt.semillero.ejb.IGestionarComicLocal;
import com.hbt.semillero.enums.EstadoEnum;
/**
 * 
 * <b>Descripción:<b> Clase que gestiona los servicios de comic rest
 * <b>Caso de Uso:<b> semillero 2021
 * @author SEDIEL
 * @version
 */
@Path("/gestionarComic")
public class GestionarComicRest {
	// esta linea lo que hace poder acceder a logica que contiene los servicios 
	@EJB
	private IGestionarComicLocal gestionarComicLocal;
	// metodo para administrar la consulta de nombre y precio del comic rest
	@GET
	@Path("/consultarNombrePrecioComic")
	@Produces(MediaType.APPLICATION_JSON)
	public ConsultaNombrePrecioComicDTO consultarNombrePrecioComic(@QueryParam("idComic") Long idComic) {
		return this.gestionarComicLocal.consultarNombrePrecioComic(idComic);
	}
	// metodo para administrar la creacion del comic rest
	@POST
	@Path("/crearComic")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public ComicDTO crearComic(ComicDTO comicDTO) {
		ComicDTO comicDTOResult = new ComicDTO();
		try {
			comicDTOResult = this.gestionarComicLocal.crearComic(comicDTO);
		}  catch (Exception e) {
			comicDTOResult.setExitoso(false);
			comicDTOResult.setMensajeEjecucion("Se ha presentado un error tecnico, causa: " + e.getMessage());
		}
		return comicDTOResult;
	} 
	//metodo para administrar la consulta de los  comics rest
	@GET
	@Path("/consultarComics")
	@Produces(MediaType.APPLICATION_JSON)
	public List<ComicDTO> consultarComics(){
		return this.gestionarComicLocal.consultarComics();	
	}
	//metodo para administrar la eliminacion del comic rest
	@POST
	@Path("/eliminarComic")
	@Produces(MediaType.APPLICATION_JSON)
	public  ResultadoDTO eliminarComic(Long idComic){
		return this.gestionarComicLocal.eliminarComic(idComic);	
	}
	//metodo para administrar la consulta por nombre del comic rest
	@GET
	@Path("/consultarComicTamanioNombre")
	@Produces(MediaType.APPLICATION_JSON)
	public  consultarComicTamanioNombreDTO consultarComicTamanioNombre(@QueryParam("lengthComic") Short lengthComic){
		return this.gestionarComicLocal.consultarComicTamanioNombre(lengthComic);	
	}
	//metodo para administrar la actualizacion del comic rest
	@POST
	@Path("/actualizarComic")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public ComicDTO actualizarComic( ComicDTO comicDTO) {
		return this.gestionarComicLocal.actualizarComic(comicDTO);	
	}
	// metodo encargado de administrar la consulta nombre precio estado de un comic
	@GET
	@Path("/consultarNombrePrecioEstado")
	@Produces(MediaType.APPLICATION_JSON)
	public ConsultarNombrePrecioEstadoDTO consultarNombrePrecioEstado(@QueryParam("idComic") Long idComic) {
		return this.gestionarComicLocal.consultarNombrePrecioEstado(idComic);	
	}
	//metodo encargado de actualizar precio estado cantidad de un comic
	@POST
	@Path("/actualizarPrecioCantidadEstadoComic")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public ActualizarPrecioCantidadEstadoDTO actualizarPrecioCantidadEstadoComic( Long idComic,BigDecimal precio,EstadoEnum estadoEnum, Long cantidad) {
		return this.gestionarComicLocal.actualizarPrecioCantidadEstadoComic(idComic, precio, estadoEnum,  cantidad);
		
	}
	@GET
	@Path("/consultarComic")
	@Produces(MediaType.APPLICATION_JSON)
	public ComicDTO consultarComic(@QueryParam("idComic") Long idComic) {
		System.out.println("*** entro a comic***");
		return this.gestionarComicLocal.consultarComic(idComic);	
	}
}
