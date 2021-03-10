package m2i.formation.spring.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import m2i.formation.spring.AppConfig;
import m2i.formation.spring.IMusicien;

public class PrincipalSpring {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext myContext = new AnnotationConfigApplicationContext(AppConfig.class);
		IMusicien myMusicien = myContext.getBean("guitariste", IMusicien.class);
	}

}
