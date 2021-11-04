package com.hbt.semillero.rest;


import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.hbt.semillero.dto.ComicDTO;
import com.hbt.semillero.dto.ConsultaNombrePrecioComicDTO;
import com.hbt.semillero.dto.ResultadoDTO;
import com.hbt.semillero.dto.consultarComicTamanioNombreDTO;
import com.hbt.semillero.ejb.IGestionarComicLocal;
/**
 * 
 * <b>Descripción:<b> Clase que gestiona los servicios de comic rest
 * <b>Caso de Uso:<b> semillero 2021
 * @author SEDIEL
 * @version
 */
@Path("/gestionarComic")
public class GestionarComicRest {
	// esta linea no se que es lo que hace
	@EJB
	private IGestionarComicLocal gestionarComicLocal;
	// metodo para administar la consulta de nombre y precio del comic rest
	@GET
	@Path("/consultarNombrePrecioComic")
	@Produces(MediaType.APPLICATION_JSON)
	public ConsultaNombrePrecioComicDTO consultarNombrePrecioComic(@QueryParam("idComic") Long idComic) {
		return this.gestionarComicLocal.consultarNombrePrecioComic(idComic);
	}
	// metodo para administar la creacion del comic rest
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
	//metodo para administar la consulta de los  comics rest
	@GET
	@Path("/consultarComics")
	@Produces(MediaType.APPLICATION_JSON)
	public List<ComicDTO> consultarComics(){
		return this.gestionarComicLocal.consultarComics();	
	}
	//metodo para administar la eliminacion del comic rest
	@POST
	@Path("/eliminarComic")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public  ResultadoDTO eliminarComic(@QueryParam("idComic") Long idComic){
		return this.gestionarComicLocal.eliminarComic(idComic);	
	}
	//metodo para administar la consulta por nombre del comic rest
	@GET
	@Path("/consultarComicTamanioNombre")
	@Produces(MediaType.APPLICATION_JSON)
	public  consultarComicTamanioNombreDTO consultarComicTamanioNombre(@QueryParam("lengthComic") Short lengthComic){
		return this.gestionarComicLocal.consultarComicTamanioNombre(lengthComic);	
	}
	//metodo para administar la actualizacion del comic rest
	@POST
	@Path("/actualizarComic")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public ResultadoDTO actualizarComic(@QueryParam("idComic") Long idComic) {
		return this.gestionarComicLocal.actualizarComic(idComic);	
	}
}
