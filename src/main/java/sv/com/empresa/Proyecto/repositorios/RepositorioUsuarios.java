package sv.com.empresa.Proyecto.repositorios;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import sv.com.empresa.Proyecto.entidades.Usuarios;

@Repository
@Transactional
public class RepositorioUsuarios {
	@Autowired
	private SessionFactory fabricaSesiones;
	
	public void guardar (Usuarios usuario) {
		fabricaSesiones.getCurrentSession().saveOrUpdate(usuario);
	}
	
	public void eliminar (Usuarios usuario) {
		fabricaSesiones.getCurrentSession().delete(usuario);
	}
	
	public List<Usuarios> listar () {
		return fabricaSesiones.getCurrentSession().createQuery("from Usuarios", Usuarios.class).list();
	}
	
	public Usuarios obtener (Long id) {
		return fabricaSesiones.getCurrentSession().get(Usuarios.class, id);
	}
}