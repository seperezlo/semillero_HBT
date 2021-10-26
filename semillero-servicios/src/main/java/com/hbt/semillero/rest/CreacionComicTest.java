/**
 * CreacionComicTest.java
 */
package com.hbt.semillero.rest;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.hbt.semillero.dto.ComicDTO;
import com.hbt.semillero.enums.EstadoEnum;
import com.hbt.semillero.enums.TematicaEnum;

/**
 * <b>Descripción:<b> Clase que para la creacion y administracion de comic
 * <b>Caso de Uso:<b> 
 * @author SEDIEL
 * @version 
 */
public class CreacionComicTest extends ComicDTO {

	/**
	 * Atributo que determina  
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Metodo encargado de crear los comics
	 * <b>Caso de Uso</b>Semillero 2021
	 * @author SEDIEL
	 * 
	 * @param args
	 */
	public  static List<ComicDTO> CrearComic(){
		
		/**
		 * Se crea una lista para almacenar los comics que se crearan
		 */
		List<ComicDTO> ListaComicDtOCreada= new ArrayList<>();
		/**
		 * se instancia un objeto de la clase comicDTO
		 */
		ComicDTO comic1=new ComicDTO();
		comic1.setId("12");
		comic1.setNombre("magin_bu");
		comic1.setEditorial("Planeta Cómic");
		comic1.setTematicaEnum(TematicaEnum.AVENTURAS);
		comic1.setColeccion("Dragon Ball");
		comic1.setNumeroPaginas(111);
		comic1.setPrecio(new BigDecimal(3200));
		comic1.setAutores("tekachi");
		comic1.setColor(true);
		comic1.setEstadoEnum(EstadoEnum.INACTIVO);
		comic1.setCantidad(12l);
		ListaComicDtOCreada.add(comic1);
		/**
		 * se instancia un objeto de la clase comicDTO
		 */
		
		ComicDTO comic2=new ComicDTO();
		comic2.setId("13");
		comic2.setNombre("Saga de Cell");
		comic2.setEditorial("Mundo Aventuras");
		comic2.setTematicaEnum(TematicaEnum.FANTASTICO);
		comic2.setColeccion("Dragon Ball");
		comic2.setNumeroPaginas(120);
		comic2.setPrecio(new BigDecimal(5200));
		comic2.setAutores("tonyllama");
		comic2.setColor(false);
		comic2.setEstadoEnum(EstadoEnum.ACTIVO);
		comic2.setCantidad(58l);
		ListaComicDtOCreada.add(comic2);
		/**
		 * se instancia un objeto de la clase comicDTO
		 */
		ComicDTO comic3=new ComicDTO();
		comic3.setId("14");
		comic3.setNombre("Naruto");
		comic3.setEditorial("Planeta Cómic");
		comic3.setTematicaEnum(TematicaEnum.AVENTURAS);
		comic3.setColeccion("Naruto");
		comic3.setNumeroPaginas(359);
		comic3.setPrecio(new BigDecimal(3900));
		comic3.setAutores("huzumaki");
		comic3.setColor(true);
		comic3.setEstadoEnum(EstadoEnum.INACTIVO);
		comic3.setCantidad(120l);
		ListaComicDtOCreada.add(comic3);
		/**
		 * se instancia un objeto de la clase comicDTO
		 */
		ComicDTO comic4=new ComicDTO();
		comic4.setId("15");
		comic4.setNombre("El mundo Fantasma");
		comic4.setEditorial("comics y mas comics");
		comic4.setTematicaEnum(TematicaEnum.HORROR);
		comic4.setColeccion("el otro lado");
		comic4.setNumeroPaginas(136);
		comic4.setPrecio(new BigDecimal(4400));
		comic4.setAutores("el perdido");
		comic4.setColor(true);
		comic4.setEstadoEnum(EstadoEnum.INACTIVO);
		comic4.setCantidad(15l);
		ListaComicDtOCreada.add(comic4);
		/**
		 * se instancia un objeto de la clase comicDTO
		 */
		ComicDTO comic5=new ComicDTO();
		comic5.setId("16");
		comic5.setNombre("Soliman");
		comic5.setEditorial("comics y mas comics");
		comic5.setTematicaEnum(TematicaEnum.FANTASTICO);
		comic5.setColeccion("Viajes");
		comic5.setNumeroPaginas(80);
		comic5.setPrecio(new BigDecimal(6700));
		comic5.setAutores("Tekachi");
		comic5.setColor(false);
		comic5.setEstadoEnum(EstadoEnum.ACTIVO);
		comic5.setCantidad(33l);
		ListaComicDtOCreada.add(comic5);
		/**
		 * se instancia un objeto de la clase comicDTO
		 */
		ComicDTO comic6=new ComicDTO();
		comic6.setId("17");
		comic6.setNombre("saga de frezzer");
		comic6.setEditorial("Planeta Cómic");
		comic6.setTematicaEnum(TematicaEnum.BELICO);
		comic6.setColeccion("Dragon Ball");
		comic6.setNumeroPaginas(210);
		comic6.setPrecio(new BigDecimal(5800));
		comic6.setAutores("tonyllama");
		comic6.setColor(true);
		comic6.setEstadoEnum(EstadoEnum.ACTIVO);
		comic6.setCantidad(44l);
		ListaComicDtOCreada.add(comic6);
		/**
		 * se instancia un objeto de la clase comicDTO
		 */
		ComicDTO comic7=new ComicDTO();
		comic7.setId("18");
		comic7.setNombre("boruto");
		comic7.setEditorial("Planeta Cómic");
		comic7.setTematicaEnum(TematicaEnum.FANTASTICO);
		comic7.setColeccion("Naruto");
		comic7.setNumeroPaginas(500);
		comic7.setPrecio(new BigDecimal(4100));
		comic7.setAutores("huzumaki");
		comic7.setColor(true);
		comic7.setEstadoEnum(EstadoEnum.ACTIVO);
		comic7.setCantidad(47l);
		ListaComicDtOCreada.add(comic7);
		/**
		 * se instancia un objeto de la clase comicDTO
		 */
		ComicDTO comic8=new ComicDTO();
		comic8.setId("19");
		comic8.setNombre("Las Aventuras de tom");
		comic8.setEditorial("Mundo Aventuras");
		comic8.setTematicaEnum(TematicaEnum.AVENTURAS);
		comic8.setColeccion("Viajes");
		comic8.setNumeroPaginas(500);
		comic8.setPrecio(new BigDecimal(7500));
		comic8.setAutores("sedio");
		comic8.setColor(true);
		comic8.setEstadoEnum(EstadoEnum.ACTIVO);
		comic8.setCantidad(43l);
		ListaComicDtOCreada.add(comic8);
		
		ComicDTO comic9=new ComicDTO();
		comic9.setId("20");
		comic9.setNombre("Hulk");
		comic9.setEditorial("Marvel");
		comic9.setTematicaEnum(TematicaEnum.CIENCIA_FICCION);
		comic9.setColeccion("anime");
		comic9.setNumeroPaginas(309);
		comic9.setPrecio(new BigDecimal(7000));
		comic9.setAutores("stalin");
		comic9.setColor(true);
		comic9.setEstadoEnum(EstadoEnum.ACTIVO);
		comic9.setCantidad(12l);
		ListaComicDtOCreada.add(comic9);
		
		ComicDTO comic10=new ComicDTO();
		comic10.setId("21");
		comic10.setNombre("Linterna verde");
		comic10.setEditorial("Marvel");
		comic10.setTematicaEnum(TematicaEnum.CIENCIA_FICCION);
		comic10.setColeccion("anime");
		comic10.setNumeroPaginas(208);
		comic10.setPrecio(new BigDecimal(4150));
		comic10.setAutores("stalin");
		comic10.setColor(true);
		comic10.setEstadoEnum(EstadoEnum.INACTIVO);
		comic10.setCantidad(52l);
		ListaComicDtOCreada.add(comic10);
		return ListaComicDtOCreada;
		
		}
		/**
		 * 
		 * Metodo encargado de de verificar los comic que estan Activos
		 * <b>Caso de Uso</b>Semillero 2021
		 * @author SEDIEL
		 * 
		 * @param ListaComicDtOCreada
		 * @return
		 */
	
