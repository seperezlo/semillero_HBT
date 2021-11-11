package com.hbt.semillero.ejb;

import java.time.LocalDate;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.hbt.semillero.dto.ComicDTO;
import com.hbt.semillero.enums.EstadoEnum;

@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
public class GestionarCompraComicBean implements IGestionarCompraComic {
	
	@PersistenceContext
	public EntityManager em;
	
	public GestionarComicBean gestionarComicBean;
	
    // metodo que implementa la logica del servicio comprarComic
	// el tipo de servicio es post por ende se usa TransactionAttributeType.REQUIRED ya que vamos a entrar a modificar la base de datos
	@Override
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public ComicDTO comprarComic(Long idComic,Long cantidad)throws Exception {
		// se crea un objeto de tipo comicDTO
		 ComicDTO compraComic = gestionarComicBean.consultarComic(idComic);
		 // se verifica que el estado del comic no este inactivo
		 if (EstadoEnum.INACTIVO.equals(compraComic.getEstadoEnum())) {
			 // manejo de errores para que en caso de que el comic este inactivo no se proceda con la compra
			 throw new Exception("El comic seleccionado no cuenta con stock en bodega");
			 // se verifica que la cantidad a comprar sea menor que la que existe en stock
		 }else if (compraComic.getCantidad() > cantidad ) {
			 // se agrega la fecha de compra
			 compraComic.setFechaVenta(LocalDate.now());
			 // resta la cantidad comprada a la cantidad que existente en stock
			 compraComic.setCantidad(compraComic.getCantidad()-cantidad);
			 // continua el estadoEnum en estado activo
			 compraComic.setEstadoEnum(EstadoEnum.ACTIVO);
			 // estado exitoso 
			 compraComic.setExitoso(true);
			 compraComic.setMensajeEjecucion("La compra del comic" + compraComic.getNombre()+ "fue exitosa");
			 // verifica si la cantidad de comics es igual a la que se quiere comprar
		 }else if (compraComic.getCantidad() == cantidad ) {
			 // asigna el estado inactivo en caso de comprar todos los comics en stock
			 compraComic.setEstadoEnum(EstadoEnum.INACTIVO);
			 compraComic.setExitoso(true);
			 compraComic.setMensajeEjecucion("La compra del comic" + compraComic.getNombre()+ "fue exitosa");
			 // verifica si la cantidad a comprar es menor a la existente en stock
		 }else if (compraComic.getCantidad() < cantidad ) {
			 throw new Exception("La cantidad existente del comic es:" + compraComic.getCantidad()+ "y es menor a la ingresada");
		 }
		 // retorna el estado del comic despues de realizar la compra 
		return compraComic;
	}
	

}
