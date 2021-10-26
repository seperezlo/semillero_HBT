package com.hbt.semillero.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.hbt.semillero.entidad.Vehiculo;
import com.hbt.semillero.enums.EstadoEnum;
import com.hbt.semillero.enums.TematicaEnum;
import com.hbt.semillero.enums.TipoVehiculoEnum;


/**
 * <b>Descripción:<b> Clase que determina el dto a usar para modificar,
 * consultar y posteriormente eliminar un comic
 * 
 * @author ccastano
 */
public class ComicDTO implements Serializable {

	/**
	 * Atributo que determina
	 */
	private static final long serialVersionUID = 1L;

	private String id;
	private String nombre;
	private String editorial;
	private TematicaEnum tematicaEnum;
	private String coleccion;
	private Integer numeroPaginas;
	private BigDecimal precio;
	private String autores;
	private Boolean color;
	private LocalDate fechaVenta;
	private EstadoEnum estadoEnum;
	private Long cantidad;

	/**
	 * Metodo encargado de retornar el valor del atributo id
	 * 
	 * @return El id asociado a la clase
	 */
	public String getId() {
		return id;
	}

	/**
	 * Metodo encargado de modificar el valor del atributo id
	 * 
	 * @param id El nuevo id a modificar.
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Metodo encargado de retornar el valor del atributo nombre
	 * 
	 * @return El nombre asociado a la clase
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Metodo encargado de modificar el valor del atributo nombre
	 * 
	 * @param nombre El nuevo nombre a modificar.
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Metodo encargado de retornar el valor del atributo editorial
	 * 
	 * @return El editorial asociado a la clase
	 */
	public String getEditorial() {
		return editorial;
	}

	/**
	 * Metodo encargado de modificar el valor del atributo editorial
	 * 
	 * @param editorial El nuevo editorial a modificar.
	 */
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	/**
	 * Metodo encargado de retornar el valor del atributo tematicaEnum
	 * 
	 * @return El tematicaEnum asociado a la clase
	 */
	public TematicaEnum getTematicaEnum() {
		return tematicaEnum;
	}

	/**
	 * Metodo encargado de modificar el valor del atributo tematicaEnum
	 * 
	 * @param tematicaEnum El nuevo tematicaEnum a modificar.
	 */
	public void setTematicaEnum(TematicaEnum tematicaEnum) {
		this.tematicaEnum = tematicaEnum;
	}

	/**
	 * Metodo encargado de retornar el valor del atributo coleccion
	 * 
	 * @return El coleccion asociado a la clase
	 */
	public String getColeccion() {
		return coleccion;
	}

	/**
	 * Metodo encargado de modificar el valor del atributo coleccion
	 * 
	 * @param coleccion El nuevo coleccion a modificar.
	 */
	public void setColeccion(String coleccion) {
		this.coleccion = coleccion;
	}

	/**
	 * Metodo encargado de retornar el valor del atributo numeroPaginas
	 * 
	 * @return El numeroPaginas asociado a la clase
	 */
	public Integer getNumeroPaginas() {
		return numeroPaginas;
	}

	/**
	 * Metodo encargado de modificar el valor del atributo numeroPaginas
	 * 
	 * @param numeroPaginas El nuevo numeroPaginas a modificar.
	 */
	public void setNumeroPaginas(Integer numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}

	/**
	 * Metodo encargado de retornar el valor del atributo precio
	 * 
	 * @return El precio asociado a la clase
	 */
	public BigDecimal getPrecio() {
		return precio;
	}

	/**
	 * Metodo encargado de modificar el valor del atributo precio
	 * 
	 * @param precio El nuevo precio a modificar.
	 */
	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	/**
	 * Metodo encargado de retornar el valor del atributo autores
	 * 
	 * @return El autores asociado a la clase
	 */
	public String getAutores() {
		return autores;
	}