	private  static List<ComicDTO> verificarComicActivos( List<ComicDTO> ListaComicDtOCreada) {
		List<ComicDTO> ListaComicDtOEstadoA= new ArrayList<>();
		for (ComicDTO estado : ListaComicDtOCreada) {
			if ( estado.getEstadoEnum() ==EstadoEnum.ACTIVO) 
				ListaComicDtOEstadoA.add(estado); 	
	   }
		
		return   ListaComicDtOEstadoA ;
	}
	/**
	 * 
	 * Metodo encargado de de verificar los metodos que estan inactivos 
	 * <b>Caso de Uso</b>Semillero 2021
	 * @author SEDIEL
	 * 
	 * @param ListaComicDtOCreada
	 * @return
	 */
	private static List<ComicDTO> verificarComicInactivos( List<ComicDTO> ListaComicDtOCreada) {
		List<ComicDTO> ListaComicDtOEstadoI= new ArrayList<>();
		for (ComicDTO estado : ListaComicDtOCreada) {
			if ( estado.getEstadoEnum() ==EstadoEnum.INACTIVO) 
				ListaComicDtOEstadoI.add(estado);    	
	   }
		return   ListaComicDtOEstadoI ;
	}
	/**
	 * 
	 * Metodo encargado de contener la clase main para imprimir los comic activos o inactivos 
	 * <b>Caso de Uso</b>
	 * @author SEDIEL
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		//System.out.println(CrearComic());
				/**
				 * imprime la lista con los comics activos
				 */
				System.out.println("los comics activos son: "+verificarComicActivos(CrearComic()));
				/**
				 * Imprime la lista con los comic inactivos
				 */
				System.out.println("Los comics Inactivos son: "+verificarComicInactivos(CrearComic()));

	}

}
