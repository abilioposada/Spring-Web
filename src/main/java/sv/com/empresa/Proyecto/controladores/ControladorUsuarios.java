package sv.com.empresa.Proyecto.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import sv.com.empresa.Proyecto.entidades.Usuarios;
import sv.com.empresa.Proyecto.repositorios.RepositorioUsuarios;

@Controller
@RequestMapping("/usuarios")
public class ControladorUsuarios
{
	@Autowired
	private RepositorioUsuarios repositorioUsuarios;
	
	@GetMapping
	public ModelAndView index ()
	{
		return new ModelAndView("/usuarios/index.jsp").addObject("listado", repositorioUsuarios.listar());
	}
	
	@GetMapping( "/ingresar" )
	public ModelAndView ingresar ()
	{
		return new ModelAndView("/usuarios/guardar.jsp").addObject("usuario", new Usuarios());
	}
	
	@GetMapping( "/editar/{id}" )
	public ModelAndView editar ( @PathVariable Long id )
	{
		return new ModelAndView("/usuarios/guardar.jsp").addObject("usuario", repositorioUsuarios.obtener(id));
	}
	
	@PostMapping( "/guardar" )
	public String guardar ( Usuarios usuario )
	{
		repositorioUsuarios.guardar(usuario);
		return "redirect:/usuarios";
	}
	
	@GetMapping( "/eliminar/{id}" )
	public String eliminar ( @PathVariable Long id )
	{
		repositorioUsuarios.eliminar(repositorioUsuarios.obtener(id));
		return "redirect:/usuarios";
	}
	
	@GetMapping( "/{id}" )
	public ModelAndView detalle ( @PathVariable Long id )
	{
		return new ModelAndView("/usuarios/detalle.jsp").addObject("usuario", repositorioUsuarios.obtener(id));
	}
}