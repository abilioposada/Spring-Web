package sv.com.empresa.Proyecto.configuracion;

import java.util.Properties;
import javax.sql.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import sv.com.empresa.Proyecto.entidades.Productos;
import sv.com.empresa.Proyecto.entidades.Usuarios;

@Configuration
@EnableTransactionManagement
public class ConfiguradorPersistencia {
	@Bean
	public DataSource obtenerFuenteDatos ()
	{
		DriverManagerDataSource fuenteDatos = new DriverManagerDataSource( "jdbc:mysql://localhost/tienda?serverTimezone=UTC", "root", "Abcd.123" );
		fuenteDatos.setDriverClassName( "com.mysql.cj.jdbc.Driver" );
		return fuenteDatos;
	}
	
	@Bean
	public LocalSessionFactoryBean obtenerFabricaSesiones ()
	{
		LocalSessionFactoryBean fabricaSesiones = new LocalSessionFactoryBean();
		
		Properties propiedades = new Properties();
		propiedades.put( "hibernate.show_sql", "true" );
		propiedades.put( "hibernate.enable_lazy_load_no_trans", "true" );
		fabricaSesiones.setHibernateProperties( propiedades );
		
		fabricaSesiones.setDataSource( obtenerFuenteDatos() );
		fabricaSesiones.setAnnotatedClasses( Usuarios.class, Productos.class );
		return fabricaSesiones;
	}
	
	@Bean
	public HibernateTransactionManager obtenerManejadorTransacciones ()
	{
		HibernateTransactionManager manejadorTransacciones = new HibernateTransactionManager();
		manejadorTransacciones.setSessionFactory( obtenerFabricaSesiones().getObject() );
		return manejadorTransacciones;
	}
}