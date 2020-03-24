package sv.com.empresa.Proyecto.entidades;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Usuarios
{
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	private Long id;
	private String nombre;
	private String usuario;
	private String clave;
	private String rol;
	private String estado;
	
	@OneToMany( cascade = CascadeType.ALL, mappedBy = "idPropietario" )
    private List<Productos> productos;
		
	public Long getId ()
	{
		return id;
	}
	
	public String getNombre ()
	{
		return nombre;
	}
	
	public String getUsuario ()
	{
		return usuario;
	}
	
	public String getClave ()
	{
		return clave;
	}
	
	public String getRol ()
	{
		return rol;
	}
	
	public String getEstado ()
	{
		return estado;
	}
	
	public List<Productos> getProductos ()
	{
		return productos;
	}
	
	public void setId ( Long id )
	{
		this.id = id;
	}
	
	public void setNombre ( String nombre )
	{
		this.nombre = nombre;
	}
	
	public void setUsuario ( String usuario )
	{
		this.usuario = usuario;
	}
	
	public void setClave ( String clave )
	{
		this.clave = clave;
	}
	
	public void setRol ( String rol )
	{
		this.rol = rol;
	}
	
	public void setEstado ( String estado )
	{
		this.estado = estado;
	}
	
	public void setProductosList ( List<Productos> productos )
	{
		this.productos = productos;
	}
}