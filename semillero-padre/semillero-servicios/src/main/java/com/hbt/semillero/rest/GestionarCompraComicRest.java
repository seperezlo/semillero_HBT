package com.hbt.semillero.rest;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.hbt.semillero.dto.ComicDTO;
import com.hbt.semillero.ejb.IGestionarCompraComic;
// se agrega el @path para poder crear la ruta de consulta
@Path("/gestionarCompraComic")
public class GestionarCompraComicRest {
	// esta linea lo que hace poder acceder a logica que contiene la clase GestionarCompraComicBean
	@EJB
	private IGestionarCompraComic gestionarCompraLocal;
	//metodo para administrar la compra de un comic rest
	// es de tipo post porque va a realizar cambion en la base de datos
	@POST
	// se el @path para terminar de especificar la ruta del servicio
	@Path("/comprarComic")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public ComicDTO  comprarComic(@QueryParam("idComic") Long idComic , @QueryParam("cantidad") Long cantidad) {
		ComicDTO compraComic = new ComicDTO();
		try {
			compraComic = this.gestionarCompraLocal.comprarComic(idComic , cantidad);
		}  catch (Exception e) {
			compraComic.setExitoso(false);
			compraComic.setMensajeEjecucion("Se ha presentado un error tecnico, causa: " + e.getMessage());
		}
		return compraComic;
	}

}
