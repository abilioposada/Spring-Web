package sv.com.empresa.Proyecto.repositorios;

import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import sv.com.empresa.Proyecto.entidades.Productos;

@Repository
@Transactional
public class RepositorioProductos {
	@Autowired
	private SessionFactory fabricaSesiones;
	
	public void guardar ( Productos producto )
	{
		fabricaSesiones.getCurrentSession().saveOrUpdate( producto );
	}
	
	public void eliminar ( Productos producto )
	{
		fabricaSesiones.getCurrentSession().delete( producto );
	}
	
	public List<Productos> listar ()
	{
		return fabricaSesiones.getCurrentSession().createQuery( "from Productos", Productos.class ).list();
	}
	
	public Productos obtener ( String codigo )
	{
		return fabricaSesiones.getCurrentSession().get( Productos.class, codigo );
	}
}