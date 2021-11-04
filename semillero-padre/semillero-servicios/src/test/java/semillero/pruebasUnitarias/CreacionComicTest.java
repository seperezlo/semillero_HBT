/**
 * CreacionComicTest.java
 */
package semillero.pruebasUnitarias;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.hbt.semillero.dto.ComicDTO;
import com.hbt.semillero.dto.ConsultaNombrePrecioComicDTO;
import com.hbt.semillero.dto.ResultadoDTO;
import com.hbt.semillero.dto.consultarComicTamanioNombreDTO;
import com.hbt.semillero.ejb.IGestionarComicLocal;
import com.hbt.semillero.enums.EstadoEnum;
import com.hbt.semillero.enums.TematicaEnum;
import junit.framework.Assert;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

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
	
	private final static Logger log = Logger.getLogger(CreacionComicTest.class);
	/**
	 * Metodo encargado de crear los comics
	 * <b>Caso de Uso</b>Semillero 2021
	 * @author SEDIEL
	 * 
	 * @param args
	 */
	public  static List<ComicDTO> crearComic(){
		
		/**
		 * Se crea una lista para almacenar los comics que se crearan
		 */
		List<ComicDTO> ListaComicDtOCreada= new ArrayList<>();
		/**
		 * se instancia un objeto de la clase comicDTO
		 */
		ComicDTO comic1=new ComicDTO();
		comic1.setId(12l);
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
		ListaComicDtOCreada.add(comic1 );
		/**
		 * se instancia un objeto de la clase comicDTO
		 */
		
		ComicDTO comic2=new ComicDTO();
		comic2.setId(13l);
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
		comic3.setId(14l);
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
		comic4.setId(15l);
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
		comic5.setId(16l);
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
		comic6.setId(17l);
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
		comic7.setId(18l);
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
		comic8.setId(19l);
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
		/**
		 * se instancia un objeto de la clase comicDTO
		 */
		
		ComicDTO comic9=new ComicDTO();
		comic9.setId(20l);
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
		/**
		 * se instancia un objeto de la clase comicDTO
		 */
		
		ComicDTO comic10=new ComicDTO();
		comic10.setId(21l);
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
				ListaComicDtOEstadoA.add(estado ); 	
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
	private static List<ComicDTO> verificarComicInactivos( List<ComicDTO> ListaComicDtOCreada) throws Exception{
		List<ComicDTO> listaComicDtOEstadoI= new ArrayList<>();
		for (ComicDTO estado : ListaComicDtOCreada) {
			if ( estado.getEstadoEnum() ==EstadoEnum.INACTIVO) 
				listaComicDtOEstadoI.add(estado);
		}
		try {
			List<ComicDTO> listaComicCreada = crearComic();
			List<ComicDTO> listaComicsActivos = verificarComicActivos(listaComicCreada);
			if (listaComicDtOEstadoI.size() == 4) {
				throw new Exception("Se ha detectado que de" + listaComicCreada.size() + " comics se encontraron que " + 
						listaComicsActivos.size() +  " se encuentran activos y " + listaComicDtOEstadoI.size() );
			}
			
	   }
		 catch (Exception e) {
		    	
		    	
		    }
		return   listaComicDtOEstadoI ;
	}
	/**
	 * 
	 * Metodo encargado de iniciar los log para las pruebas unitarias 
	 * <b>Caso de Uso</b>
	 * @author SEDIEL
	 *
	 */
	@BeforeTest
	public void inicializar() {
		BasicConfigurator.configure(); // Inicializa el logger con una configuracion basica
		log.info(":::::::::::::::::::::::::::: INICIAN PRUEBAS UNITARIAS 1 :::::::::::::::::::::::::::: ");
	}
	/**
	 * 
	 * Metodo encargado de generar la pruebas unitarias 
	 * <b>Caso de Uso</b>semillero 2021
	 * @author SEDIEL
	 *
	 */
	
	@Test
	public  void verificarComicActivosTest() {
		log.info("Inicia ejecucion del metodo verificarComicActivostest");
		 try {
			// se intancia un metodo crear comic 
			 List<ComicDTO> listaComicCreada= crearComic();
			 //verifica que la lista creada con los comics no este vavia
			 Assert.assertNotNull(listaComicCreada);
			//verifica que la lista creada con los comics tenga los 10 objetos
			 Assert.assertEquals(listaComicCreada.size(),10);
			 List<ComicDTO> listaComicsActivos= verificarComicActivos(listaComicCreada);
			 //verifica que la lista creada con los comics activos no este vavia
			 Assert.assertNotNull(listaComicsActivos);
			//verifica que la lista creada con los comics activos tenga los 6 objetos
			 Assert.assertEquals(listaComicsActivos.size(), 6);
			 for (ComicDTO estado : listaComicsActivos) {
				 //verifica que todos los estados de la lista activos si se encuentren activos
				 Assert.assertEquals(estado.getEstadoEnum(), EstadoEnum.ACTIVO); 
				 // imprime los objetos de la lista activa 
				 System.out.println(estado);
			 }
			 
			 log.info("Finaliza la ejecucion del metodo verificarComicActivostest");
	    }
	    catch (Exception e) {
	    	Assert.fail("Se presentaron errores en el test que valida los activos");
	    	
	    }
	}
	@Test
	public void capturaMessageTest() throws Exception {
		log.info("Inicia ejecucion del metodo capturaMessageTest");
		List<ComicDTO> listaComicCreada= crearComic();
		List<ComicDTO> listaComicsActivos= verificarComicActivos(listaComicCreada);
		List<ComicDTO> listaComicsInactivos= verificarComicInactivos(listaComicCreada);
		try {
			if (listaComicsInactivos.size() == 4) {
				throw new Exception("Se ha detectado que de" + listaComicCreada.size() + " comics se encontraron que " + 
						listaComicsActivos.size() +  " se encuentran activos y " + listaComicsInactivos.size() );
			}
			
		} catch (Exception e) {
			
		}
		log.info("Finaliza la ejecucion del metodo capturaMessageTest");	
	}
	@AfterTest
	public void finalizaPruebasUnitarias() {
		log.info(":::::::::::::::::::::::::::: FINALIZAN PRUEBAS UNITARIAS 1 :::::::::::::::::::::::::::: ");
	}
	
	
	/**
	 * 
	 * Metodo encargado de comprobar en la lista, los comic que estan activos
	 * <b>Caso de Uso</b>SEmillero 2021
	 * @author SEDIEL
	 *
	 */
	/**
	@Test 
	public void comprobarListarSoloActivos( ) {
		log.info("Inicia ejecucion del metodo comprobarListarSoloActivos()");
		Assert.assertEquals(EstadoEnum.ACTIVO, EstadoEnum.ACTIVO);
		
		try {
			verificarComicActivos(CrearComic())(EstadoEnum.ACTIVO);
		} catch (Exception e) {
			System.out.println(e.getMessage());	
		}
		
		
		log.info("Finaliza la ejecucion del metodo comprobarListarSoloActivos())");
	}
	/**
	 * 
	 * Metodo encargado de contener la clase main para imprimir los comic activos o inactivos 
	 * <b>Caso de Uso</b>
	 * @author SEDIEL
	 * 
	 * @param args
	 */
	

}
