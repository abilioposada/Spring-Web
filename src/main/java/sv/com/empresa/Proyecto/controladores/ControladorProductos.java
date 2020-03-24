package sv.com.empresa.Proyecto.controladores;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import sv.com.empresa.Proyecto.entidades.Productos;
import sv.com.empresa.Proyecto.repositorios.RepositorioProductos;
import sv.com.empresa.Proyecto.repositorios.RepositorioUsuarios;

@Controller
@RequestMapping( "/productos" )
public class ControladorProductos
{
	@Autowired
	private RepositorioProductos repositorioProductos;
	@Autowired
	private RepositorioUsuarios repositorioUsuarios;
	
	@GetMapping
	public ModelAndView index ()
	{
		return new ModelAndView( "/productos/index.jsp" ).addObject( "listado", repositorioProductos.listar() );
	}
	
	@GetMapping( "/ingresar" )
	public ModelAndView ingresar ()
	{
		return new ModelAndView( "/productos/guardar.jsp" ).addObject( "producto", new Productos() ).addObject( "usuarios", repositorioUsuarios.listar()) ;
	}
	
	@GetMapping( "/editar/{codigo}" )
	public ModelAndView editar ( @PathVariable String codigo )
	{
		return new ModelAndView( "/productos/guardar.jsp" ).addObject( "producto", repositorioProductos.obtener( codigo ) );
	}
	
	@PostMapping( "/guardar" )
	public String guardar ( Productos producto )
	{
		producto.setVencimiento( new Date() );
		repositorioProductos.guardar( producto );
		return "redirect:/productos";
	}
	
	@GetMapping( "/eliminar/{codigo}" )
	public String eliminar ( @PathVariable String codigo )
	{
		repositorioProductos.eliminar( repositorioProductos.obtener( codigo ) );
		return "redirect:/productos";
	}
	
	@GetMapping( "/{codigo}" )
	public ModelAndView detalle ( @PathVariable String codigo )
	{
		return new ModelAndView( "/productos/detalle.jsp" ).addObject( "producto", repositorioProductos.obtener( codigo ) );
	}
}