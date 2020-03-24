package sv.com.empresa.Proyecto.entidades;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Productos
{
	@Id
	private String codigo;
	private String nombre;
	private Double precio;
	private Long cantidad;
	private Date vencimiento;
	private String estado;
	
	@JoinColumn( name = "idPropietario", referencedColumnName = "id" )
    @ManyToOne( optional = false )
    private Usuarios idPropietario;
	
	public String getCodigo ()
	{
		return codigo;
	}

	public String getNombre ()
	{
		return nombre;
	}
	
	public Double getPrecio ()
	{
		return precio;
	}
	
	public Long getCantidad ()
	{
		return cantidad;
	}
	
	public Date getVencimiento ()
	{
		return vencimiento;
	}
	
	public String getEstado ()
	{
		return estado;
	}
	
	public Usuarios getIdPropietario ()
	{
		return idPropietario;
	}

	public void setCodigo ( String codigo )
	{
		this.codigo = codigo;
	}

	public void setNombre ( String nombre )
	{
		this.nombre = nombre;
	}

	public void setPrecio ( Double precio )
	{
		this.precio = precio;
	}
	
	public void setCantidad ( Long cantidad )
	{
		this.cantidad = cantidad;
	}

	public void setVencimiento ( Date vencimiento )
	{
		this.vencimiento = vencimiento;
	}

	public void setEstado ( String estado )
	{
		this.estado = estado;
	}

	public void setIdPropietario ( Usuarios idPropietario )
	{
		this.idPropietario = idPropietario;
	}
}