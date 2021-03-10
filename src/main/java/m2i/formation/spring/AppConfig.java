package m2i.formation.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ImportResource("classpath:application-context.xml")
@ComponentScan({"m2i.formation.spring.musicien", "m2i.formation.spring.instrument"})
public class AppConfig {
	@Bean
	public IInstrument guitare() {
		return new Guitare();
	}

	@Bean(initMethod="afrerInjection")
	public IMusicien guitariste() {
		return new Guitariste();
	}

}