	/**
	 * Metodo encargado de modificar el valor del atributo autores
	 * 
	 * @param autores El nuevo autores a modificar.
	 */
	public void setAutores(String autores) {
		this.autores = autores;
	}

	/**
	 * Metodo encargado de retornar el valor del atributo color
	 * 
	 * @return El color asociado a la clase
	 */
	public Boolean getColor() {
		return color;
	}

	/**
	 * Metodo encargado de modificar el valor del atributo color
	 * 
	 * @param color El nuevo color a modificar.
	 */
	public void setColor(Boolean color) {
		this.color = color;
	}

	/**
	 * Metodo encargado de retornar el valor del atributo fechaVenta
	 * 
	 * @return El fechaVenta asociado a la clase
	 */
	public LocalDate getFechaVenta() {
		return fechaVenta;
	}

	/**
	 * Metodo encargado de modificar el valor del atributo fechaVenta
	 * 
	 * @param fechaVenta El nuevo fechaVenta a modificar.
	 */
	public void setFechaVenta(LocalDate fechaVenta) {
		this.fechaVenta = fechaVenta;
	}

	/**
	 * Metodo encargado de retornar el valor del atributo estadoEnum
	 * 
	 * @return El estadoEnum asociado a la clase
	 */
	public EstadoEnum getEstadoEnum() {
		return estadoEnum;
	}

	/**
	 * Metodo encargado de modificar el valor del atributo estadoEnum
	 * 
	 * @param estadoEnum El nuevo estadoEnum a modificar.
	 */
	public void setEstadoEnum(EstadoEnum estadoEnum) {
		this.estadoEnum = estadoEnum;
	}

	/**
	 * Metodo encargado de retornar el valor del atributo cantidad
	 * 
	 * @return El cantidad asociado a la clase
	 */
	public Long getCantidad() {
		return cantidad;
	}

	/**
	 * Metodo encargado de modificar el valor del atributo cantidad
	 * 
	 * @param cantidad El nuevo cantidad a modificar.
	 */
	public void setCantidad(Long cantidad) {
		this.cantidad = cantidad;
	}

	/**
	 * Método encargado de convertir los datos recibidos en JSON al tipo ComicDTO.
	 * <b>Caso de Uso:</b>
	 * 
	 * @param arg Cadena que representa el objeto complejo JSON.
	 * @return Instancia con los datos recibidos.
	 */
	public static ComicDTO valueOf(String arg) {
		return JsonUtils.valueOf(arg, ComicDTO.class);
	}

	/**
	 * Método encargado de convertir los datos recibidos en ComicDTO al JSON
	 * esperado
	 * 
	 * @param dto DTO
	 * 
	 * @return Json
	 */
	@Override
	public String toString() {
		return JsonUtils.toStringJson(this);
	}

	/**
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	/**
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ComicDTO other = (ComicDTO) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	 }
	
	
	
	public  static List<ComicDTO> CrearComic(){
		/**
		 * Variable de tipo BigDecimal Nota la cree porque no sabia como ingresar el valor de tipo BigDecimal sin que me diera error
		 */
		BigDecimal precio1= new BigDecimal(3200);
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
		comic1.setPrecio(precio1);
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
		comic2.setPrecio(precio1);
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
		comic3.setPrecio(precio1);
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
		comic4.setPrecio(precio1);
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
		comic5.setPrecio(precio1);
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
		comic6.setPrecio(precio1);
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
		comic7.setPrecio(precio1);
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
		comic8.setPrecio(precio1);
		comic8.setAutores("sedio");
		comic8.setColor(true);
		comic8.setEstadoEnum(EstadoEnum.ACTIVO);
		comic8.setCantidad(43l);
		ListaComicDtOCreada.add(comic8);
		
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
			if ( estado.estadoEnum ==EstadoEnum.ACTIVO) 
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
			if ( estado.estadoEnum ==EstadoEnum.INACTIVO) 
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
