package sv.com.empresa.Proyecto.configuracion;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
@ComponentScan("sv.com.empresa.Proyecto")
public class ConfiguradorMVC implements WebMvcConfigurer { }